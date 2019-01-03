package com.jvn.resume.printer;

import com.jvn.resume.Resume;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.io.FilenameUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

@Getter
@Setter
public class VelocityPrinter implements Printer {

  private File template;
  private File out;

  public VelocityPrinter(File template, File out) {
    this.setTemplate(template);
    this.setOut(out);
  }

  @Override
  public void printResume(Resume resume) throws IOException {

    Velocity.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
    Velocity.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
    Velocity.init();

    VelocityEngine ve = new VelocityEngine();
    ve.init();

    Template t = ve.getTemplate(template.getPath());

    VelocityContext context = new VelocityContext();
    context.put("resume", resume);
    context.put("fileName", FilenameUtils.getName(out.getPath()));
    context.put("today", LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE));

    Writer writer = new FileWriter(new File(out.getPath()));

    t.merge(context, writer);

    writer.flush();
    writer.close();

  }
}

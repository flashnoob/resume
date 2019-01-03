package com.jvn;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jvn.resume.LatexResume;
import com.jvn.resume.Resume;
import com.jvn.resume.printer.Printer;
import com.jvn.resume.printer.VelocityPrinter;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class Main {

  public static void main(String[] args) throws Exception {
    File resumeJson = new File("data/JohnVanNoteResume.json");
    ObjectMapper mapper = new ObjectMapper();
    Resume resume = mapper.readValue(FileUtils.readFileToString(resumeJson), LatexResume.class);

    File template = new File("templates/resume.vm");
    File out = new File("out/JohnVanNoteResume.tex");
    Printer printer = new VelocityPrinter(template, out);
    printer.printResume(resume);
  }

}

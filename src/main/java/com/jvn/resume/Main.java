package com.jvn.resume;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.jvn.resume.printer.Printer;
import com.jvn.resume.printer.VelocityPrinter;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class Main {

  private static final String DATA_DIRECTORY = "data";
  private static final String FS = File.separator;
  private static final String JSON_RESUME_FILE = "JohnVanNoteResume.json";
  private static final String XML_RESUME_FILE = "JohnVanNoteResume.xml";

  public static void main(String[] args) throws Exception {

    File resumeJson = new File(DATA_DIRECTORY + FS + JSON_RESUME_FILE);
    ObjectMapper mapper = new ObjectMapper();
    Resume resume = mapper.readValue(FileUtils.readFileToString(resumeJson), LatexResume.class);

    ObjectMapper xmlMapper = new XmlMapper();
    xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
    xmlMapper.writeValue(new File(DATA_DIRECTORY + FS + XML_RESUME_FILE), resume);

    File template = new File("templates/resume.vm");
    File out = new File("out/JohnVanNoteResume.tex");
    Printer printer = new VelocityPrinter(template, out);
    printer.printResume(resume);
  }

}

package com.jvn;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.jvn.resume.LatexResume;
import com.jvn.resume.Resume;
import com.jvn.resume.printer.Printer;
import com.jvn.resume.printer.VelocityPrinter;
import com.jvn.util.FileUtil;

public class Main {

  public static void main(String[] args) throws Exception {
    FileUtil resumeJson = new FileUtil("data/JohnVanNoteResume.json");

    ObjectMapper mapper = new ObjectMapper();
    Resume resume = mapper.readValue(resumeJson.readFileContents(), LatexResume.class);

    FileUtil template = new FileUtil("templates/resume.vm");
    FileUtil out = new FileUtil("out/JohnVanNoteResume.tex");
    Printer printer = new VelocityPrinter(template, out);
    printer.printResume(resume);
  }

}

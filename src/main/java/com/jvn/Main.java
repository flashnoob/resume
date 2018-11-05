package com.jvn;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.jvn.resume.LatexResume;
import com.jvn.resume.Resume;
import com.jvn.resume.printer.Printer;
import com.jvn.resume.printer.VelocityPrinter;
import com.jvn.util.FileUtil;

public class Main {

  public static void main(String[] args) throws Exception {
    FileUtil xml = new FileUtil("data/JohnVanNoteResume.xml");

    XmlMapper mapper = new XmlMapper();
    Resume resume = mapper.readValue(xml.readFileContents(), LatexResume.class);
    System.out.println(resume);

    FileUtil template = new FileUtil("templates/resume.vm");
    FileUtil out = new FileUtil("out/JohnVanNote.tex");
    Printer printer = new VelocityPrinter(template, out);
    printer.printResume(resume);
  }

}

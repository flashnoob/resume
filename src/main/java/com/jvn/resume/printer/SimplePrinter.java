package com.jvn.resume.printer;

import com.jvn.resume.Resume;
import java.io.File;
import java.io.IOException;
import java.io.Writer;

public class SimplePrinter extends Printer {

  private Appendable out;

  public SimplePrinter(Appendable out) {
    this.setOut(out);
  }

  public Appendable getOut() {
    return out;
  }

  public void setOut(Appendable out) {
    this.out = out;
  }

  @Override
  public void printResume(Resume resume) throws IOException {
    this.out.append(resume.toString());
  }

  @Override
  public void close() throws IOException {
    if (out instanceof Writer)
      ((Writer) out).close();
  }
}

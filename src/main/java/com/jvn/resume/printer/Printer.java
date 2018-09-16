package com.jvn.resume.printer;

import com.jvn.resume.Resume;
import java.io.IOException;

public abstract class Printer {

  public abstract void printResume(Resume resume) throws IOException;

  public abstract void close() throws IOException;

}

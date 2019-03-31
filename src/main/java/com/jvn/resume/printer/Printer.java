package com.jvn.resume.printer;

import com.jvn.resume.Resume;
import java.io.IOException;

public interface Printer {

  void printResume(Resume resume) throws IOException;

}

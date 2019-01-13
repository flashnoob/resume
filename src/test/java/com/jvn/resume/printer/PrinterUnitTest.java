package com.jvn.resume.printer;

import com.jvn.resume.Resume;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PrinterUnitTest {

  private Printer printer = new PrinterImplementation();

  @Test
  public void printResume_InInterface_IsCallable() throws Exception {
    printer.printResume(null);
    Assert.assertTrue(((PrinterImplementation) printer).called);
  }

  private class PrinterImplementation implements Printer {

    boolean called = false;

    public void printResume(Resume resume) throws Exception {
      called = true;
    }

  }

}

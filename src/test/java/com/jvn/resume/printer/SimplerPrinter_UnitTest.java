package com.jvn.resume.printer;

import com.google.common.collect.ImmutableList;
import com.jvn.resume.item.Education;
import com.jvn.resume.Resume;
import com.jvn.resume.section.EducationSection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimplerPrinter_UnitTest {

  private SimplePrinter printer;
  private Resume resume;

  private static final String SECTION_TITLE = "Bananas17";

  @BeforeMethod
  private void setup() {
    Education education = new Education();
    education.setName(SECTION_TITLE);
    EducationSection section = new EducationSection();
    section.setSchools(ImmutableList.of(education));
    resume = new Resume();
    resume.setEducationSection(section);
  }

  @Test
  public void printResume_StdOutInput_PrintsResume() throws Exception {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    final PrintStream outDefault = System.out;
    final PrintStream errDefault = System.err;
    final String charSet = StandardCharsets.UTF_8.toString();

    System.setOut(new PrintStream(outContent, false, charSet));
    System.setErr(new PrintStream(errContent, false, charSet));

    printer = new SimplePrinter(System.out);
    printer.printResume(resume);

    String outString = outContent.toString(charSet);
    String errString = errContent.toString(charSet);
    Assert.assertTrue(StringUtils.contains(outString, SECTION_TITLE));
    Assert.assertTrue(errString.isEmpty());

    System.setOut(outDefault);
    System.setErr(errDefault);
  }

  @Test
  public void close_NonWriter_NothingHappens() throws IOException {
    printer = new SimplePrinter(System.out);
    printer.close();
  }

}

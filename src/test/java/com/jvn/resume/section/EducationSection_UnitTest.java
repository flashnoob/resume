package com.jvn.resume.section;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EducationSection_UnitTest {

  @Test
  public void getTitle_NoState_IsEducation() {
    EducationSection section = new EducationSection();
    Assert.assertEquals(section.getTitle(), "Education");
  }

}

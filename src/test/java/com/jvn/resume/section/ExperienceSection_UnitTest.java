package com.jvn.resume.section;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExperienceSection_UnitTest {

  @Test
  public void getTitle_NoState_IsExperience() {
    ExperienceSection section = new ExperienceSection();
    Assert.assertEquals(section.getTitle(), "Experience");
  }

}

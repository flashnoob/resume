package com.jvn.resume.section;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TechnicalSection_UnitTest {

  @Test
  public void getTitle_AnyState_IsTechnicalTools() {
    TechnicalSection section = new TechnicalSection();
    Assert.assertEquals(section.getTitle(), "Technical Tools");
  }

}

package com.jvn.resume.date;

import java.time.Month;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleData_UnitTest {

  private static final SimpleDate DATE = new SimpleDate();

  static {
    DATE.setMonth(Month.AUGUST);
    DATE.setYear(1980);
  }

  @Test
  public void readable_AllFields_PrintsReadableDate() {
    Assert.assertEquals(DATE.readable(), "Aug. 1980");
  }

  @Test
  public void toString_AnyState_PrintsFields() {
    String actualToString = DATE.toString();

    Assert.assertTrue(actualToString.contains("AUGUST"));
    Assert.assertTrue(actualToString.contains("1980"));
  }

}

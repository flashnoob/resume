package com.jvn.resume.date;

import java.time.Month;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DateRange_UnitTest {

  @Test
  public void toString_AnyState_PrintsFields() {
    SimpleDate startDate = new SimpleDate();
    startDate.setMonth(Month.APRIL);
    startDate.setYear(1990);

    SimpleDate endDate = new SimpleDate();
    endDate.setMonth(Month.MARCH);
    endDate.setYear(2019);

    DateRange range = new DateRange();
    range.setStartDate(startDate);
    range.setEndDate(endDate);

    String actualToString = range.toString();

    Assert.assertTrue(actualToString.contains("APRIL"));
    Assert.assertTrue(actualToString.contains("1990"));
    Assert.assertTrue(actualToString.contains("MARCH"));
    Assert.assertTrue(actualToString.contains("2019"));
  }

}

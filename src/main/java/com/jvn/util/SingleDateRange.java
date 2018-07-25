package com.jvn.util;

import java.time.LocalDate;

public class SingleDateRange extends DateRange {

  public SingleDateRange(LocalDate startDate) {
    this.setStartDate(startDate);
  }

}

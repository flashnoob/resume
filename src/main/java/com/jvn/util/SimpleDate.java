package com.jvn.util;

import com.google.common.base.MoreObjects;
import java.time.Month;

public class SimpleDate {

  private Integer year;
  private Month month;

  public SimpleDate() {
  }

  public SimpleDate(Integer year, Month month) {
    this.setYear(year);
    this.setMonth(month);
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public Month getMonth() {
    return month;
  }

  public void setMonth(Month month) {
    this.month = month;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("year", year)
        .add("month", month)
        .toString();
  }
}

package com.jvn.util;

import com.google.common.base.MoreObjects;
import java.time.LocalDate;
import java.util.Objects;

public class DateRange {

  private SimpleDate startDate;
  private SimpleDate endDate;

  public DateRange() {
  }

  public DateRange(SimpleDate startDate, SimpleDate endDate) {
    this.setStartDate(startDate);
    this.setEndDate(endDate);
  }

  public SimpleDate getStartDate() {
    return startDate;
  }

  public void setStartDate(SimpleDate startDate) {
    this.startDate = Objects.requireNonNull(startDate, "startDate cannot be null");
  }

  public SimpleDate getEndDate() {
    return endDate;
  }

  public void setEndDate(SimpleDate endDate) {
    this.endDate = endDate;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("startDate", startDate)
        .add("endDate", endDate)
        .omitNullValues()
        .toString();
  }
}

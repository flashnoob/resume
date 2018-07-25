package com.jvn.util;

import com.google.common.base.MoreObjects;
import java.time.LocalDate;
import java.util.Objects;

public class DateRange {

  private LocalDate startDate;
  private LocalDate endDate;

  public DateRange() {
  }

  public DateRange(LocalDate startDate, LocalDate endDate) {
    this.setStartDate(startDate);
    this.setEndDate(endDate);
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = Objects.requireNonNull(startDate, "startDate cannot be null");
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = Objects.requireNonNull(endDate, "endDate cannot be null");
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

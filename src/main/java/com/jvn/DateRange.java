package com.jvn;

import java.util.Objects;
import org.apache.commons.lang3.builder.ToStringBuilder;

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
    return ToStringBuilder.reflectionToString(this);

  }

}

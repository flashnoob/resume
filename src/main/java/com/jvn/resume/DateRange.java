package com.jvn.resume;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@NoArgsConstructor
public class DateRange {

  private SimpleDate startDate;
  private SimpleDate endDate;

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}

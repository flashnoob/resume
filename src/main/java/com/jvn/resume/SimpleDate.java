package com.jvn.resume;

import java.time.Month;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@NoArgsConstructor
public class SimpleDate {

  private Integer year;
  private Month month;

  public String getReadable() {
    return String.format("%s. %d", StringUtils.left(StringUtils.capitalize(StringUtils.lowerCase(month.toString())), 3), year);
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}

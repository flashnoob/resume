package com.jvn.resume;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@NoArgsConstructor
public class Education {

  private String degree;
  private String name;
  private Address address;
  private String gpa;
  private DateRange tenure;

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}

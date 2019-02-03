package com.jvn.resume;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@NoArgsConstructor
public class Address {

  private String street;
  private String additionalStreet;
  private String city;
  private String state;
  private String zip;

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}

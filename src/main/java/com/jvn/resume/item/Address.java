package com.jvn.resume.item;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Address extends AbstractItem {

  private String street;
  private String additionalStreet;
  private String city;
  private String state;
  private String zip;

}

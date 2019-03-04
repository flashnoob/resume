package com.jvn.resume.item;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Personal extends AbstractItem {

  private String firstName;
  private String lastName;
  private Address address;
  private String phoneNumber;
  private String email;
  private String website;

}

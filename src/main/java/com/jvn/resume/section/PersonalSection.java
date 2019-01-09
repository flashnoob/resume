package com.jvn.resume.section;

import com.jvn.resume.Address;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@NoArgsConstructor
public class PersonalSection extends AbstractSection {

  private String firstName;
  private String lastName;
  private Address address;
  private String phoneNumber;
  private String email;
  private String website;

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}

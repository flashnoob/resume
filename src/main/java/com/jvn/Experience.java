package com.jvn;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@NoArgsConstructor
public class Experience {

  private String title;
  private DateRange tenure;
  private String company;
  private Address address;
  private List<String> technologyUsed;
  private List<String> highlights;

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}

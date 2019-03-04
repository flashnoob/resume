package com.jvn.resume.item;

import com.jvn.resume.date.DateRange;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class Experience extends AbstractItem {

  private String title;
  private DateRange tenure;
  private String company;
  private Address address;
  private List<String> technologyUsed;
  private List<String> highlights;

}

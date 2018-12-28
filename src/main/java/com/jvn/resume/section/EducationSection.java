package com.jvn.resume.section;

import com.jvn.Education;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EducationSection extends AbstractTitledSection {

  private List<Education> schools;

  @Override
  public String getTitle() {
    return "Education";
  }

}

package com.jvn.resume.section;

import com.jvn.resume.item.Education;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EducationSection extends AbstractTitledSection {

  private List<Education> schools;
  public static final String TITLE = "Education";

  @Override
  public String getTitle() {
    return TITLE;
  }

}

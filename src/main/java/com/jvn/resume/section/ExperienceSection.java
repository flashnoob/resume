package com.jvn.resume.section;

import com.jvn.resume.Experience;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ExperienceSection extends AbstractTitledSection {

  private List<Experience> experiences;
  public static final String TITLE = "Experience";

  public String getTitle() {
    return TITLE;
  }

}

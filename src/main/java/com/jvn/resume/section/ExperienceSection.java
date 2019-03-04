package com.jvn.resume.section;

import com.jvn.resume.item.Experience;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class ExperienceSection extends AbstractTitledSection {

  private List<Experience> experiences;
  public static final String TITLE = "Experience";

  public String getTitle() {
    return TITLE;
  }

}

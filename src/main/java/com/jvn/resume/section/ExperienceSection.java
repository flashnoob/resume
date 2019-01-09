package com.jvn.resume.section;

import com.jvn.resume.Experience;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@NoArgsConstructor
public class ExperienceSection extends AbstractTitledSection {

  private List<Experience> experiences;

  public String getTitle() {
    return "Experience";
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}

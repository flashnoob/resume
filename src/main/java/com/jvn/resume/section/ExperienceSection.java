package com.jvn.resume.section;

import com.jvn.Experience;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ExperienceSection extends AbstractTitledSection {

  private List<Experience> experiences;

  public ExperienceSection() {
  }

  public ExperienceSection(List<Experience> experiences) {
    this.setExperiences(experiences);
  }

  public String getTitle() {
    return "Experience";
  }

  public List<Experience> getExperiences() {
    return experiences;
  }

  public void setExperiences(List<Experience> experiences) {
    this.experiences = experiences;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}

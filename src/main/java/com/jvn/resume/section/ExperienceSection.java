package com.jvn.resume.section;

import com.google.common.base.MoreObjects;
import com.jvn.Experience;
import java.util.List;

public class ExperienceSection extends AbstractTitledSection {

  private List<Experience> experiences;

  public ExperienceSection() {
  }

  public ExperienceSection(List<Experience> experiences) {
    this.setExperiences(experiences);
  }

  public String valueOfTitle() {
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
    return MoreObjects.toStringHelper(this)
        .add("experiences", experiences)
        .omitNullValues()
        .toString();
  }
}

package com.jvn.resume.section;

import com.google.common.base.MoreObjects;
import com.jvn.Education;
import java.util.List;

public class EducationSection extends AbstractTitledSection {

  private List<Education> schools;

  public EducationSection() {
  }

  public EducationSection(List<Education> schools) {
    this.setSchools(schools);
  }

  @Override
  public String valueOfTitle() {
    return "Education";
  }

  public List<Education> getSchools() {
    return schools;
  }

  public void setSchools(List<Education> schools) {
    this.schools = schools;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("schools", schools)
        .toString();
  }
}

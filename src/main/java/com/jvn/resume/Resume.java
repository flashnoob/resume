package com.jvn.resume;

import com.google.common.base.MoreObjects;
import com.jvn.resume.section.EducationSection;
import com.jvn.resume.section.ExperienceSection;
import com.jvn.resume.section.PersonalSection;
import com.jvn.resume.section.TechnicalSection;

public class Resume {

  private PersonalSection personalSection;
  private ExperienceSection  experienceSection;
  private EducationSection educationSection;
  private TechnicalSection technicalSection;

  public PersonalSection getPersonalSection() {
    return personalSection;
  }

  public void setPersonalSection(PersonalSection personalSection) {
    this.personalSection = personalSection;
  }

  public ExperienceSection getExperienceSection() {
    return experienceSection;
  }

  public void setExperienceSection(ExperienceSection experienceSection) {
    this.experienceSection = experienceSection;
  }

  public EducationSection getEducationSection() {
    return educationSection;
  }

  public void setEducationSection(EducationSection educationSection) {
    this.educationSection = educationSection;
  }

  public TechnicalSection getTechnicalSection() {
    return technicalSection;
  }

  public void setTechnicalSection(TechnicalSection technicalSection) {
    this.technicalSection = technicalSection;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("personalSection", personalSection)
        .add("experiencesSection", experienceSection)
        .add("educationSection", educationSection)
        .add("technicalSection", technicalSection)
        .toString();
  }
}

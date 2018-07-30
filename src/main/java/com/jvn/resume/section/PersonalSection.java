package com.jvn.resume.section;

import com.google.common.base.MoreObjects;
import com.jvn.Personal;

public class PersonalSection implements Section {

  private Personal personal;

  public PersonalSection() {
  }

  public PersonalSection(Personal personal) {
    this.setPersonal(personal);
  }

  public Personal getPersonal() {
    return personal;
  }

  public void setPersonal(Personal personal) {
    this.personal = personal;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("personal", personal)
        .toString();
  }
}

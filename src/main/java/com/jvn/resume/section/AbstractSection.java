package com.jvn.resume.section;

import org.apache.commons.lang3.builder.ToStringBuilder;

public abstract class AbstractSection implements Section {

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}

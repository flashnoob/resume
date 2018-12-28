package com.jvn.resume.section;

import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;

@NoArgsConstructor
public abstract class AbstractSection {

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}

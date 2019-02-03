package com.jvn.resume;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
@NoArgsConstructor
public class ToolSet {

  private String label;
  private List<String> tools;

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}

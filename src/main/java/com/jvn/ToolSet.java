package com.jvn;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ToolSet {

  private String label;
  private List<String> tools;

  public ToolSet() {
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public List<String> getTools() {
    return tools;
  }

  public void setTools(List<String> tools) {
    this.tools = tools;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}

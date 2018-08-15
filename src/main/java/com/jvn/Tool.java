package com.jvn;

import com.google.common.base.MoreObjects;
import java.util.List;
import java.util.Set;

public class Tool {

  private String label;
  private List<String> toolSet;

  public Tool(){
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public List<String> getToolSet() {
    return toolSet;
  }

  public void setToolSet(List<String> toolSet) {
    this.toolSet = toolSet;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("label", label)
        .add("toolSet", toolSet)
        .toString();
  }
}

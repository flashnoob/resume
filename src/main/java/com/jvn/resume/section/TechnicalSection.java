package com.jvn.resume.section;

import com.google.common.base.MoreObjects;
import com.jvn.Tool;
import java.util.List;

public class TechnicalSection extends AbstractTitledSection {

  private List<Tool> tools;

  public List<Tool> getTools() {
    return tools;
  }

  public void setTools(List<Tool> tools) {
    this.tools = tools;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("tools", tools)
        .toString();
  }

  @Override
  public String valueOfTitle() {
    return "Technical Tools";
  }
}

package com.jvn.resume.section;

import com.jvn.ToolSet;
import java.util.List;

public class TechnicalSection extends AbstractTitledSection {

  private List<ToolSet> toolSet;

  public List<ToolSet> getToolSet() {
    return toolSet;
  }

  public void setToolSet(List<ToolSet> toolSet) {
    this.toolSet = toolSet;
  }

  @Override
  public String getTitle() {
    return "Technical Tools";
  }
}

package com.jvn.resume.section;

import com.jvn.resume.item.ToolSet;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TechnicalSection extends AbstractTitledSection {

  private List<ToolSet> toolSet;
  public static final String TITLE = "Technical Tools";

  @Override
  public String getTitle() {
    return TITLE;
  }

}

package com.jvn.resume.item;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ToolSet extends AbstractItem {

  private String label;
  private List<String> tools;

}

package com.jvn.resume;

import com.fasterxml.jackson.core.util.DefaultIndenter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

public class CustomJsonArrayPrettyPrinter extends DefaultPrettyPrinter {

  public static final CustomJsonArrayPrettyPrinter INSTANCE = new CustomJsonArrayPrettyPrinter();

  public CustomJsonArrayPrettyPrinter() {
    _arrayIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
  }

}

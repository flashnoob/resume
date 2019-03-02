package com.jvn.resume;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Properties;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ResumeProperties {

  private Properties properties;

  public static final String PROP_FILE_NAME = "filename";
  public static final String PROP_FILE_TYPE = "filetype";
  public static final String PROP_OUTPUT_FILE_NAME = "outputfilename";
  public static final String PROP_TEMPLATE_FILE_NAME = "templatefilename";

  public ResumeProperties(String filePath) throws IOException {
    this(new File(filePath));
  }

  public ResumeProperties(File file) throws IOException {
    properties = new Properties();
    try (FileInputStream propInput = new FileInputStream(file)) {
      properties.load(propInput);
    }
  }

  public String getFileName() {
    return getRequiredProperty(PROP_FILE_NAME);
  }

  public String getFileType() {
    return getRequiredProperty(PROP_FILE_TYPE);
  }

  public String getOutputFileName() {
    return getRequiredProperty(PROP_OUTPUT_FILE_NAME);
  }

  public String getTemplateFileName() {
    return getRequiredProperty(PROP_TEMPLATE_FILE_NAME);
  }

  private String getRequiredProperty(String key) {
    String value = properties.getProperty(key);
    if (StringUtils.isEmpty(value)) {
      throw new InvalidParameterException(String.format("Property %s is required and has no value.", key));
    }
    return value;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}

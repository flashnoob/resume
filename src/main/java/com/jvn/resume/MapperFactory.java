package com.jvn.resume;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MapperFactory {

  public static ObjectMapper getMapper(String filetype) {
    FileType type = FileType.fromType(filetype);
    if (type == null) {
      throw new IllegalArgumentException(String.format("File Type %s does not match a supported format: %s.", filetype, Arrays.asList(FileType.values())));
    }
    return getMapper(type);
  }

  public static List<FileType> getOtherTypes(String filetype) {
    FileType type = FileType.fromType(filetype);
    List<FileType> otherTypes = new ArrayList<>(Arrays.asList(FileType.values()));
    otherTypes.remove(type);
    return otherTypes;
  }

  private static ObjectMapper getMapper(FileType type) {
    ObjectMapper mapper;
    switch (type) {
      case JSON:
        mapper = new ObjectMapper();
        mapper.setDefaultPrettyPrinter(CustomJsonArrayPrettyPrinter.INSTANCE);
        break;
      case XML:
        mapper = new XmlMapper();
        break;
      default:
        throw new IllegalArgumentException(String.format("No behavior defined for file type %s.", type));
    }

    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    return mapper;
  }


  @Getter
  public enum FileType {
    XML("xml"),
    JSON("json");

    private String type;

    FileType(String type) {
      this.type = type;
    }

    public static FileType fromType(String filetype) {
      FileType theType = null;
      for (FileType type : FileType.values()) {
        if (StringUtils.equalsIgnoreCase(type.getType(), filetype)) {
          theType = type;
        }
      }
      return theType;
    }

    @Override
    public String toString() {
      return ToStringBuilder.reflectionToString(this);
    }
  }

}

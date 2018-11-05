package com.jvn.util;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileUtil {

  private String filePath;

  private static final Charset DEF_CHAR_SET = StandardCharsets.UTF_8;
  private static final String LS = System.lineSeparator();

  public FileUtil(String filePath) {
    this.setFilePath(filePath);
  }

  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public String readFileContents() throws IOException {
    StringBuilder contents = new StringBuilder();

    try (Stream<String> stream = Files.lines(Paths.get(filePath), DEF_CHAR_SET)) {
      stream.forEach(s -> contents.append(s).append(LS));
    }

    return contents.toString();
  }

  public void writeFileContents(String contents) throws IOException {
    Files.write(Paths.get(filePath), contents.getBytes(DEF_CHAR_SET));
  }

}

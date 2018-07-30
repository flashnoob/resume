package com.jvn;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.jvn.resume.Resume;
import com.jvn.util.DateRange;
import com.jvn.util.SimpleDate;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Month;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) throws Exception {
    XmlMapper xmlMapper1 = new XmlMapper();
    SimpleDate date = new SimpleDate(2018, Month.MARCH);
    Experience experience = new Experience();
    experience.setTenure(new DateRange(date, null));
    System.out.println(xmlMapper1.writeValueAsString(experience));


    XmlMapper xmlMapper = new XmlMapper();
    Resume deserializedResume = xmlMapper.readValue(readFileContents("data/JohnVanNoteResume.xml"), Resume.class);
    System.out.println(deserializedResume);

  }

  private static String readFileContents(String filePath) throws IOException {
    StringBuilder contents = new StringBuilder();

    try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
      stream.forEach(s -> contents.append(s).append("\n"));
    }

    return contents.toString();
  }

}

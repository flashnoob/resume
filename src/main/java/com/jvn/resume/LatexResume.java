package com.jvn.resume;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LatexResume extends Resume {

  private Theme theme;
  private FontSize fontSize;
  private FontFamily fontFamily;
  private PaperSize paperSize;
  private Color color;

  public enum FontSize {
    TEN("10pt"),
    ELEVEN("11pt"),
    TWELVE("12pt");

    private @Getter @Setter String name;

    FontSize(String name) {
      this.setName(name);
    }
  }

  public enum FontFamily {
    SANS("sans"),
    ROMAN("roman");

    private @Getter @Setter String name;

    FontFamily(String name) {
      this.setName(name);
    }
  }

  public enum PaperSize {
    A4("a4paper"),
    A5("a5paper"),
    EXECUTIVE("executivepaper"),
    LANDSCAPE("landscape"),
    LEGAL("legalpaper"),
    LETTER("letterpaper");

    private @Getter @Setter String name;

    PaperSize(String name) {
      this.setName(name);
    }
  }

  public enum Theme {
    CASUAL("casual"),
    CLASSIC("classic"),
    OLDSTYLE("oldstyle"),
    BANKING("banking");

    private @Getter @Setter String name;

    Theme(String name) {
      this.setName(name);
    }
  }

  public enum Color {
    BLUE("blue"),
    ORANGE("orange"),
    GREEN("green"),
    RED("red"),
    PURPLE("purple"),
    GREY("grey"),
    BLACK("black");

    private @Getter @Setter String name;

    Color(String name) {
      this.setName(name);
    }
  }

}

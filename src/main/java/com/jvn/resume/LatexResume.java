package com.jvn.resume;

public class LatexResume extends Resume {

  private Theme theme;
  private FontSize fontSize;
  private FontFamily fontFamily;
  private PaperSize paperSize;
  private Color color;

  public Theme getTheme() {
    return theme;
  }

  public void setTheme(Theme theme) {
    this.theme = theme;
  }

  public FontSize getFontSize() {
    return fontSize;
  }

  public void setFontSize(FontSize fontSize) {
    this.fontSize = fontSize;
  }

  public FontFamily getFontFamily() {
    return fontFamily;
  }

  public void setFontFamily(FontFamily fontFamily) {
    this.fontFamily = fontFamily;
  }

  public PaperSize getPaperSize() {
    return paperSize;
  }

  public void setPaperSize(PaperSize paperSize) {
    this.paperSize = paperSize;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public enum FontSize {
    TEN("10pt"),
    ELEVEN("11pt"),
    TWELVE("12pt");

    private String name;

    private FontSize(String name) {
      this.setName(name);
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  public enum FontFamily {
    SANS("sans"),
    ROMAN("roman");

    private String name;

    private FontFamily(String name) {
      this.setName(name);
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  public enum PaperSize {
    A4("a4paper"),
    A5("a5paper"),
    EXECUTIVE("executivepaper"),
    LANDSCAPE("landscape"),
    LEGAL("legalpaper"),
    LETTER("letterpaper");

    private String name;

    private PaperSize(String name) {
      this.setName(name);
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  public enum Theme {
    CASUAL("casual"),
    CLASSIC("classic"),
    OLDSTYLE("oldstyle"),
    BANKING("banking");

    private String name;

    private Theme(String name) {
      this.setName(name);
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
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

    private String name;

    private Color(String name) {
      this.setName(name);
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

}

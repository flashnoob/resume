package com.jvn;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Experience {

  private String title;
  private DateRange tenure;
  private String company;
  private Address address;
  private List<String> technologyUsed;
  private List<String> highlights;

  public Experience() {
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public DateRange getTenure() {
    return tenure;
  }

  public void setTenure(DateRange tenure) {
    this.tenure = tenure;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public List<String> getTechnologyUsed() {
    return technologyUsed;
  }

  public void setTechnologyUsed(List<String> technologyUsed) {
    this.technologyUsed = technologyUsed;
  }

  public List<String> getHighlights() {
    return highlights;
  }

  public void setHighlights(List<String> highlights) {
    this.highlights = highlights;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}

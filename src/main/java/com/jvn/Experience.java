package com.jvn;

import com.google.common.base.MoreObjects;
import com.jvn.util.DateRange;
import java.util.List;

public class Experience {

  private String title;
  private DateRange tenure;
  private String company;
  private Address companyAddress;
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

  public Address getCompanyAddress() {
    return companyAddress;
  }

  public void setCompanyAddress(Address companyAddress) {
    this.companyAddress = companyAddress;
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
    return MoreObjects.toStringHelper(this)
        .add("title", title)
        .add("tenure", tenure)
        .add("company", company)
        .add("companyAddress", companyAddress)
        .add("technologyUsed", technologyUsed)
        .add("highlights", highlights)
        .omitNullValues()
        .toString();
  }

}

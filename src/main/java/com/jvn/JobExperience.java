package com.jvn;

import com.google.common.base.MoreObjects;
import com.jvn.util.DateRange;
import java.util.List;

public class JobExperience implements Experience {

  private final String title;
  private final DateRange tenure;
  private final String company;
  private final Address companyAddress;
  private final List<String> technologyUsed;
  private final List<String> highlights;

  private JobExperience(JobExperienceBuilder builder) {
    this.title = builder.title;
    this.tenure = builder.tenure;
    this.company = builder.company;
    this.companyAddress = builder.companyAddress;
    this.technologyUsed = builder.technologyUsed;
    this.highlights = builder.highlights;
  }

  public String getTitle() {
    return title;
  }

  public DateRange getTenure() {
    return tenure;
  }

  public String getCompany() {
    return company;
  }

  public Address getCompanyAddress() {
    return companyAddress;
  }

  public List<String> getTechnologyUsed() {
    return technologyUsed;
  }

  public List<String> getHighlights() {
    return highlights;
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

  public static class JobExperienceBuilder {

    private String title;
    private DateRange tenure;
    private String company;
    private Address companyAddress;
    private List<String> technologyUsed;
    private List<String> highlights;

    public JobExperienceBuilder title(String title) {
      this.title = title;
      return this;
    }

    public JobExperienceBuilder tenure(DateRange tenure) {
      this.tenure = tenure;
      return this;
    }

    public JobExperienceBuilder company(String company) {
      this.company = company;
      return this;
    }

    public JobExperienceBuilder companyAddress(Address companyAddress) {
      this.companyAddress = companyAddress;
      return this;
    }

    public JobExperienceBuilder technologyUsed(List<String> technologyUsed) {
      this.technologyUsed = technologyUsed;
      return this;
    }

    public JobExperienceBuilder highlights(List<String> highlights) {
      this.highlights = highlights;
      return this;
    }

    public JobExperience build() {
      return new JobExperience(this);
    }

  }

}

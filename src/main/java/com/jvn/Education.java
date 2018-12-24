package com.jvn;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Education {

  private String degree;
  private String name;
  private Address address;
  private String gpa;
  private DateRange tenure;

  public Education() {
  }

  public String getDegree() {
    return degree;
  }

  public void setDegree(String degree) {
    this.degree = degree;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public String getGpa() {
    return gpa;
  }

  public void setGpa(String gpa) {
    this.gpa = gpa;
  }

  public DateRange getTenure() {
    return tenure;
  }

  public void setTenure(DateRange tenure) {
    this.tenure = tenure;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}

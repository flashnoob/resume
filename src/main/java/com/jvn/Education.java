package com.jvn;

import com.google.common.base.MoreObjects;
import com.jvn.util.DateRange;

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
    return MoreObjects.toStringHelper(this)
        .add("degree", degree)
        .add("name", name)
        .add("address", address)
        .add("gpa", gpa)
        .add("tenure", tenure)
        .toString();
  }
}

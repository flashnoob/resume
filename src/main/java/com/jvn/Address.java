package com.jvn;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Address {

  private String street;
  private String additionalStreet;
  private String city;
  private String state;
  private String zip;

  public Address() {
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getAdditionalStreet() {
    return additionalStreet;
  }

  public void setAdditionalStreet(String additionalStreet) {
    this.additionalStreet = additionalStreet;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}

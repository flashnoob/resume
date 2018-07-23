package com.jvn;

import com.google.common.base.MoreObjects;

public class Address {

  private final String street;
  private final String additionalStreet;
  private final String city;
  private final String state;
  private final String zip;

  private Address(AddressBuilder builder) {
    this.street = builder.street;
    this.additionalStreet = builder.additionalStreet;
    this.city = builder.city;
    this.state = builder.state;
    this.zip = builder.zip;
  }

  public String getStreet() {
    return street;
  }

  public String getAdditionalStreet() {
    return additionalStreet;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public String getZip() {
    return zip;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("street", street)
        .add("additionalStreet", additionalStreet)
        .add("city", city)
        .add("state", state)
        .add("zip", zip)
        .omitNullValues()
        .toString();
  }

  public static class AddressBuilder {

    private String street;
    private String additionalStreet;
    private String city;
    private String state;
    private String zip;

    public AddressBuilder() {
    }

    public AddressBuilder street(String street) {
      this.street = street;
      return this;
    }

    public AddressBuilder additionalStreet(String additionalStreet) {
      this.additionalStreet = additionalStreet;
      return this;
    }

    public AddressBuilder city(String city) {
      this.city = city;
      return this;
    }

    public AddressBuilder state(String state) {
      this.state = state;
      return this;
    }

    public AddressBuilder zip(String zip) {
      this.zip = zip;
      return this;
    }

    public Address build() {
      return new Address(this);
    }

  }

}

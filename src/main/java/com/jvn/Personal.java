package com.jvn;

import com.google.common.base.MoreObjects;

public class Personal {

  private final String firstName;
  private final String lastName;
  private final Address address;
  private final String phoneNumber;
  private final String email;
  private final String website;

  private Personal(PersonalBuilder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.address = builder.address;
    this.phoneNumber = builder.phoneNumber;
    this.email = builder.email;
    this.website = builder.website;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Address getAddress() {
    return address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getEmail() {
    return email;
  }


  public String getWebsite() {
    return website;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("firstName", firstName)
        .add("lastName", lastName)
        .add("address", address)
        .add("phoneNumber", phoneNumber)
        .add("email", email)
        .add("website", website)
        .omitNullValues()
        .toString();
  }

  public static class PersonalBuilder {
    private String firstName;
    private String lastName;
    private Address address;
    private String phoneNumber;
    private String email;
    private String website;

    public PersonalBuilder(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }

    public PersonalBuilder address(Address address) {
      this.address = address;
      return this;
    }

    public PersonalBuilder phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public PersonalBuilder email(String email) {
      this.email = email;
      return this;
    }

    public PersonalBuilder website(String website) {
      this.website = website;
      return this;
    }

    public Personal build() {
      return new Personal(this);
    }

  }

}

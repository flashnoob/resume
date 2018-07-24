package com.jvn;

import com.jvn.Address.AddressBuilder;
import com.jvn.resume.Resume;
import com.jvn.resume.section.PersonalSection;

public class Main {

  public static void main(String[] args) {
    Address address = new Address.AddressBuilder()
        .street("6210 Belcrest Road")
        .additionalStreet("Apt. 1438")
        .city("Hyattsville")
        .state("MD")
        .zip("20782")
        .build();
    System.out.println(address);
    Personal personal = new Personal.PersonalBuilder("John", "Van Note")
        .address(address)
        .phoneNumber("215.518.0823")
        .email("johnlvannote@protonmail.com")
        .website("https://github.com/JohnVanNote").build();
    System.out.println(personal);

    PersonalSection personalSection = new PersonalSection(personal);
    System.out.println(personalSection);

    Resume resume = new Resume();

  }

}

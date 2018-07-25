package com.jvn;

import com.google.common.collect.ImmutableList;
import com.jvn.resume.Resume;
import com.jvn.resume.section.PersonalSection;
import com.jvn.util.SingleDateRange;
import java.time.LocalDate;
import java.time.Month;

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


    Experience sila = new JobExperience.JobExperienceBuilder()
        .title("Software Engineer")
        .tenure(new SingleDateRange(LocalDate.of(2018, Month.MARCH, 1)))
        .company("Sila Solutions Group")
        .companyAddress(new Address.AddressBuilder().city("Arlington").state("VA").build())
        .technologyUsed(ImmutableList.of("Java", "Apache Tomcat 1.7"))
        .highlights(ImmutableList.of(
            "Installed and implemented SailPoint’s IdentityIQ and IdentityNow on client sites with custom integrations and configuration management.",
            "Developed a custom integration between IdentityIQ and an external ticketing service to perform user actions (account creation, account removal, access requests) for external systems."
        ))
        .build();

    System.out.println(sila);

    Resume resume = new Resume();

  }

}

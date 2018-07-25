package com.jvn;

import com.google.common.collect.ImmutableList;
import com.jvn.resume.Resume;
import com.jvn.resume.section.ExperienceSection;
import com.jvn.resume.section.PersonalSection;
import com.jvn.util.DateRange;
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

    Experience csc = new JobExperience.JobExperienceBuilder()
        .title("Software Support Engineer")
        .tenure(new DateRange(LocalDate.of(2017, Month.FEBRUARY, 1), LocalDate.of(2018, Month.MARCH, 1)))
        .company("Corporation Service Company")
        .companyAddress(new Address.AddressBuilder().city("Wilmington").state("DE").build())
        .technologyUsed(ImmutableList.of("Java", "Groovy"))
        .highlights(ImmutableList.of(
            "Designed and developed a Groovy-based application, which automated a previously manually-compiled\n monthly application performance index. This aggregated data from multiple reporting tools leveraging the Splunk SDK for Java and reading from an Oracle 11g database backend.",
            "Engineered and supported the implementation of enterprise ETL and Business Intelligence Reporting tools across four environments, spanning more than fourteen application servers. Participated in planning, configuration, and troubleshooting of all server related issues."
        ))
        .build();

    System.out.println(csc);

    ExperienceSection experienceSection = new ExperienceSection(ImmutableList.of(sila, csc));

    System.out.println(experienceSection);

    Resume resume = new Resume();

  }

}

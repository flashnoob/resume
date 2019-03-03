package com.jvn.resume.item;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Address_UnitTest {

  @Test
  public void toString_AnyState_PrintsFields() {
    Address address = new Address();
    address.setStreet("123 Blue Street");
    address.setAdditionalStreet("Apt. 456");
    address.setCity("Red City");
    address.setState("Yellow State");
    address.setZip("98765");

    String actualToString = address.toString();
    Assert.assertTrue(actualToString.contains("123 Blue Street"));
    Assert.assertTrue(actualToString.contains("Apt. 456"));
    Assert.assertTrue(actualToString.contains("Red City"));
    Assert.assertTrue(actualToString.contains("Yellow State"));
    Assert.assertTrue(actualToString.contains("98765"));
  }

}

package com.jvn.resume.item;

import org.testng.annotations.Test;
import test.util.ToStringUtil;

public class Personal_UnitTest {

  @Test
  public void toString_AnyState_PrintsFields() {
    Address address = Address.builder().city("America").build();

    Personal personal = new Personal();
    personal.setAddress(address);
    personal.setEmail("captain@hotmail.com");
    personal.setFirstName("Steve");
    personal.setLastName("Rogers");
    personal.setPhoneNumber("1-800-USA");
    personal.setWebsite("www.usa.us");

    ToStringUtil.assertToStringContains(personal.toString(),
        "America",
        "captain@hotmail.com", "Steve", "Rogers", "1-800-USA", "www.usa.us"
    );
  }

}

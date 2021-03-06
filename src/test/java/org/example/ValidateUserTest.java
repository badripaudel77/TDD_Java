package org.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

/*
 TDD :
 1) Fail  the test
 2) Pass the test
 3) Refactor
 4) Repeat

*/

public class ValidateUserTest {

    @Test
    public void validateUser() {
        int age = 18;
        String name = "John";
        String phoneNumber = "+9771234567890";

        UserValidator userValidator = new UserValidator();

        boolean isUserValid = userValidator.validateUser(age, name, phoneNumber);

        Assert.assertEquals(true, isUserValid); // expected : true, actual : isUserValid

    }

   // @Test // fail the test first
    @Test(expected = NullPointerException.class)
    public void validateUserWhenOneFieldIsEmpty() {
        int age = 33;
        String name = "";
        String phoneNumber = "+9771234567890";

        UserValidator userValidator = new UserValidator();
        boolean isUserValid = userValidator.validateUser(age, name, phoneNumber);
        Assert.assertEquals(true, isUserValid);
    }

     // @Test // fail the test first
     @Test(expected = RuntimeException.class)
    public void validateUserWhenInvalidInput() {
        int age = -12;
        String name = "John";
        String phoneNumber = "+97712345678JR";

        UserValidator userValidator = new UserValidator();
        boolean isUserValid = userValidator.validateUser(age, name, phoneNumber);
        Assert.assertEquals(true, isUserValid);
    }
}

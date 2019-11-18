package com.example.test_suites;

import org.testng.annotations.*;
import com.example.Actionwords;

public class RegisterTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void registerNewAccount() {
        actionwords.clickOnLinkText("» Logout");
        actionwords.clickOnLinkText("Register");
        actionwords.fillUpRegistrationForm("4over Test", "Keyser", "Söze");
    }
}
package com.example.test_suites;

import org.testng.annotations.*;
import com.example.Actionwords;

public class LoginTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }
    public void usernameCaseSensetivityCheck(String email) {
        // Tags: Smoke
        actionwords.clickOnLinkText("» Logout");
        actionwords.login(String.format("%s", email), "4over123", "Your Workspace");
    }

    @Test
    public void usernameCaseSensetivityCheckTest1() {
        usernameCaseSensetivityCheck("joycet@4over.com");
    }

    @Test
    public void usernameCaseSensetivityCheckTest2() {
        usernameCaseSensetivityCheck("JOYCET@4OVER.COM");
    }

    @Test
    public void usernameCaseSensetivityCheckTest3() {
        usernameCaseSensetivityCheck("Joycet@4Over.com");
    }

    @Test
    public void usernameCaseSensetivityCheckTest4() {
        usernameCaseSensetivityCheck("JoYcEt@4oVeR.CoM");
    }

    @Test
    public void usernameCaseSensetivityCheckTest5() {
        usernameCaseSensetivityCheck("jOyCeT@4OvEr.cOm");
    }

    @Test
    public void usernameCaseSensetivityCheckTest6() {
        usernameCaseSensetivityCheck("joycet@4OVER.com");
    }

    @Test
    public void usernameCaseSensetivityCheckTest7() {
        usernameCaseSensetivityCheck("JOYCET@4over.com");
    }


    public void incorrectPassword(String password) {
        actionwords.clickOnLinkText("» Logout");
        actionwords.login("joycet@4over.com", String.format("%s", password), "There was an internal error processing your request. Please contact support.");
    }

    @Test
    public void incorrectPasswordTest1() {
        incorrectPassword("4OVER123");
    }

    @Test
    public void incorrectPasswordTest2() {
        incorrectPassword("4OvER123");
    }

    @Test
    public void incorrectPasswordTest3() {
        incorrectPassword("4oVeR123");
    }

    @Test
    public void incorrectPasswordTest4() {
        incorrectPassword("4OVer123");
    }

    @Test
    public void incorrectPasswordTest5() {
        incorrectPassword("4ovER123");
    }



    @Test
    public void 4overcomRedirect() {
        actionwords.clickOnLinkText("Go to 4over.com");
        actionwords.switchToWindowWindowNameThatContainsExpected("4over, LLC | Super Trade Printer", "Logout");
    }
}
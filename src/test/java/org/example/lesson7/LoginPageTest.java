package org.example.lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.qameta.allure.*;



public class LoginPageTest extends AbstractTest {

    @Test
    @DisplayName("Login TEST")
    @Description("The login process testing")
    @Severity(SeverityLevel.CRITICAL)
    void user_login() {

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage
                .clickLoginButton()
                .sendKeysUsername()
                .sendKeysPassword()
                .clickLoginSubmitButton();
        Assertions.assertEquals("http://selenium1py.pythonanywhere.com/ru/", getWebDriver().getCurrentUrl());

    }

    @Test
    @DisplayName("Login TEST")
    @Description("The logout process testing")
    @Severity(SeverityLevel.CRITICAL)
    void user_logout() {

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage
                .clickLoginButton()
                .sendKeysUsername()
                .sendKeysPassword()
                .clickLoginSubmitButton()
                .clickLogoutButton();
        Assertions.assertEquals("http://selenium1py.pythonanywhere.com/ru/", getWebDriver().getCurrentUrl());

    }
}

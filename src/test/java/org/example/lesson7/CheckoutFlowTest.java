package org.example.lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.qameta.allure.*;



public class CheckoutFlowTest extends AbstractTest {

    @Test
    @DisplayName("Checkout TEST")
    @Description("The testing of the full checkout process")
    @Severity(SeverityLevel.CRITICAL)
    void user_checkout() {
        CheckoutFlow checkoutFlow = new CheckoutFlow(getWebDriver());
        checkoutFlow
                .clickLoginButton()
                .sendKeysUsername()
                .sendKeysPassword()
                .clickLoginSubmitButton()
                .clickBooksButton()
                .clickCodersAtWork()
                .clickAddToBasket()
                .clickBasketButton()
                .clickCheckoutButton()
                .sendKeysFirstName()
                .sendKeysLastName()
                .sendKeysAddress()
                .sendKeysTown()
                .sendKeysPostcode()
                .clickCountryDropdownButton()
                .clickCountryRussianFederation()
                .clickContinueButton();
        Assertions.assertEquals("http://selenium1py.pythonanywhere.com/ru/checkout/payment-details/", getWebDriver().getCurrentUrl());
    }
}

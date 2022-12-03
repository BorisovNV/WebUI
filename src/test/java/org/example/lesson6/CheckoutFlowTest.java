package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CheckoutFlowTest extends AbstractTest {

    @Test
    @DisplayName("Checkout TEST")
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
                .clickCountryLatvia()
                .clickContinueButton();
        Assertions.assertEquals("http://selenium1py.pythonanywhere.com/ru/checkout/payment-details/", getWebDriver().getCurrentUrl());
    }
}
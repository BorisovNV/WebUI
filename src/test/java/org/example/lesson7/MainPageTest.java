package org.example.lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.qameta.allure.*;

public class MainPageTest extends AbstractTest {

    @Test
    @DisplayName("Review TEST")
    @Description("The user sending a review testing")
    @Severity(SeverityLevel.CRITICAL)
    void user_review() {

        MainMenu mainMenu = new MainMenu(getWebDriver());
        mainMenu
                .clickStart()
                .clickAllProducts()
                .clickHackingExposedWireless()
                .clickWriteReview();
        Assertions.assertEquals("http://selenium1py.pythonanywhere.com/ru/catalogue/hacking-exposed-wireless_208/reviews/add/#addreview", getWebDriver().getCurrentUrl());
    }

    @Test
    @DisplayName("Basket checkout TEST")
    @Description("The user is checking products in basket")
    @Severity(SeverityLevel.CRITICAL)
    void user_add_to_basket() {

        MainMenu mainMenu = new MainMenu(getWebDriver());
        mainMenu
                .clickBooks()
                .clickCodersAtWork()
                .clickAddToBasket()
                .clickLookInBasket()
                .clickDeleteProduct()
                .clickCodersAtWorkName();
        Assertions.assertEquals("http://selenium1py.pythonanywhere.com/ru/catalogue/coders-at-work_207/", getWebDriver().getCurrentUrl());

    }

    @Test
    @DisplayName("Search TEST")
    @Description("Testing the search field")
    @Severity(SeverityLevel.NORMAL)
    void user_search() {

        MainMenu mainMenu = new MainMenu(getWebDriver());
        mainMenu
                .searchSendKeysBook()
                .clickSearch();
        Assertions.assertEquals("http://selenium1py.pythonanywhere.com/ru/search/?q=book", getWebDriver().getCurrentUrl());

        mainMenu
                .clickSearch()
                .searchClear()
                .searchSendKeysTest1()
                .clickSearch();
        Assertions.assertEquals("http://selenium1py.pythonanywhere.com/ru/search/?q=test1", getWebDriver().getCurrentUrl());

    }
}

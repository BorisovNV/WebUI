package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainPageTest extends AbstractTest {

    @Test
    @DisplayName("Review TEST")
    void user_review() {

        MainMenu mainMenu = new MainMenu(getWebDriver());
        mainMenu
                .clickAllProducts()
                .clickHackingExposedWireless()
                .clickWriteReview();
        Assertions.assertEquals("http://selenium1py.pythonanywhere.com/ru/catalogue/hacking-exposed-wireless_208/reviews/add/#addreview", getWebDriver().getCurrentUrl());
    }

    @Test
    @DisplayName("Basket checkout TEST")
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

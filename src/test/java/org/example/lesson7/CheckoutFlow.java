package org.example.lesson7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class CheckoutFlow extends AbstractPage{

    @FindBy(id = "login_link")
    private WebElement login_button;

    @FindBy(id = "id_login-username")
    private WebElement enter_username;

    @FindBy(id = "id_login-password")
    private WebElement enter_password;

    @FindBy(name = "login_submit")
    private WebElement login_submit_button;

    @FindBy(xpath = "//*[@id='browse']/li/ul/li[4]/a")
    private WebElement books_button;

    @FindBy(linkText = "Coders at Work")
    private WebElement coders_at_work_book;

    @FindBy(css = ".btn-add-to-basket")
    private WebElement product_add_to_basket;

    @FindBy(xpath = "//*[@id='default']/header/div[1]/div/div[2]/span/a")
    private WebElement watch_in_basket;

    @FindBy(xpath = "//*[@id='content_inner']/div[3]/div/div/a")
    private WebElement checkout_start_button;

    @FindBy(id = "id_first_name")
    private WebElement enter_first_name;

    @FindBy(id = "id_last_name")
    private WebElement enter_last_name;

    @FindBy(id = "id_line1")
    private WebElement enter_address;

    @FindBy(id = "id_line4")
    private WebElement enter_town;

    @FindBy(id = "id_postcode")
    private WebElement enter_postcode;

    @FindBy(id = "id_country")
    private WebElement country_dropdown_button;

    @FindBy(xpath = "//*[@id='id_country']/option[182]")
    private WebElement enter_country_Russian_Federation;

    @FindBy(css = ".btn")
    private WebElement continue_button;

    public CheckoutFlow(WebDriver driver){
        super(driver);
    }

    public CheckoutFlow clickLoginButton(){
        login_button.click();
        return this;
    }
    public CheckoutFlow sendKeysUsername(){
        enter_username.sendKeys("n.borisov@inbox.ru");
        return this;
    }

    public CheckoutFlow sendKeysPassword(){
        enter_password.sendKeys("ping-ponG@2");
        return this;
    }

    public CheckoutFlow clickLoginSubmitButton(){
        login_submit_button.click();
        return this;
    }

    public CheckoutFlow clickBooksButton(){
        books_button.click();
        return this;
    }

    public  CheckoutFlow clickCodersAtWork(){
        coders_at_work_book.click();
        return this;
    }

    public CheckoutFlow clickAddToBasket() {
        product_add_to_basket.click();
        return this;
    }

    public CheckoutFlow clickBasketButton() {
        watch_in_basket.click();
        return this;
    }

    public CheckoutFlow clickCheckoutButton() {
        checkout_start_button.click();
        return this;
    }

    public CheckoutFlow sendKeysFirstName(){
        enter_first_name.sendKeys("Nikolay");
        return this;
    }

    public CheckoutFlow sendKeysLastName(){
        enter_last_name.sendKeys("Borisov");
        return this;
    }

    public CheckoutFlow sendKeysAddress(){
        enter_address.sendKeys("Russian Federation");
        return this;
    }

    public CheckoutFlow sendKeysTown(){
        enter_town.sendKeys("Moscow");
        return this;
    }

    public CheckoutFlow sendKeysPostcode(){
        enter_postcode.sendKeys("115597");
        return this;
    }

    public CheckoutFlow clickCountryDropdownButton() {
        country_dropdown_button.click();
        return this;
    }

    public CheckoutFlow clickCountryRussianFederation() {
        enter_country_Russian_Federation.click();
        return this;
    }

    public CheckoutFlow clickContinueButton() {
        continue_button.click();
        return this;
    }
}

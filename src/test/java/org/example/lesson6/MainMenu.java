package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainMenu extends AbstractPage{

    @FindBy(id = "id_q")
    private WebElement search_input;

    @FindBy(id = "id_q")
    private WebElement search_clear;

    @FindBy(css = ".navbar-right > .btn")
    private WebElement search_button;


    @FindBy(xpath = "//*[@id='browse']/li/ul/li[4]/a")
    private WebElement books_button;

    @FindBy(linkText = "Coders at Work")
    private WebElement coders_at_work_book;

    @FindBy(css = ".btn-add-to-basket")
    private WebElement product_add_to_basket;

    @FindBy(css = ".btn-info:nth-child(1)")
    private WebElement product_look_in_basket;

    @FindBy(xpath = "//*[@id='basket_formset']/div/div/div[3]/div[2]/a")
    private WebElement product_delete_product;

    @FindBy(xpath = "//*[@id='basket_formset']/div/div/div[2]/h3/a")
    private WebElement product_name_coders_at_work;

    @FindBy(xpath = "//*[@id='browse']/li/ul/li[1]/a")
    private WebElement all_products_button;

    @FindBy(linkText = "Hacking Exposed Wireless")
    private WebElement hacking_exposed_wireless_book;

    @FindBy(id = "write_review")
    private WebElement write_review_button;


    public MainMenu(WebDriver driver) {
        super(driver);
    }

    public MainMenu clickAllProducts(){
        all_products_button.click();
        return this;
    }

    public MainMenu clickHackingExposedWireless(){
        hacking_exposed_wireless_book.click();
        return this;
    }

    public MainMenu clickWriteReview(){
        write_review_button.click();
        return this;
    }

    public MainMenu searchSendKeysBook(){
        search_input.sendKeys("book");
        return this;
    }

    public MainMenu searchSendKeysTest1(){
        search_input.sendKeys("test1");
        return this;
    }

    public MainMenu searchClear(){
        search_clear.clear();
        return this;
    }

    public MainMenu clickSearch(){
        search_button.click();
        return this;
    }

    public MainMenu clickBooks(){
        books_button.click();
        return this;
    }


    public MainMenu clickCodersAtWork() {
        coders_at_work_book.click();
        return this;
    }

    public MainMenu clickAddToBasket() {
        product_add_to_basket.click();
        return this;
    }

    public MainMenu clickLookInBasket() {
        product_look_in_basket.click();
        return this;
    }

    public MainMenu clickDeleteProduct() {
        product_delete_product.click();
        return this;
    }

    public MainMenu clickCodersAtWorkName() {
        product_name_coders_at_work.click();
        return this;
    }

}


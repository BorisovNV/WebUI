package org.example.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User_Checkout_Test extends Abstract_Start {

    private static Logger logger = LoggerFactory.getLogger(User_Checkout_Test.class);

    @Test
    @DisplayName("Checkout TEST")
    void user_checkout() {

        logger.info("Checkout");
        getDriver().findElement(By.id("login_link")).click();
        getDriver().findElement(By.id("id_login-username")).sendKeys("test@test.lv");
        getDriver().findElement(By.id("id_login-password")).sendKeys("testingtest");
        getDriver().findElement(By.name("login_submit")).click();
        getDriver().findElement(By.xpath("//*[@id='browse']/li/ul/li[4]/a")).click();
        getDriver().findElement(By.linkText("Coders at Work")).click();
        getDriver().findElement(By.cssSelector(".btn-add-to-basket")).click();
        getDriver().findElement(By.xpath("//*[@id='default']/header/div[1]/div/div[2]/span/a")).click();
        getDriver().findElement(By.xpath("//*[@id='voucher_form_link']/a")).click();
        getDriver().findElement(By.xpath("//*[@id='content_inner']/div[3]/div/div/a")).click();
        getDriver().findElement(By.id("id_first_name")).sendKeys("test");
        getDriver().findElement(By.id("id_last_name")).sendKeys("test");
        getDriver().findElement(By.id("id_line1")).sendKeys("testing");
        getDriver().findElement(By.id("id_line4")).sendKeys("riga");
        getDriver().findElement(By.id("id_postcode")).sendKeys("lv-1024");
        getDriver().findElement(By.id("id_country")).click();
        getDriver().findElement(By.xpath("//*[@id='id_country']/option[123]")).click();
        getDriver().findElement(By.cssSelector(".btn")).click();
        Assertions.assertEquals("Введите параметры платежа",
                getDriver().findElement(By.xpath("//*[@id='default']/div/div/div[2]/h1")).getText());

    }
}

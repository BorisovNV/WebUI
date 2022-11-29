package org.example.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User_add_basket_Test extends Abstract_Start{

    private static Logger logger = LoggerFactory.getLogger(User_add_basket_Test.class);

    @Test
    @DisplayName("Basket checkout TEST")
    void user_add_to_basket() {

        logger.info("Basket checkout");
        getDriver().findElement(By.xpath("//*[@id='browse']/li/ul/li[4]/a")).click();
        getDriver().findElement(By.linkText("Coders at Work")).click();
        getDriver().findElement(By.cssSelector(".btn-add-to-basket")).click();
        getDriver().findElement(By.cssSelector(".btn-info:nth-child(1)")).click();
        getDriver().findElement(By.xpath("//*[@id='basket_formset']/div/div/div[3]/div[2]/a")).click();
        Assertions.assertEquals("Coders at Work",
                getDriver().findElement(By.xpath("//*[@id='basket_formset']/div/div/div[2]/h3/a")).getText());

    }
}

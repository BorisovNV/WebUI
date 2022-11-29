package org.example.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Time;


public class Search_Test extends Abstract_Start {
    private static Logger logger = LoggerFactory.getLogger(Search_Test.class);

    @Test
    @DisplayName("Search TEST")
    void user_search() {

        logger.info("Search");
        getDriver().findElement(By.id("id_q")).sendKeys("book");
        getDriver().findElement(By.cssSelector(".navbar-right > .btn")).click();

        Assertions.assertEquals("Товары, соответствующие запросу \"book\"",
                getDriver().findElement(By.xpath("//*[@id='default']/div[2]/div/div/div/div[1]/h1")).getText());

        getDriver().findElement(By.id("id_q")).clear();
        getDriver().findElement(By.id("id_q")).sendKeys("test1");
        getDriver().findElement(By.cssSelector(".navbar-right > .btn")).click();
        Assertions.assertEquals("К сожалению, ничего не найдено.",
                getDriver().findElement(By.xpath("\n" +
                        "//*[@id='default']/div[2]/div/div/div/form/p")).getText());

    }
}


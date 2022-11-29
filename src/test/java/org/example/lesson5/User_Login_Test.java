package org.example.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User_Login_Test extends Abstract_Start {

    private static Logger logger = LoggerFactory.getLogger(User_Login_Test.class);

    @Test
    @DisplayName("Login TEST")
    void user_login() {

        logger.info("Login");
        getDriver().findElement(By.id("login_link")).click();
        getDriver().findElement(By.id("id_login-username")).sendKeys("n.borisov@inbox.ru");
        getDriver().findElement(By.id("id_login-password")).sendKeys("ping-ponG@2");
        getDriver().findElement(By.name("login_submit")).click();
        Assertions.assertEquals("Oscar - Sandbox", getDriver().getTitle());

    }
}

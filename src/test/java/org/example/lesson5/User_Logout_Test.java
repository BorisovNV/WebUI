package org.example.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class User_Logout_Test extends Abstract_Start {

    private static Logger logger = LoggerFactory.getLogger(User_Logout_Test.class);

    @Test
    @DisplayName("Logout TEST")
    void user_logout() {

        getDriver().findElement(By.id("login_link")).click();
        getDriver().findElement(By.id("id_login-username")).sendKeys("n.borisov@inbox.ru");
        getDriver().findElement(By.id("id_login-password")).sendKeys("ping-ponG@2");
        getDriver().findElement(By.name("login_submit")).click();
        Assertions.assertEquals("Oscar - Sandbox", getDriver().getTitle());

        logger.info("Logout");
        getDriver().findElement(By.id("logout_link")).click();
        Assertions.assertEquals("Oscar - Sandbox", getDriver().getTitle());

    }
}

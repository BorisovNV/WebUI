package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Review_test {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("http://selenium1py.pythonanywhere.com");

        WebElement webElement1 = driver.findElement(By.xpath("//*[@id='browse']/li/ul/li[1]/a"));
        webElement1.click();
        Thread.sleep(2000);

        WebElement webElement2 = driver.findElement(By.linkText("Hacking Exposed Wireless"));
        webElement2.click();
        Thread.sleep(2000);

        WebElement webElement3 = driver.findElement(By.id("write_review"));
        webElement3.click();
        Thread.sleep(2000);
        //driver.quit();
    }
}

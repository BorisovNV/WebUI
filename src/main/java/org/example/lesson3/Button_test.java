package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Button_test {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("http://selenium1py.pythonanywhere.com");

        WebElement webElement1 = driver.findElement(By.xpath("//*[@id='browse']/li/ul/li[4]/a"));
        webElement1.click();
        Thread.sleep(2000);

        WebElement webElement2 = driver.findElement(By.linkText("Coders at Work"));
        webElement2.click();
        Thread.sleep(2000);

        WebElement webElement3 = driver.findElement(By.cssSelector(".btn-add-to-basket"));
        webElement3.click();
        Thread.sleep(2000);

        WebElement webElement4 = driver.findElement(By.cssSelector(".btn-info:nth-child(1)"));
        webElement4.click();
        Thread.sleep(2000);

        WebElement webElement5 = driver.findElement(By.xpath("//*[@id='basket_formset']/div/div/div[3]/div[2]/a"));
        webElement5.click();
        Thread.sleep(2000);
        //driver.quit();
    }
}

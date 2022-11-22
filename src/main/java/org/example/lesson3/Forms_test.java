package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Forms_test {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("http://selenium1py.pythonanywhere.com");

        WebElement webElement1 = driver.findElement(By.id("login_link"));
        webElement1.click();
        Thread.sleep(2000);

        WebElement webElement2 = driver.findElement(By.id("id_login-username"));
        webElement2.sendKeys("test@test.lv");
        Thread.sleep(2000);

        WebElement webElement3 = driver.findElement(By.id("id_login-password"));
        webElement3.sendKeys("testingtest");
        Thread.sleep(2000);

        WebElement webElement4 = driver.findElement(By.name("login_submit"));
        webElement4.click();
        Thread.sleep(2000);

        WebElement webElement5 = driver.findElement(By.xpath("//*[@id='browse']/li/ul/li[4]/a"));
        webElement5.click();
        Thread.sleep(2000);

        WebElement webElement6 = driver.findElement(By.linkText("Coders at Work"));
        webElement6.click();
        Thread.sleep(2000);

        WebElement webElement7 = driver.findElement(By.cssSelector(".btn-add-to-basket"));
        webElement7.click();
        Thread.sleep(2000);

        WebElement webElement8 = driver.findElement(By.xpath("//*[@id='default']/header/div[1]/div/div[2]/span/a"));
        webElement8.click();
        Thread.sleep(2000);

        WebElement webElement9 = driver.findElement(By.xpath("//*[@id='voucher_form_link']/a"));
        webElement9.click();
        Thread.sleep(2000);

        WebElement webElement10 = driver.findElement(By.xpath("//*[@id='content_inner']/div[3]/div/div/a"));
        webElement10.click();
        Thread.sleep(2000);

        WebElement webElement11 = driver.findElement(By.id("id_first_name"));
        webElement11.sendKeys("test");
        Thread.sleep(2000);

        WebElement webElement12 = driver.findElement(By.id("id_last_name"));
        webElement12.sendKeys("test");
        Thread.sleep(2000);

        WebElement webElement13 = driver.findElement(By.id("id_line1"));
        webElement13.sendKeys("testing");
        Thread.sleep(2000);

        WebElement webElement14 = driver.findElement(By.id("id_line4"));
        webElement14.sendKeys("riga");
        Thread.sleep(2000);

        WebElement webElement15 = driver.findElement(By.id("id_postcode"));
        webElement15.sendKeys("lv-1024");
        Thread.sleep(2000);

        WebElement webElement16 = driver.findElement(By.id("id_country"));
        webElement16.click();
        Thread.sleep(2000);

        WebElement webElement17 = driver.findElement(By.xpath("//*[@id='id_country']/option[1]"));
        webElement17.click();
        Thread.sleep(2000);

        WebElement webElement18 = driver.findElement(By.cssSelector(".btn"));
        webElement18.click();
        Thread.sleep(2000);
        //driver.quit();
    }
}

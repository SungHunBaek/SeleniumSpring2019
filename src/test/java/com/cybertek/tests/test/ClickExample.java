package com.cybertek.tests.test;

import com.cybertek.tests.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        String expectedUrl = "http://practice.cybertekschool.com/forgot_password";
        driver.get(expectedUrl);

        WebElement retrieveBtn = driver.findElement(By.id("form_submit"));
        Thread.sleep(1000);
        retrieveBtn.click();

        String url = driver.getCurrentUrl();
        StringUtility.verifyEquals(expectedUrl,url);

    }
}

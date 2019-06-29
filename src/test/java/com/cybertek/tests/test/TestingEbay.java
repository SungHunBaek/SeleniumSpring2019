package com.cybertek.tests.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingEbay {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");
        driver.findElement(By.id("gh-ac")).sendKeys("shoes");
        driver.findElement(By.id("gh-btn")).click();

        WebElement result  = driver.findElement(By.tagName("h1"));
        System.out.println(result.getText());


    }
}

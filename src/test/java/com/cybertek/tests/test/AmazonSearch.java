package com.cybertek.tests.test;

import com.cybertek.tests.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        Thread.sleep(2000);
        String input = "chocolate";
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(input);
        driver.findElement(By.className("nav-input")).click();

        String expected = "Amazon.com: " + input;
        String actual = driver.getTitle();
        StringUtility.verifyEquals(expected,actual);


    }
}

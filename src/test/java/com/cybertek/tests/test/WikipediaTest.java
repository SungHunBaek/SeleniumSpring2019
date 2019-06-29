package com.cybertek.tests.test;

import com.cybertek.tests.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(5000);
        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver");
        Thread.sleep(5000);
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Selenium (software)")).click();
        Thread.sleep(5000);

        String expected = "https://en.wikipedia.org/wiki/Selenium_(software)";
        String actual = driver.getCurrentUrl();
        StringUtility.verifyEquals(expected,actual);

        driver.close();



    }
}

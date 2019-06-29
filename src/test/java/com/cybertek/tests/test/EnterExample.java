package com.cybertek.tests.test;

import com.cybertek.tests.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        Thread.sleep(1000);
        WebElement emailInput = driver.findElement(By.name("email"));
        // sendKeys()  --> enters text on the webelement
        //
        emailInput.sendKeys("randomemail@gmail.com"+ Keys.ENTER);
        Thread.sleep(1000);

        //emailInput.submit(); this do Keys.ENTER function



        // click --> clicks on webelement
        String expected = "http://practice.cybertekschool.com/forgot_password";
        String actual = driver.getCurrentUrl();
        StringUtility.verifyEquals(expected, actual);
    }
}

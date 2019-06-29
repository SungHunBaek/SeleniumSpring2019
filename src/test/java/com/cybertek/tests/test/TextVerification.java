package com.cybertek.tests.test;

import com.cybertek.tests.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextVerification {
    public static void main(String[] args) throws InterruptedException {
        test004();
    }
    public static void test004() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        Thread.sleep(1000);
        WebElement emailInput = driver.findElement(By.name("email"));
        String exp = "randomemail@gmail.com";
        emailInput.sendKeys(exp);
        Thread.sleep(1000);

        System.out.println(emailInput.getAttribute("name"));
        System.out.println(emailInput.getAttribute("type"));

        String act = emailInput.getAttribute("value");
        System.out.println("act = " +act);

        StringUtility.verifyEquals(exp,act);

        // getAttribue("innerHTML") --> if getAttribute(value) does not work, use this one.
        System.out.println(emailInput.getAttribute("innerHTML"));
        // getAttribue("outerHTML") --> returns the HTML of given element
        System.out.println(emailInput.getAttribute("outerHTML"));

        // How to delete text from input field
        emailInput.clear();

    }


    public static void test003() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        Thread.sleep(1000);
        WebElement emailInput = driver.findElement(By.name("email"));
        //sendKeys() = enters text on the webelement
        emailInput.sendKeys("randomemail@gmail.com");

        Thread.sleep(1000);
        WebElement retrieveBtn = driver.findElement(By.id("form_submit"));
        retrieveBtn.click();

        WebElement message = driver.findElement(By.name("confirmation_message"));
        System.out.println(message.getText());

        String exp = "Your e-mail's been sent!";
        String act = message.getText();
        StringUtility.verifyEquals(exp, act);
    }
}

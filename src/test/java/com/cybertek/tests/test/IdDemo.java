package com.cybertek.tests.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdDemo {
    public static void main(String[] args) throws InterruptedException{
        id();
    }
    public  static void id() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");


        WebElement btn6 = driver.findElement(By.id("wooden_spoon"));
        Thread.sleep(1000);
        btn6.click();





    }
}

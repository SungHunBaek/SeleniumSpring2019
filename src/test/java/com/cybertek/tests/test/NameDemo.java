package com.cybertek.tests.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameDemo {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement name = driver.findElement(By.name("full_name"));
        Thread.sleep(2000);
        name.sendKeys("Testing first name");

        WebElement email = driver.findElement(By.name("email"));
        Thread.sleep(2000);
        email.sendKeys("test123@gmail.com");

        //WebElement SignUp = driver.findElement(By.name("wooden_spoon"));
        //SignUp.click();

        driver.findElement(By.name("wooden_spoon")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("wooden_spoon")).click();

    }
}

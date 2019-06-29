package com.cybertek.tests.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/sign_up");

        driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys("Testing");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Testing@gmail.com");
        driver.findElement(By.xpath("//button[@class='radius']")).click();
    }
}

package com.cybertek.tests.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement element = driver.findElement(By.tagName("h2"));
        System.out.println(element.getText());
        Thread.sleep(1000);
        driver.findElement(By.tagName("input")).sendKeys("SungHunBaek");
        Thread.sleep(1000);
        driver.findElement(By.name("email")).sendKeys("MyEmail@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(1000);
        driver.findElement(By.tagName("a")).click();

    }
}

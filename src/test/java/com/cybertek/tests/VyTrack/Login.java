package com.cybertek.tests.VyTrack;
import com.cybertek.tests.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException{
        logoutVyTrack();
    }
    public static void loginVyTrack() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String userName = "storemanager94";
        String login = "UserUser123";
        String expectedUrl = "http://qa3.vytrack.com/";
        String expectedTitle = "Dashboard";
        driver.get("http://qa3.vytrack.com/user/login");
        Thread.sleep(1000);
        driver.findElement(By.id("prependedInput")).sendKeys(userName + Keys.TAB + login);
        Thread.sleep(1000);
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(1000);

        StringUtility.verifyEquals(driver.getCurrentUrl(), expectedUrl);
        StringUtility.verifyEquals(driver.getTitle(), expectedTitle);
    }
    public static void logoutVyTrack() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String userName = "storemanager94";
        String login = "UserUser123";
        String expectedUrl = "http://qa3.vytrack.com/user/login";
        String expectedTitle = "Login";
        driver.get("http://qa3.vytrack.com/user/login");
        Thread.sleep(1000);
        driver.findElement(By.id("prependedInput")).sendKeys(userName+ Keys.TAB+login);
        Thread.sleep(1000);
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(2000);

        driver.findElement(By.className("fa-caret-down")).click();
        Thread.sleep(8000);
        driver.findElement(By.className("last")).click();
        Thread.sleep(5000);
        System.out.println("URL check:");
        StringUtility.verifyEquals(driver.getCurrentUrl(), expectedUrl);
        System.out.println("Title check:");
        StringUtility.verifyEquals(driver.getTitle(), expectedTitle);
    }
}

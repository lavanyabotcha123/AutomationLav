package com.test.demo1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkartjava {

    private static Object wait;

	public static void main(String[] args) throws InterruptedException {
        // Initialize ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        System.out.println("Open the website");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Login']")).click();       
        System.out.println("login");
        Thread.sleep(2000);
        WebElement numInput = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        numInput.click();
        numInput.sendKeys("7563043736");
        WebElement loginButton = driver.findElement(By.id("loginButtonId")); // Ensure this ID matches the button's actual ID
        loginButton.click();
        driver.quit();
       
}
}
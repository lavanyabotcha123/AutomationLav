package com.test.demo1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggy {

    public static void main(String[] args) throws InterruptedException {
        // Initialize ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

       driver.get("https://www.swiggy.com/");
       driver.manage().window().maximize();
       System.out.println("swiggy website launched successfully");
       Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[5]/div/a/span[2]")).click();
       System.out.println("search");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//span[text()='Sign In']")).click();
       System.out.println("sign in option is clicked successfully");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9603043736");
       System.out.println("the mobile number enter sucessfully");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/div/div[3]/a")).click();
       System.out.println("create an account");
       Thread.sleep(3000);
       driver.quit();
       
    }

}

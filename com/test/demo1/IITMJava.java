package com.test.demo1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IITMJava {

    public static void main(String[] args) throws InterruptedException {
        // Initialize ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://iitm.humanbrain.in/");
        driver.manage().window().maximize();
        System.out.println("Open the website");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@href='people.html']\r\n")).click();      
        System.out.println("People");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/a[3]")).click();       
        System.out.println("Highlight");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/a[5]")).click();       
        System.out.println("News and event");
        Thread.sleep(2000);
        driver.quit();
       


	}

}

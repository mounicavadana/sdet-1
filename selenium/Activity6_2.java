package com.sdet.Selenium.Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        Thread.sleep(10000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        Thread.sleep(10000);
        driver.get("https://training-support.net/selenium/ajax");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.findElement(By.xpath("//button[contains(@class, 'violet')]")).click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
        String ajaxText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(ajaxText);
        
        //Wait for late text
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        System.out.println(ajaxText);
        //Get late text and print it
        String lateText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(lateText);

        //Close browser
        driver.close();
    }
}



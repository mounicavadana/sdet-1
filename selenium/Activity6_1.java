package com.sdet.Selenium.Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        Thread.sleep(10000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        Thread.sleep(10000);
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        //Find checkbox and toggle button
    	
        WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
	
        WebElement toggleCheckboxButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
	
        toggleCheckboxButton.click();
	
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
	
        toggleCheckboxButton.click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));
	
        checkbox.click();
        driver.close();
    }

}


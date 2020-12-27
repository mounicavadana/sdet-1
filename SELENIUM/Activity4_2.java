package com.sdet.Selenium.Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	    public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new FirefoxDriver();
	        driver.get("https://www.training-support.net/selenium/simple-form");
	         Thread.sleep(5000);
	        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
	        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
	        WebElement email=driver.findElement(By.xpath("//input[@id = 'email']"));
	        WebElement number=driver.findElement(By.xpath("//input[@id = 'number']"));
	        firstName.sendKeys("Mounika");
	        lastName.sendKeys("y");
	        email.sendKeys("myerragu@in.im.com.com");
	        number.sendKeys("1234567890");

	        driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");

	        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
	        driver.switchTo().alert().accept();
	        driver.close();
	    }
	
}

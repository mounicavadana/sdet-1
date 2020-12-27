package com.sdet.Selenium.Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {


	    public static void main(String[] args) throws InterruptedException {

	        //Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();
	        
	        //And now use this to visit the website
	        driver.get("https://www.training-support.net");
	        Thread.sleep(10000);
	        
	        //Check the title of the page
	        String title = driver.getTitle();
	        //Print the title of the page
	        System.out.println("Page title is: " + title);
	        
	        //Find the About Us link using id()
	        WebElement idLocator = driver.findElement(By.id("about-link"));
	        System.out.println("Text in element: " + idLocator.getText());
	        
	        //Find the About Us link using className()
	        WebElement classNameLocator = driver.findElement(By.className("inverted"));
	        System.out.println("Text in element: " + classNameLocator.getText());
	        
	        //Find the About Us link using cssSelector()
	        WebElement cssLocator = driver.findElement(By.cssSelector("a#about-link"));
	        System.out.println("Text in element: " + cssLocator.getText());
	        
	        WebElement cssLocator1 = driver.findElement(By.cssSelector("#about-link"));
	        System.out.println("Text in element: " + cssLocator1.getText());
	        
	        //Find the About Us link using cssSelector()
	    	
	        WebElement cssLocator2 = driver.findElement(By.cssSelector(".green"));
		
	        System.out.println("Text in element: " + cssLocator2.getText());
	        
	        //Find the About Us link using linkText()
	        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
	        System.out.println("Text in element: " + linkTextLocator.getText());
	        
	        //Close the browser
	        driver.close();
	    }
	}


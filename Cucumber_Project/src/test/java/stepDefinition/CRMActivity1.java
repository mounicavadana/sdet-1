package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CRMActivity1 extends BaseClass {
	
	@Given("^Navigate to Alchemy CRM site and login$")
	public void Login_to_site() {
		createWebDriver();
        driver.get("https://alchemy.hguy.co/crm/");
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@id,'dashlet_entire')]")));
        
	}


	@Then("^Print count of dashlets$")
	public void print_count_dashlets() throws InterruptedException {
				
		
		List<WebElement> dashletElements = driver.findElements(By.xpath("//div[contains(@id,'dashlet_entire')]"));
		
		System.out.println("The number of Dashlets : "+dashletElements.size());
	}

}

package stepDefinition;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.*;
public class CRMActivity4 extends BaseClass {
	@Given("^Navigate to All Products CreateProduct$")
	public void navigate_to_all_products_create_product() {
		WebElement menuActivities = driver.findElement(By.id("grouptab_5"));
		menuActivities.click();
		
		WebElement product = driver.findElement(By.xpath("//a[text()='Products']"));
		
		product.click();
		
		wait.until(ExpectedConditions.textToBe(By.xpath("//h2[contains(@class,'module-title')]")," PRODUCTS"));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='actionmenulink' and text()='Create Product']")));
		driver.findElement(By.xpath("//div[@class='actionmenulink' and text()='Create Product']")).click();
		
		wait.until(ExpectedConditions.textToBe(By.xpath("//h2[contains(@class,'module-title')]"),"CREATE"));
	}

	@Given("^Enter Details of the Product \"(.*)\", \"(.*)\"$")
	public void enter_details_of_the_product(String productName,String productPrice) {
		driver.findElement(By.id("name")).sendKeys(productName);
		driver.findElement(By.id("price")).sendKeys(productPrice);
		
		
	}
	@Given("^Click Save$")
	public void click_save() {
		driver.findElement(By.id("SAVE")).click();
	}
	
	@When("^Navigated to View Products Page$")
	public void navigated_to_view_products_page() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='actionmenulink' and text()='View Products']")));
		driver.findElement(By.xpath("//div[@class='actionmenulink' and text()='View Products']")).click();
		
		wait.until(ExpectedConditions.textToBe(By.xpath("//h2[contains(@class,'module-title')]")," PRODUCTS"));
	
	}
	
	@Then("^All Products should be listed \"(.*)\"$")
	public void all_products_should_be_listed(String productName) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[@field='name']/b/a[contains(text(),'"+productName+"')]")));
		assertEquals(driver.findElement(By.xpath("//td[@field='name']/b/a[contains(text(),'"+productName+"')]")).getText(),productName);
	}
}

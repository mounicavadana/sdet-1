package projectActivities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class Activity2 {
	 WebDriverWait wait;
	    AppiumDriver<MobileElement> driver = null;

	    @BeforeTest
	    public void setup() throws MalformedURLException {

	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "emulator-5554");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.google.android.keep");         
	        caps.setCapability("appActivity", ".activities.BrowseActivity"); 
	        caps.setCapability("noReset", true);
	        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	           wait = new WebDriverWait(driver, 10);
	    }

	    @Test
	    public void GoogleKeepapptoaddanote() {
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	    	driver.findElementByAccessibilityId("New text note").click();
	    	driver.findElementById("editable_title").sendKeys("task title");
	    	driver.findElementById("edit_note_text").sendKeys("edit note text");
	    	driver.findElementByAccessibilityId("Open navigation drawer").click();
	   
	      List<MobileElement> listitems = driver.findElementsById("browse_text_note");
	    	
	    	for(MobileElement tasks : listitems) {
	    	System.out.println("tasks--"+tasks.getAttribute("content-desc"));
	    	}
	      Assert.assertEquals(listitems.size(),1);
	    
	    }
	    
	    @AfterTest
	    public void tearDown() {
	       driver.quit();
	    }
}



package stepDefinition;


	import io.cucumber.java.en.And;
	public class CloseBrowserCRM  extends BaseClass{


		@And("^Close the crm Browser$")
		public void close_Browser_crm() {
			// Close browser
			driver.quit();
		}

}

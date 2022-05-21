package stepdef;

import org.junit.Assert;
import org.testng.Reporter;

import driverManager.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.SamsungAction;


public class SamsungGalaxy {
	
	SamsungAction New= new SamsungAction(DriverManager.getdriver());
	@Given("I have opened browser and url is navigated")
	public void i_have_opened_browser_and_url_is_navigated() {
		String actualurl= DriverManager.getdriver().getCurrentUrl();
		 Assert.assertTrue("This is not correct url", actualurl.contains("https://www.amazon.ca/"));
			Reporter.log("This is expected url >> "+ actualurl);
	}

	@When("I search for product as {string}")
	public void i_search_for_product_as(String string) {
	New.sendKey(New.searchbox,string);
	}
	

	@Then("^I click on search button$")
	public void iClickOnSearchButton() throws Throwable {
	New.searchbutton();
	}


	@Then("^I want to select a phone \"([^\"]*)\"$")
	public void iWantToSelectAPhone(String arg1) throws Throwable {
	New.clickonphone();
	}

    @Then("^I want to click on price$")
    public void iWantToClickOnPrice() throws Throwable {
	New.clickprice();
	System.out.println("get a price of product after clicking");
    }

    @Then("^I want to click on Select Delivery Location$")
	public void iWantToClickOnSelectDeliveryLocation() throws Throwable {
	New.SelectDelieveryLocation();	
	}
    
    @Then("I Sendkeys in postal code field {string}")
    public void i_sendkeys_in_postal_code_field(String string) {
    New.sendKey(New.PostalCode,string); 
    }

    @Then("^I want to click on Apply$")
    public void iWantToClickOnApply() throws Throwable {
    New.Apply();

}

	
}


	


	


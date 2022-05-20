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
	
	SamsungAction Act= new SamsungAction(DriverManager.getdriver());
	
	@Given("I have a browser opened and url is navigated")
	public void i_have_a_browser_opened_and_url_is_navigated() {
		String actualurl= DriverManager.getdriver().getCurrentUrl();
		 Assert.assertTrue("This is not correct url", actualurl.contains("https://www.amazon.ca/"));
			Reporter.log("This is expected url >> "+ actualurl);
	}
	
	
	    @When("I search for a product as {string}")
		public void i_search_for_a_product_as(String string) {
	    	Act.sendKey(Act.searchbox,string);
	    }
	

	@Then("^I click on search button$")
	public void iClickOnSearchButton() throws Throwable {
		Act.searchbutton();
	}


	@Then("^I want to select a phone \"([^\"]*)\"$")
	public void iWantToSelectAPhone(String arg1) throws Throwable {
		Act.clickonphone();
	}

 @Then("^I want to click on price$")
public void iWantToClickOnPrice() throws Throwable {
	Act.clickprice();
	System.out.println("get a price of product after clicking");
}

@Given("^I want to click on Select Delievery Location$")
public void iWantToClickOnSelectDelieveryLocation() throws Throwable {
	Act.SelectDelieveryLocation();
	}






@And("^Sendkeys in postal code field \"([^\"]*)\"$")
public void sendkeysInPostalCodeField(String arg1) throws Throwable {
	Act.sendKey(Act.PostalCode,arg1);
	}


@Then("^I want to click on Apply$")
public void iWantToClickOnApply() throws Throwable {
Act.Apply();

}



}



	


	


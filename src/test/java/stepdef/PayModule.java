package stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import driverManager.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pom. PayModuleActions;

public class PayModule {
	PayModuleActions msg= new PayModuleActions(DriverManager.getdriver());
	private String string;
	
	@Given("I opened brower and url is navigated")
	public void i_opened_brower_and_url_is_navigated() {
		String actualurl= DriverManager.getdriver().getCurrentUrl();
		 Assert.assertTrue("This is not correct url", actualurl.contains("https://www.amazon.ca/"));
			Reporter.log("This is expected url >> "+ actualurl);  
	}

	@Then("I searched for product as\"iphone x\"")
	public void i_searched_for_product_as_iphone_x() {
	msg.sendKey(msg.searchbox,string);  
	}

	@Then("I click search button")
	public void i_click_search_button() {
		msg.searchbutton();
	}
	
	@And("^I selected phone \"([^\"]*)\"$")
	public void iSelectedPhone(String arg1) throws Throwable {
		msg.clickonphone();
		
	}
	@Then("I add to cart")
	public void i_add_to_cart() {
		msg.Addtocart();
	}

	@Then("I proceed to checkout")
	public void i_proceed_to_checkout() {
		msg.Checkout();
	}
	
	@Then("Enter your email {string}")
    public void enter_your_email(String string) {
	 msg.sendKey(msg.email,string);
	}
	@And("I click on continue button")
	public void i_click_on_continue_button() {
	msg.clickContinueButton(); 
	}

	@Then("I enter password {string}")
	public void i_enter_password(String string) {
	msg.sendKey(msg.password,string);
	}

	@Then("I click on Sign in")
	public void i_click_on_sign_in() {
	msg.loginButton();
	}
	{
		
	}


	
}






	

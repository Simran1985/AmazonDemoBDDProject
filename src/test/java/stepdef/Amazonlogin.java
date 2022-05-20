
package stepdef;

import driverManager.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.LoginLogoutpage;
import org.testng.Reporter;
import org.junit.Assert;
public class Amazonlogin {
	LoginLogoutpage loginAct= new LoginLogoutpage(DriverManager.getdriver());
	
	
	@Given("I am on the Login page URL {string}")
	public void i_am_on_the_login_page_url(String string) {
		String actualurl= DriverManager.getdriver().getCurrentUrl();
		 Assert.assertTrue("This is not correct url", actualurl.contains("https://www.amazon.ca/"));
			Reporter.log("This is expected url >> "+ actualurl);
	}

	@Then("I click on sign in button and wait for sign in page")
	public void i_click_on_sign_in_button_and_wait_for_sign_in_page() {
		 loginAct.logininbutton();
	}
	@When("^I enter email as \"([^\"]*)\"$")
	public void iEnterEmailAs(String arg1) throws Throwable {
		loginAct.sendKey(loginAct.email,arg1);
}
	@Then("I should see Sign In Page")
	public void i_should_see_sign_in_page() {
		loginAct.email.isDisplayed();
	}

	@And("^I enter password as this \"([^\"]*)\"$")
	public void iEnterPasswordAsThis(String arg1) throws Throwable {
		loginAct.sendKey(loginAct.password,arg1);
	}

	@When("I Click on Continue button")
	public void i_click_on_continue_button() {
		loginAct.clickContinueButton();
	}

	
		
@When("click on login button")
	public void click_on_login_button() {
		loginAct.signinButton();
	}

	@Then("I am logged in")
	public void i_am_logged_in() {
		loginAct.SignInfromNav();
	}

	@And("^I Click on  a Sign out button$")
	public void iClickOnASignOutButton() throws Throwable {
		loginAct.logoutBtn();
	}

	

	

	
}
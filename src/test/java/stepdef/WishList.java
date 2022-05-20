package stepdef;

import org.junit.Assert;
import org.testng.Reporter;

import driverManager.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.WishlistAction;


public class WishList {
	WishlistAction Act= new WishlistAction(DriverManager.getdriver());


@Given("I have a browser open and url is navigated")
public void i_have_a_browser_open_and_url_is_navigated() {
	String actualurl= DriverManager.getdriver().getCurrentUrl();
	 Assert.assertTrue("This is not correct url", actualurl.contains("https://www.amazon.ca/"));
		Reporter.log("This is expected url >> "+ actualurl);
}
@Then("^I want to click on AccountList$")
public void iWantToClickOnAccountList() throws Throwable {
Act. AccountList();
}

@Then("enter email {string}")
public void enter_email(String arg1) throws Throwable {
    Act.sendKey(Act.email,arg1);
}
@Then("Click continue")
public void click_continue() {
	Act.clickContinueButton();
	
}
@Then("enter Password {string}")
public void enter_password(String arg1) throws Throwable {
	Act.sendKey(Act.password,arg1);
	}
@Then("^Click on signin$")
public void clickOnSignin() throws Throwable {
	Act.loginButton();
}


@Then("^I search product \"([^\"]*)\"$")
public void iSearchProduct(String arg1) throws Throwable {
Act.sendKey(Act.searchbox,arg1);


}
@Then("^clicked search button$")
public void clickedSearchButton() throws Throwable {
Act.searchbutton();
}

@And("^I Click  Continue button$")
public void iClickContinueButton() throws Throwable {
	Act.clickContinueButton();
	}
@And("^I selected phone \"([^\"]*)\"$")
public void iSelectedPhone(String arg1) throws Throwable {
	Act.clickonphone();
}
@Then("^Add to a wish List$")
public void addToAWishList() throws Throwable {
	Act.CreateWishList();
}


}











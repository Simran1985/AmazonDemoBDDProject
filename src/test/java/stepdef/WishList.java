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
	WishlistAction abc= new WishlistAction(DriverManager.getdriver());


@Given("I have a browser open and url is navigated")
public void i_have_a_browser_open_and_url_is_navigated() {
	String actualurl= DriverManager.getdriver().getCurrentUrl();
	 Assert.assertTrue("This is not correct url", actualurl.contains("https://www.amazon.ca/"));
		Reporter.log("This is expected url >> "+ actualurl);
}
@Then("^I want to click on AccountList$")
public void iWantToClickOnAccountList() throws Throwable {
abc. AccountList();
}

@Then("^Click on signin$")
public void clickOnSignin() throws Throwable {
abc.loginButton();
}

@Then("search product {string}")
public void search_product(String string) {
abc.sendKey(abc.searchbox,string);

}

@And("^I Click  Continue button$")
public void iClickContinueButton() throws Throwable {
abc.clickContinueButton();
}

@And("^selected phone \"([^\"]*)\"$")
public void iSelectedPhone(String arg1) throws Throwable {
abc.clickonphone();
}

@Then("I enter email {string}")
public void i_enter_email(String string) {
abc.sendKey(abc.email,string);
}

@Then("I click continue")
public void i_click_continue() {
abc.clickContinueButton();
}

@Then("I enter Password {string}")
public void i_enter_password(String string) {
abc.sendKey(abc.password,string);
}

@Then("I click on signin")
public void i_click_on_signin() {
abc.loginButton();
}

@Then("I clicked search button")
public void i_clicked_search_button() {
abc.searchbutton();
}

@Then("I Added to a wish List")
public void i_added_to_a_wish_list() {
abc.CreateWishList();
}


}

 









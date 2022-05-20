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
	PayModuleActions Act= new PayModuleActions(DriverManager.getdriver());
	
	


	@Given("^Browser opened and url is navigated$")
	public void browserOpenedAndUrlIsNavigated() throws Throwable {
		String actualurl= DriverManager.getdriver().getCurrentUrl();
		 Assert.assertTrue("This is not correct url", actualurl.contains("https://www.amazon.ca/"));
			Reporter.log("This is expected url >> "+ actualurl);
	}


	@Then("^Searched for  product as  \"([^\"]*)\"$")
	public void searchedForProductAs(String arg1) throws Throwable {
		Act.sendKey(Act.searchbox,arg1);
}
@Then("^click search button$")
	public void clickSearchButton() throws Throwable {
		Act.searchbutton();
	}



@Then("Iclicked on bottle")
public void iclicked_on_bottle() {
    Act.Waterbottle();
}
@Then("Add to cart")
public void add_to_cart() {
   Act.Addtocart();
   
}	


@Then("Proceed to checkout")
public void proceed_to_checkout() {
   Act.Checkout();
}
@Then("Enter your email {string}")
public void enter_your_email(String string) {
	 Act.sendKey(Act.email,string);
	}


@Then("click on continue buttonn")
public void click_on_continue_buttonn() {
	Act.clickContinueButton();
}

@Then("Password {string}")
public void password(String string) {
	Act.sendKey(Act.password,string);
}

@Then("click Signin")
public void click_signin() {
    Act.loginButtonn();
}

}


	

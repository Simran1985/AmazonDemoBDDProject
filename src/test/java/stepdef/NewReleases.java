package stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import driverManager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pom.NewReleasesAction;
import pom.WishlistAction;


public class NewReleases {
	
	 NewReleasesAction Act= new   NewReleasesAction(DriverManager.getdriver());




@Given("I have a browser open")
public void i_have_a_browser_open() {

	String actualurl= DriverManager.getdriver().getCurrentUrl();
	 Assert.assertTrue("This is not correct url", actualurl.contains("https://www.amazon.ca/"));
		Reporter.log("This is expected url >> "+ actualurl);
}

@Given("url is navigated")
public void url_is_navigated() {
    System.out.println("navigate to amazon");
}

@Then("I want to click on new releases")
public void i_want_to_click_on_new_releases() {
    Act.NewReleasestile();
}

@Then("validate the page")
public void validate_the_page() {
	String actualurl= DriverManager.getdriver().getCurrentUrl();
	 Assert.assertTrue("This is not correct url", actualurl.contains("https://www.amazon.ca/gp/new-releases/?ref_=nav_cs_newreleases"));
		Reporter.log("This is expected url >> "+ actualurl);
}
}

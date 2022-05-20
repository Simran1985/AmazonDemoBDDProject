package pom;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.DriverManager;
import utils.CommonMethods;

public class SamsungAction { 

private WebDriver driver;
CommonMethods common = new CommonMethods(DriverManager.getdriver());

public  SamsungAction(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}	

@CacheLookup
@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	public WebElement searchbox;

@CacheLookup
@FindBy(xpath="//*[@id='nav-search-submit-button']")
public WebElement searchbutton;


@CacheLookup
@FindBy(xpath="//*[contains(text(),'S10 SM-G973')]")
public WebElement clickonphone;


@CacheLookup
@FindBy(xpath="//*[@id='apex_offerDisplay_desktop']")
public WebElement clickprice;

@CacheLookup
@FindBy(xpath="//*[@id='contextualIngressPtLabel']")
public WebElement SelectDelieveryLocation;




@CacheLookup
@FindBy(xpath="//*[@class='a-declarative a-span5']")
public WebElement PostalCode;


@CacheLookup
@FindBy(xpath="//div[@class='a-column a-span4 a-span-last']")
public WebElement Apply;

@CacheLookup
@FindBy(xpath="//*[@id='nav-global-location-popover-link']")
public WebElement Deliverto;

public void sendKey(WebElement ele, String str) {
	//common.waitforElement(ele);
	//common.Scrollele(ele);
	common.higlightement(ele);
	ele.sendKeys(str);
	
}
	public void searchbutton() {
		searchbutton.click();
	}
	public void clickonphone() {
		clickonphone.click();
	}
	public void clickprice() {
		clickprice.click();
	}
	public void SelectDelieveryLocation() {
		SelectDelieveryLocation.click();
		}
	
	public void Apply() {
		Apply.click();
		
	}
	
}


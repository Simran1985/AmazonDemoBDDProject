package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.DriverManager;
import utils.CommonMethods;

public class LoginLogoutpage {

private WebDriver driver;
CommonMethods common = new CommonMethods(DriverManager.getdriver());

public  LoginLogoutpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}	
	

@CacheLookup
@FindBy(xpath="//*[@id='nav-link-accountList-nav-line-1']")
	public WebElement logininbutton;
	


@CacheLookup
@FindBy(xpath="//input[@type='email']")
public WebElement email;


@CacheLookup
@FindBy(xpath="//input[@id='continue']")
WebElement Continue;

@CacheLookup
@FindBy(xpath="//input[@type='password']")
public WebElement password;

@CacheLookup
@FindBy(xpath="//input[@id='signInSubmit']")
WebElement signinButton;

@CacheLookup
@FindBy(xpath="//div[@id='nav-tools']/a[@data-nav-role='signin']")
WebElement SignInfromNav;

@CacheLookup
@FindBy(xpath="//a[@id='nav-item-signout']")
public WebElement logoutBtn;




public void clicklogininbutton(){
	logininbutton.click();
}
public void logoutBtn(){
	logoutBtn.click();
}
public void signinButton(){
	signinButton.click();
}

public void SignInfromNav(){
	

	SignInfromNav.click();
	
}
public void clickContinueButton(){
	Continue.click();

}

public void sendKey(WebElement ele, String str) {
	common.waitforElement(ele);
	common.Scrollele(ele);
	common.higlightement(ele);
	ele.sendKeys(str);
	
	
}
public void logininbutton() {
	logininbutton.click();
	
}	
public void handlingactions() {
Actions act=new Actions(driver);
act.moveToElement(SignInfromNav).build().perform();
}
}







	

package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverManager.DriverManager;
import utils.CommonMethods;

public class WishlistAction {
	private WebDriver driver;
	CommonMethods common = new CommonMethods(DriverManager.getdriver());

	public  WishlistAction(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
@CacheLookup
@FindBy(xpath="(//div[@id='nav-tools']//a)[2]")
public WebElement AccountList;
	



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
WebElement loginButton;


@CacheLookup
@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	public WebElement searchbox;

@CacheLookup
@FindBy(xpath="//*[@id='nav-search-submit-button']")
public WebElement searchbutton;


@CacheLookup
@FindBy(xpath="//span[contains(text(),'Apple iPhone X 64GB Unlocked GSM Phone ')]")
public WebElement clickonphone;
@CacheLookup



@FindBy(xpath="//*[@id='add-to-wishlist-button-submit']")
public WebElement CreateWishList;




public void AccountList() {
    AccountList.click();
}

public void CreateWishList() {
CreateWishList.click();
}
public void clickContinueButton(){
	Continue.click();

}
public void clickonphone() {
	clickonphone.click();
}



public void handlingaction() {

Actions act=new Actions(driver);
act.moveToElement(AccountList).build().perform();

	CreateWishList.click();
 act.click(CreateWishList).build().perform();
}
public void searchbutton() {
	searchbutton.click();
}

 public void sendKey(WebElement ele, String str) {
	common.waitforElement(ele);
	common.Scrollele(ele);
	common.higlightement(ele);
	ele.sendKeys(str);
	

 }

 
public void loginButton() {
	loginButton.click();
}


	
}















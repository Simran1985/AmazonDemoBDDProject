package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import driverManager.DriverManager;
import utils.CommonMethods;

public class NewReleasesAction{
	private WebDriver driver;
		CommonMethods common = new CommonMethods(DriverManager.getdriver());

		public  NewReleasesAction(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}	
		@CacheLookup
		@FindBy(xpath="//div[@id='nav-xshop']//a[4]")
			public WebElement NewReleases;
		 

 public void NewReleasestile() {
	NewReleases.click();
	
}


	
}
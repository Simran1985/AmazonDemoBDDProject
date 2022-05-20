package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

 WebDriver driver;

	public static ThreadLocal<WebDriver> tl = new ThreadLocal<WebDriver>();
	
	public WebDriver setup(String browser) {

		System.out.println(browser);
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			tl.set(new ChromeDriver());
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tl.set(new FirefoxDriver());
		}
		else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			tl.set(new EdgeDriver());
		}
		else {
			System.out.println("This is not correct value for browser"+ browser);
			System.exit(0);
		}

		getdriver().manage().deleteAllCookies();
		getdriver().manage().window().maximize();
	return driver;



		}
	
	public static synchronized  WebDriver getdriver() {
		return tl.get();
	}








}
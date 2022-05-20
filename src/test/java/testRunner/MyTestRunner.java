package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\test\\resources\\feature\\PayModule.feature"},
		glue= {"stepdef","hooks"},
		tags= "@PayModule",
		publish=true,
		plugin= {"pretty","json:target/cucumber-reports/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				}		
				)





public class MyTestRunner {

}
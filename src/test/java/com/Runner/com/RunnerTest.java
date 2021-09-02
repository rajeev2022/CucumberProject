package com.Runner.com;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactinhelper.com.FileReaderManager;
import com.baseclass.com.Baseclass_Login;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//Feature", 
                     glue = "stepdefinition", 
                     monochrome=true,
                     dryRun =true,
                     strict =true,
                     plugin = { "pretty", "html:report",
"com.cucumber.listener.ExtentCucumberFormatter:report/extentReport.html" })

public class RunnerTest {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws Throwable {

		String browser = FileReaderManager.getInstanceFR().getInstanceCR().getBrowser();

		driver = Baseclass_Login.Browserlaunch(browser);
//driver = Baseclass_Login.Browserlaunch("Chrome");
		System.out.println("Cucumber hotel booked ");
	}

}

package com.baseclass.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Baseclass_Login {
	
	
	public static WebDriver driver;

	public static WebDriver Browserlaunch(String str) {

		if (str.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Perumalsamy\\eclipse-workspace\\CucumberAnnotaionProject\\driver\\chromedriver.exe");

			// interface //class = collection concept
			driver = new ChromeDriver();// upcasting

		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void geturl(String url) {
		driver.get(url);

	}

	public static void inputvalues(WebElement input, String value) {

		if (value.equalsIgnoreCase("0"))
			input.clear();
		input.sendKeys(value);

	}

	public static void Clickonelement(WebElement ele) {
		ele.click();
	}
	
	
	public static Timeouts ImplicitWait_per_Sec(int i) {
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
		return implicitlyWait;
	}

	public static void Mousehover(WebElement Mousehover_ele, List<WebElement> ele, String selected_from_lists) {
		Actions act = new Actions(driver);

		act.moveToElement(Mousehover_ele).build().perform();

		List<WebElement> li = ele;
		for (int i = 0; i < li.size(); i++) {
			WebElement li_ele = li.get(i);
			String text = li_ele.getText();

			if (text.equalsIgnoreCase(selected_from_lists)) {
				li_ele.click();
				break;

			}

		}
	}
	



}

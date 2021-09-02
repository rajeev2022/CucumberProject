package com.adactinhelper.com;

import org.openqa.selenium.WebDriver;

import com.POM.com.Login_POM;

public class ProjectObjectManager {

	public static WebDriver driver;
	private Login_POM lp;

	public ProjectObjectManager(WebDriver driver2) {
		this.driver = driver2;

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public Login_POM getInstancelp() {
		lp = new Login_POM(driver);
		return lp;
	}

}

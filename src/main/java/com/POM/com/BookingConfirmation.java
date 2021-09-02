package com.POM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {

	public static WebDriver driver;

	public BookingConfirmation(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement My_Itinerary;
	@FindBy(xpath = "//input[@id='logout']")
	private WebElement Logout;

	public WebElement getMy_Itinerary() {
		return My_Itinerary;
	}
	public WebElement getLogout() {
		return Logout;
	}

}

package com.POM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {

	public static WebDriver driver;

//	public Adactin_SelectHotel(WebDriver driver2) {
//
//		this.driver = driver2;
//		PageFactory.initElements(driver2, this);
//	}

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement Select_hotel;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement Continue;

	public SelectHotel(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSelect_hotel() {
		return Select_hotel;
	}

	public WebElement getContinue() {
		return Continue;
	}

}

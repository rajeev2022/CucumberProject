package com.POM.com;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
	
	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement FirstName;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement LastName;
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement BillingAddress;

	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement Creditcard_No;
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement CreditcardType;
	@FindBy(xpath = "//select[@id='cc_type']/option")
	private List<WebElement> Listof_CreditcardType;

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement ExpiryMonth;
	@FindBy(xpath = "//select[@id='cc_exp_month']/option")
	private List<WebElement> Listof_ExpiryMonth;

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement ExpiryYear;
	@FindBy(xpath = "//select[@id='cc_exp_year']/option")
	private List<WebElement> Listof_ExpiryYear;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement CVVno;
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement BookNow;
	
	public BookHotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
		
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getBillingAddress() {
		return BillingAddress;
	}
	public WebElement getCreditcard_No() {
		return Creditcard_No;
	}
	public WebElement getCreditcardType() {
		return CreditcardType;
	}
	public List<WebElement> getListof_CreditcardType() {
		return Listof_CreditcardType;
	}
	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}
	public List<WebElement> getListof_ExpiryMonth() {
		return Listof_ExpiryMonth;
	}
	public WebElement getExpiryYear() {
		return ExpiryYear;
	}
	public List<WebElement> getListof_ExpiryYear() {
		return Listof_ExpiryYear;
	}
	public WebElement getCVVno() {
		return CVVno;
	}
	public WebElement getBookNow() {
		return BookNow;
	}

//	public Adactin_BookHotel(WebDriver driver2) {
//		this.driver = driver2;
//		PageFactory.initElements(driver, this);
//	}

}

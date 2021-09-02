package com.POM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POM {
	
	

public static  WebDriver driver;


////new
//	public Adactin_Login(WebDriver driver2) {
//		this.driver =driver2;
//		PageFactory.initElements(driver2, this);
//	}

	
///old
//	public Adactin_Login(WebDriver driver) {
//		this.driver =driver;
//		PageFactory.initElements(driver, this);
//	}

	@FindBy(xpath = "//input[@id='username']")
	private WebElement UserName;
	@FindBy(xpath="//input[@id='password']")
	private WebElement PassWord;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement Login;

	public Login_POM(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver =driver2;
		PageFactory.initElements(driver2, this);
		
	}

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPassWord() {
		return PassWord;
	}

	public WebElement getLogin() {
		return Login;
	}

	
	
	


}

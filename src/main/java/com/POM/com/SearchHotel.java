package com.POM.com;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public static WebDriver driver;

	public SearchHotel(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	@FindBy(xpath = "//select[@id='location']")
	private WebElement Location;
	@FindBy(xpath = "//select[@id='location']/option")
	private List<WebElement> ListofLocation;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement Hotels;
	@FindBy(xpath = "//select[@id='hotels']/option")
	private List<WebElement> ListofHotels;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement RoomType;
	@FindBy(xpath = "//select[@id='room_type']/option")
	private List<WebElement> ListofRoomType;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement NoofRoom;
	@FindBy(xpath = "//select[@id='room_nos']/option")
	private List<WebElement> List_NoofRoom;

	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement CheckinDate;
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement CheckoutDate;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement AdultperRoom;
	@FindBy(xpath = "//select[@id='adult_room']/option")
	private List<WebElement> Listof_AdultperRoom;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement ChildperRoom;
	@FindBy(xpath="//select[@id='child_room']/option")
	private List<WebElement> Listof_ChildperRoom;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement Search;//Reset
//	@FindBy(xpath="//input[@id='Reset']")
//	private WebElement Reset;

	public WebElement getLocation() {
		return Location;
	}

	public List<WebElement> getListofLocation() {
		return ListofLocation;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public List<WebElement> getListofHotels() {
		return ListofHotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public List<WebElement> getListofRoomType() {
		return ListofRoomType;
	}

	public WebElement getNoofRoom() {
		return NoofRoom;
	}

	public List<WebElement> getList_NoofRoom() {
		return List_NoofRoom;
	}

	public WebElement getCheckinDate() {
		return CheckinDate;
	}

	public WebElement getCheckoutDate() {
		return CheckoutDate;
	}

	public WebElement getAdultperRoom() {
		return AdultperRoom;
	}

	public List<WebElement> getListof_AdultperRoom() {
		return Listof_AdultperRoom;
	}

	public WebElement getChildperRoom() {
		return ChildperRoom;
	}

	public List<WebElement> getListof_ChildperRoom() {
		return Listof_ChildperRoom;
	}

	public WebElement getSearch() {
		return Search;
	}
}

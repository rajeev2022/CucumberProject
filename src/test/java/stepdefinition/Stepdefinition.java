package stepdefinition;

import org.openqa.selenium.WebDriver;

import com.POM.com.BookHotel;
import com.POM.com.BookingConfirmation;
import com.POM.com.Login_POM;
import com.POM.com.SearchHotel;
import com.POM.com.SelectHotel;
import com.Runner.com.RunnerTest;
import com.adactinhelper.com.FileReaderManager;
import com.adactinhelper.com.ProjectObjectManager;
import com.baseclass.com.Baseclass_Login;

import cucumber.api.java.en.*;

public class Stepdefinition extends Baseclass_Login {

	public static WebDriver driver = RunnerTest.driver;

	// Login_POM lp = new Login_POM(driver);
	ProjectObjectManager POM = new ProjectObjectManager(driver);

	@Given("^user launch application$")
	public void user_launch_application() throws Throwable {

//		geturl("https://adactinhotelapp.com/index.php");

		String url = FileReaderManager.getInstanceFR().getInstanceCR().getUrl();
		geturl(url);
		// System.out.println("url is: "+url);
	}

	//@When("^user entredvalid usernanme in user name efield$")
	@When("^user entredvalid usernanme in user name efield \"([^\"]*)\"$")
	public void user_entredvalid_usernanme_in_user_name_efield( String Username) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		// inputvalues(lp.getUserName(), "Rajeev2021");
		inputvalues(POM.getInstancelp().getUserName(), Username);//"Rajeev2021");
	}

	//@When("^user enter valid password in password field$")
	@When("^user enter valid password in password field \"([^\"]*)\"$")
	public void user_enter_valid_password_in_password_field(String Password) throws Throwable {

		// throw new PendingException();
		// inputvalues(lp.getPassWord(), "rajeev1234");
		inputvalues(POM.getInstancelp().getPassWord(),Password);// "rajeev1234");
	}

	@Then("^click login$")
	public void click_login() throws Throwable {

		// throw new PendingException();
		// Clickonelement(lp.getLogin());
		Clickonelement(POM.getInstancelp().getLogin());
	}

	///// ***********after login*************////

	SearchHotel sh = new SearchHotel(driver);

	@Given("^User login into Adactin hotel application$")
	public void user_login_into_Adactin_hotel_application() throws Throwable {
		// ImplicitWait_per_Sec(10);
	}

	@When("^User select Location$")
	public void user_select_Location() throws Throwable {
		Mousehover(sh.getLocation(), sh.getListofLocation(), "London");
	}

	@When("^User select Hotelname$")
	public void user_select_Hotelname() throws Throwable {
		Mousehover(sh.getHotels(), sh.getListofHotels(), "Hotel Sunshine");
	}

	@When("^User select Room type$")
	public void user_select_Room_type() throws Throwable {
		Mousehover(sh.getRoomType(), sh.getListofRoomType(), "Standard");
	}

	@When("^User select No of roome$")
	public void user_select_No_of_roome() throws Throwable {
		Mousehover(sh.getNoofRoom(), sh.getList_NoofRoom(), "2 - Two");
	}

	@When("^User select Checkindate$")
	public void user_select_Checkindate() throws Throwable {
		sh.getCheckinDate().clear();

		inputvalues(sh.getCheckinDate(), "30/08/2021");

	}

	@When("^User select Checkoutdate$")
	public void user_select_Checkoutdate() throws Throwable {

		sh.getCheckoutDate().clear();

		inputvalues(sh.getCheckoutDate(), "31/08/2021");

	}

	@When("^User select AdultperRoom$")
	public void user_select_AdultperRoom() throws Throwable {
		Mousehover(sh.getAdultperRoom(), sh.getListof_AdultperRoom(), "3 - Three");
	}

	@When("^User select ChildperRoom$")
	public void user_select_ChildperRoom() throws Throwable {
		Mousehover(sh.getChildperRoom(), sh.getListof_ChildperRoom(), "4 - Four");
	}

	@Then("^User click Searchbutton$")
	public void user_click_Searchbutton() throws Throwable {
		Clickonelement(sh.getSearch());
		// Takescreenshot("Search Hotel");
	}

	/// ***************3rd page : Select Hotel******************//

	SelectHotel sth = new SelectHotel(driver);

	@Given("^User  click search button from SearchHotel$")
	public void user_click_search_button_from_SearchHotel() throws Throwable {
		ImplicitWait_per_Sec(10);
	}

	@When("^User Click RadioButton$")
	public void user_Click_RadioButton() throws Throwable {
		Clickonelement(sth.getSelect_hotel());
	}

	@When("^user Click Continue$")
	public void user_Click_Continue() throws Throwable {
		Clickonelement(sth.getContinue());
	}
//@When("^user Click Confirmation$")
//public void user_Click_Confirmation() throws Throwable {
//    
//}

//////////*********4th page Book A Hotel***************///

	BookHotel bh = new BookHotel(driver);

	@Given("^User get Booking a hotel page  from selected Hotel$")
	public void user_get_Booking_a_hotel_page_from_selected_Hotel() throws Throwable {
		ImplicitWait_per_Sec(10);
	}

	@When("^User Enter Firstname and Lastname and Billing Address$")
	public void user_Enter_Firstname_and_Lastname_and_Billing_Address() throws Throwable {
		inputvalues(bh.getFirstName(), "Rajeev");
		inputvalues(bh.getLastName(), "Gandhi");
		inputvalues(bh.getBillingAddress(), "No: 13, East Street, Chennai - 600001");
	}

	@When("^User Enter ur Card Details$")
	public void user_Enter_ur_Card_Details() throws Throwable {
		inputvalues(bh.getCreditcard_No(), "1234567812346578");
		Mousehover(bh.getCreditcardType(), bh.getListof_CreditcardType(), "VISA");
		Mousehover(bh.getExpiryMonth(), bh.getListof_ExpiryMonth(), "May");
		Mousehover(bh.getExpiryYear(), bh.getListof_ExpiryYear(), "2022");
		inputvalues(bh.getCVVno(), "123");

	}

	@Then("^User Click BookNow$")
	public void user_Click_BookNow() throws Throwable {
		Clickonelement(bh.getBookNow());
	}

///***********5th page..Booking confirmation***///////

	BookingConfirmation bc = new BookingConfirmation(driver);

	@Given("^User Must booked hotel$")
	public void user_Must_booked_hotel() throws Throwable {
		ImplicitWait_per_Sec(10);
	}

	@When("^User Click  itinerary for Booking Hotel history details$")
	public void user_Click_itinerary_for_Booking_Hotel_history_details() throws Throwable {
		Clickonelement(bc.getMy_Itinerary());

	}

	@When("^User Click Logout$")
	public void user_Click_Logout() throws Throwable {
		Clickonelement(bc.getLogout());
	}

}

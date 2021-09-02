Feature: User Checking overall functionality of adactin hotel booking 
Scenario Outline: checking login function 
	Given  user launch application 
	When user entredvalid usernanme in user name efield "<Username>"
	And user enter valid password in password field "<Password>"
	Then click login
	
Examples:
|Username | Password|
|test|1234|
|rajeev|789|	 
	
	
Scenario: User fill the details in select hotel 
	Given     User login into Adactin hotel application 
	When      User select Location 
	And       User select Hotelname 
	And       User select Room type 
	And       User select No of roome 
	And       User select Checkindate 
	And       User select Checkoutdate 
	And       User select AdultperRoom 
	And       User select ChildperRoom 
	Then      User click Searchbutton 
	
Scenario: User SelectHotel from SearchHotels List 
	Given     User  click search button from SearchHotel 
	When User Click RadioButton 
	And user Click Continue 
	
Scenario: User Booking a Hotel with Payment Details 
	Given User get Booking a hotel page  from selected Hotel 
	When User Enter Firstname and Lastname and Billing Address 
	And User Enter ur Card Details 
	Then User Click BookNow 
	
Scenario: User Checking  our Booking Hotel history and Logout 
	Given User Must booked hotel 
	When User Click  itinerary for Booking Hotel history details 
	And User Click Logout 
	
	

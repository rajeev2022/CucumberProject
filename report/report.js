$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "line": 1,
  "name": "User Checking overall functionality of adactin hotel booking",
  "description": "",
  "id": "user-checking-overall-functionality-of-adactin-hotel-booking",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "checking login function",
  "description": "",
  "id": "user-checking-overall-functionality-of-adactin-hotel-booking;checking-login-function",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user launch application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user entredvalid usernanme in user name efield \"\u003cUsername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter valid password in password field \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "click login",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "user-checking-overall-functionality-of-adactin-hotel-booking;checking-login-function;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 9,
      "id": "user-checking-overall-functionality-of-adactin-hotel-booking;checking-login-function;;1"
    },
    {
      "cells": [
        "test",
        "1234"
      ],
      "line": 10,
      "id": "user-checking-overall-functionality-of-adactin-hotel-booking;checking-login-function;;2"
    },
    {
      "cells": [
        "rajeev",
        "789"
      ],
      "line": 11,
      "id": "user-checking-overall-functionality-of-adactin-hotel-booking;checking-login-function;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "checking login function",
  "description": "",
  "id": "user-checking-overall-functionality-of-adactin-hotel-booking;checking-login-function;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user launch application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user entredvalid usernanme in user name efield \"test\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter valid password in password field \"1234\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "click login",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_launch_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 48
    }
  ],
  "location": "Stepdefinition.user_entredvalid_usernanme_in_user_name_efield(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 45
    }
  ],
  "location": "Stepdefinition.user_enter_valid_password_in_password_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.click_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "checking login function",
  "description": "",
  "id": "user-checking-overall-functionality-of-adactin-hotel-booking;checking-login-function;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user launch application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user entredvalid usernanme in user name efield \"rajeev\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter valid password in password field \"789\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "click login",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_launch_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "rajeev",
      "offset": 48
    }
  ],
  "location": "Stepdefinition.user_entredvalid_usernanme_in_user_name_efield(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "789",
      "offset": 45
    }
  ],
  "location": "Stepdefinition.user_enter_valid_password_in_password_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.click_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "User fill the details in select hotel",
  "description": "",
  "id": "user-checking-overall-functionality-of-adactin-hotel-booking;user-fill-the-details-in-select-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "User login into Adactin hotel application",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User select Location",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User select Hotelname",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User select Room type",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User select No of roome",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User select Checkindate",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User select Checkoutdate",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User select AdultperRoom",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User select ChildperRoom",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User click Searchbutton",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_login_into_Adactin_hotel_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_select_Location()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_select_Hotelname()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_select_Room_type()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_select_No_of_roome()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_select_Checkindate()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_select_Checkoutdate()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_select_AdultperRoom()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_select_ChildperRoom()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_click_Searchbutton()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 26,
  "name": "User SelectHotel from SearchHotels List",
  "description": "",
  "id": "user-checking-overall-functionality-of-adactin-hotel-booking;user-selecthotel-from-searchhotels-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "User  click search button from SearchHotel",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "User Click RadioButton",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user Click Continue",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_click_search_button_from_SearchHotel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Click_RadioButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Click_Continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 31,
  "name": "User Booking a Hotel with Payment Details",
  "description": "",
  "id": "user-checking-overall-functionality-of-adactin-hotel-booking;user-booking-a-hotel-with-payment-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "User get Booking a hotel page  from selected Hotel",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "User Enter Firstname and Lastname and Billing Address",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "User Enter ur Card Details",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User Click BookNow",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_get_Booking_a_hotel_page_from_selected_Hotel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_Firstname_and_Lastname_and_Billing_Address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_ur_Card_Details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Click_BookNow()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 37,
  "name": "User Checking  our Booking Hotel history and Logout",
  "description": "",
  "id": "user-checking-overall-functionality-of-adactin-hotel-booking;user-checking--our-booking-hotel-history-and-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "User Must booked hotel",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "User Click  itinerary for Booking Hotel history details",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "User Click Logout",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_Must_booked_hotel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Click_itinerary_for_Booking_Hotel_history_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Click_Logout()"
});
formatter.result({
  "status": "skipped"
});
});
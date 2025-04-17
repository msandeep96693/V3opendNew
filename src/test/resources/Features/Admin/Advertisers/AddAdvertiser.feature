
Feature: New Advertiser Creation

 Background:
  Given The admin launches the browser
  When Enters the url as "https://v3opend.tech-active.com/auth/manage_opend"
  Then Verify that the admin is navigated to the opend website
  When Enters the email address as "admin@opend.com" and the password as "1234"
  And  Clicks on the sign in button
  Then Verify that the admin is navigated to the dashboard page with the confirmation message
  When Clicks on advertisers from the side menu bar
  Then Verify that the admin is navigated to the advertisers home page
  When Clicks on add new advertiser button
  Then Verify that the admin should navigate to the add advertiser page
  
 @Smoke
 Scenario: The admin creating a new advertiser with valid inputs
  When Enters a business name into business name textfield
  And Enter a business vat into business vat textfild
  And Select a country from country dropdown
  And Select a city from city dropdown
  And Enters a subid into subid textfield
  And Select a functional area from functional area dropdown
  And Select a industry from industry dropdown popup
  And Select a timezone from timezone dropdown
  And Enters the first name
  And Enters the last name
  And Enters the email address
  And Clicks on Add button
  And Clicks on ok button on confirmation popup
  Then Verify that the new advertiser successfully created with the confirmation message
  And Verify that the admin is redirected to advertiser home page
  And Ensure that the newly created advertiser is displayed on the advertiser home page
  When Clicks on the profile icon
  And Clicks on logout button
  Then Ensure that the admin successfully logout from admin portal with the confirmation message
  And Close the browser

Feature: Advertiser Overview

 Background:
  Given The admin launches the browser
  When Enters the url as "https://v3opend.tech-active.com/auth/manage_opend"
  Then Verify that the admin is navigated to the opend website
  When Enters the email address as "admin@opend.com" and the password as "1234"
  And  Clicks on the sign in button
  Then Verify that the admin is navigated to the dashboard page with the confirmation message
  When Clicks on advertisers from the side menu bar
  Then Verify that the admin is navigated to the advertisers home page
  When Clicks on "  View" button from kebab menu dropdown
  Then Verify that the admin should navigate to the overview advertiser page
  
 @Regression
 Scenario: The admin updates the advertiser profile information from profile tab
  When Clicks on "Profile" tab
  And Clicks an edit button on company information section
  And Update some of the input fields and click on update button
  And Clicks on ok button on confirmation popup
  Then Verify that the company information successfully updated with the confirmation message
  When Clicks on "Billing Contact" accordion and edit button
  And Update some of the fields and click on update button
  And Clicks on ok button on confirmation popup
  Then Verify that the billing information successfully updated with the confirmation message
  When Clicks on the profile icon
  And Clicks on logout button
  Then Ensure that the admin successfully logout from admin portal with the confirmation message
  And Close the browser
  
 @Regression 
 Scenario: The admin creating a new advertiser user with valid inputs
  When Clicks on "User" tab and click on add button
  Then Verify the admin should navigate to the "Create User" page from manage users
  When Enter all the mandatory fields
  And Click on add user button
  Then Verify that the advertiser user account successfully created with the confirmation message as "Advertiser user added successfully"
  When Clicks on the profile icon
  And Clicks on logout button
  Then Ensure that the admin successfully logout from admin portal with the confirmation message
  And Close the browser
  
 @Regression
 Scenario: The admin update the advertiser user details
  When Clicks on "User" tab
  And Select the user from user list and click on "  Edit" button from kebab menu
  Then Veify that the admin should navigate to the "Edit User" page from individual advertiser
  When made some changes in edit user page and click on update button
  And Clicks on ok button on confirmation popup
  Then Make sure that the advertiser user details successfully updated with the confirmation message as "Advertiser manage user updated successfully" 
  When Clicks on the profile icon
  And Clicks on logout button
  Then Ensure that the admin successfully logout from admin portal with the confirmation message
  And Close the browser
 
 @Regression 
 Scenario: The admin tries to suspend the advertiser user account
  When Clicks on "User" tab
  And Select the user from user list and click on "  Suspend" button from kebab menu
  Then Verify that the advertiser user account suspended successfully with the confirmation message as "Advertiser manage user Suspended successfully"
  When Clicks on the profile icon
  And Clicks on logout button
  Then Ensure that the admin successfully logout from admin portal with the confirmation message
  And Close the browser
  
 @Regression 
 Scenario: The admin tries to active the advertiser user account
  When Clicks on "User" tab
  And Select the user from user list and click on "  Active" button from kebab menu
  Then Verify that the advertiser user account activated successfully with the confirmation message as "Advertiser manage user Activated successfully"
  When Clicks on the profile icon
  And Clicks on logout button
  Then Ensure that the admin successfully logout from admin portal with the confirmation message
  And Close the browser
  
 @Regression 
 Scenario: The admin tries to delete the advertiser user account
  When Clicks on "User" tab
  And Select the user from user list and click on "  Delete" button from kebab menu
  And Clicks on ok button on confirmation popup
  Then Verify that the advertiser user account activated successfully with the confirmation message as "Advertiser manage user Deleted successfully"
  When Clicks on the profile icon
  And Clicks on logout button
  Then Ensure that the admin successfully logout from admin portal with the confirmation message
  And Close the browser
  
  
  
  
  
  
  
  
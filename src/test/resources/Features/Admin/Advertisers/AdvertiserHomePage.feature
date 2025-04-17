
Feature: Advertiser Home Page

 Background:
  Given The admin launches the browser
  When Enters the url as "https://v3opend.tech-active.com/auth/manage_opend"
  Then Verify that the admin is navigated to the opend website
  When Enters the email address as "admin@opend.com" and the password as "1234"
  And  Clicks on the sign in button
  Then Verify that the admin is navigated to the dashboard page with the confirmation message
  When Clicks on advertisers from the side menu bar
  Then Verify that the admin is navigated to the advertisers home page

   @Smoke
   Scenario: The admin filters the advertiser by status and verifies the results in the table
    When The admin selects "Active" from the "All Status" filter dropdown
    Then Verify the table should display only advertisers with the status "Active" from "Status" column
    When Clicks on the profile icon
    And Clicks on logout button
    Then Ensure that the admin successfully logout from admin portal with the confirmation message
    And Close the browser
  
  
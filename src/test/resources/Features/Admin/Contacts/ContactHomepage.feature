Feature: Contacts Home Page 
 
 Background:
   Given The admin launches the browser
   When Enters the url as "https://v3opend.tech-active.com/auth/manage_opend"
   Then Verify that the admin is navigated to the opend website
   When Enters the email address as "admin@opend.com" and the password as "1234"
   And  Clicks on the sign in button
   Then Verify that the admin is navigated to the dashboard page with the confirmation message
   When Clicks on contacts from the side menu bar
   Then Verify that the admin is navigated to the contacts home page
   
  @Smoke
   Scenario: The admin filters the contacts by status and verifies the results in the table
    When The admin selects "Active" from the "All Status" filter dropdown
    Then Verify the table should display only contacts with the status "Active" from "Status" column
    When Clicks on the profile icon
    And Clicks on logout button
    Then Ensure that the admin successfully logout from admin portal with the confirmation message
    And Close the browser
    
   @Smoke 
   Scenario: The admin filters the contacts by data type and verifies the results in the table
    When The admin selects "B2C" from the "All" filter dropdown
    Then Verify the table should display only contacts with the type "B2C" from "Type" column
    When Clicks on the profile icon
    And Clicks on logout button
    Then Ensure that the admin successfully logout from admin portal with the confirmation message
    And Close the browser
    
   @Sanity
   Scenario: The admin filters the contacts by Advertiser and verifies the results in the table
    When The admin selects "DigiKnw Ltd (sunny@digiknw.com)" from the "Select Publisher" filter dropdown
    Then Verify the table should display only contacts with the type "DigiKnw Ltd" from "Publisher" column
    When Clicks on the profile icon
    And Clicks on logout button
    Then Ensure that the admin successfully logout from admin portal with the confirmation message
    And Close the browser
    
   @Regression
   Scenario: The admin filters the campaigns by all filters and verifies the results in the table
    When The admin selects "Active" from the "All Status" filter dropdown
    Then Verify the table should display only contacts with the status "Active" from "Status" column
    When Reset the page by reset button
    When The admin selects "B2C" from the "All" filter dropdown
    Then Verify the table should display only contacts with the type "B2C" from "Type" column
    When Reset the page by reset button
    When The admin selects "DigiKnw Ltd (sunny@digiknw.com)" from the "Select Publisher" filter dropdown
    Then Verify the table should display only contacts with the type "DigiKnw Ltd" from "Publisher" column
    And Clicks on the profile icon
    And Clicks on logout button
    Then Ensure that the admin successfully logout from admin portal with the confirmation message
    And Close the browser
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
Feature: Campaigns Home page
  
  Background:
   Given The admin launches the browser
   When Enters the url as "https://v3opend.tech-active.com/auth/manage_opend"
   Then Verify that the admin is navigated to the opend website
   When Enters the email address as "admin@opend.com" and the password as "1234"
   And  Clicks on the sign in button
   Then Verify that the admin is navigated to the dashboard page with the confirmation message
   When Clicks on campaigns from the side menu bar
   Then Verify that the admin is navigated to the campaigns home page
   
   @Smoke
   Scenario: The admin filters the campaigns by status and verifies the results in the table
    When The admin selects "Scheduled" from the "All Status" filter dropdown
    Then Verify the table should display only campaigns with the status "Scheduled" from "Status" column
    When Clicks on the profile icon
    And Clicks on logout button
    Then Ensure that the admin successfully logout from admin portal with the confirmation message
    And Close the browser
    
   @Smoke 
   Scenario: The admin filters the campaigns by campaign type and verifies the results in the table
    When The admin selects "Regular" from the "All Types" filter dropdown
    Then Verify the table should display only campaigns with the type "REGULAR" from "Campaign Type" column
    When Clicks on the profile icon
    And Clicks on logout button
    Then Ensure that the admin successfully logout from admin portal with the confirmation message
    And Close the browser
    
   @Smoke 
   Scenario: The admin filters the campaigns by Campaign Mode and verifies the results in the table
    When The admin selects "CPM" from the "All Modes" filter dropdown
    Then Verify the table should display only campaigns with the type "CPM" from "Mode" column
    When Clicks on the profile icon
    And Clicks on logout button
    Then Ensure that the admin successfully logout from admin portal with the confirmation message
    And Close the browser
    
   @Sanity
   Scenario: The admin filters the campaigns by Advertiser and verifies the results in the table
    When Clicks on filter icon
    And The admin selects "Tech Active (sudeep@active.agency)" from the "Please Select Advertiser" filter dropdown
    Then Verify the table should display only campaigns with the type "Tech Active" from "Advertiser" column
    When Clicks on the profile icon
    And Clicks on logout button
    Then Ensure that the admin successfully logout from admin portal with the confirmation message
    And Close the browser 
    
   #End to End testing the campaigns by all the filters
   @Regression
   Scenario: The admin filters the campaigns by all filters and verifies the results in the table
    When The admin selects "Scheduled" from the "All Status" filter dropdown
    Then Verify the table should display only campaigns with the status "Scheduled" from "Status" column
    When Reset the page by reset button
    And The admin selects "Regular" from the "All Types" filter dropdown
    Then Verify the table should display only campaigns with the type "REGULAR" from "Campaign Type" column
    When Reset the page by reset button
    And The admin selects "CPM" from the "All Modes" filter dropdown
    Then Verify the table should display only campaigns with the type "CPM" from "Mode" column 
    When Reset the page by reset button
    And Clicks on filter icon
    And The admin selects "Tech Active (sudeep@active.agency)" from the "Please Select Advertiser" filter dropdown
    Then Verify the table should display only campaigns with the type "Tech Active" from "Advertiser" column  
    And Clicks on the profile icon
    And Clicks on logout button
    Then Ensure that the admin successfully logout from admin portal with the confirmation message
    And Close the browser
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
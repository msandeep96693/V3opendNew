 Feature: New Contacts Creation
 
 Background:
   Given The admin launches the browser
   When Enters the url as "https://v3opend.tech-active.com/auth/manage_opend"
   Then Verify that the admin is navigated to the opend website
   When Enters the email address as "admin@opend.com" and the password as "1234"
   And  Clicks on the sign in button
   Then Verify that the admin is navigated to the dashboard page with the confirmation message
   When Clicks on contacts from the side menu bar
   Then Verify that the admin is navigated to the contacts home page
   When Clicks on add contact button
   Then Verify that the admin should navigate to the upload contact page
 
  @Smoke
  Scenario: The admin creates a new contact
   When Select an publisher from publisher dropdown
   And Enters a contact list name
   And Select a data type
   And Select a audience type from audience type popup dropdown
   And Enters a cpm payout price
   And Enters a usage limit per day
   And Select an country from country dropdown
   And Select a permitted sectors from permitted sectors popup dropdown
   And upload a csv file into fileupload field
   And Enters a default from name
   And Clicks on add button
   Then Make sure that the admin is redirected to data mapping page
   When Mapping all the data
   And Click on add button
   Then Verify that the new contact successfully created with the confirmation message
   And Verify that the admin is redirected to contacts home page
   And Ensure that the newly created contact is displayed on the contacts home page
   When Clicks on the profile icon
   And Clicks on logout button
   Then Ensure that the admin successfully logout from admin portal with the confirmation message
   And Close the browser
   
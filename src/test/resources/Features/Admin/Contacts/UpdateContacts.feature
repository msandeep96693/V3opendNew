 Feature: Contacts Updation
 
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
  Scenario: The admin update a contact
   When Clicks on edit button from kebab menu dropdown on contacts
   And Select a data type
   And Select a audience type from audience type popup dropdown
   And Enters a cpm payout price
   And Enters a usage limit per day
   And Select a permitted sectors from permitted sectors popup dropdown
   And Enters a default from name
   And Click on update button
   And Clicks on ok button on confirmation popup
   Then Verify that the contact successfully updated with the confirmation message
   And Verify that the admin is redirected to contacts home page
   When Clicks on the profile icon
   And Clicks on logout button
   Then Ensure that the admin successfully logout from admin portal with the confirmation message
   And Close the browser
   
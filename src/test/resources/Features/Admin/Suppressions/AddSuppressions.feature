Feature: New Suppression Creation

   Background:
   Given The admin launches the browser
   When Enters the url as "https://v3opend.tech-active.com/auth/manage_opend"
   Then Verify that the admin is navigated to the opend website
   When Enters the email address as "admin@opend.com" and the password as "1234"
   And  Clicks on the sign in button
   Then Verify that the admin is navigated to the dashboard page with the confirmation message
   When Clicks on suppression from the side menu bar
   Then Verify that the admin is navigated to the suppression home page
   When Clicks on add suppression button
   Then Make sure that the suppression type popup is displayed
   
 
  @Smoke
  Scenario: The admin creates a new advertiser suppression
   When Select a advertiser suppression type
   And Select a advertiser from advertiser dropdown
   And Clicks on add button
   Then Verify that the admin is redirected to upload suppression page
   When Enters a supprssion list name
   And Upload a suppression file
   And select a upload type
   And Clicks on add button
   Then Ensure that the mapping popup should be displayed
   When Mapping all the mandatory fields
   And Click on upload button
   Then Verify that the new suppression successfully created with the confirmation message
   And Verify that the admin is redirected to suppression home page
   And Ensure that the newly created suppression is displayed on the suppression home page
   When Clicks on the profile icon
   And Clicks on logout button
   Then Ensure that the admin successfully logout from admin portal with the confirmation message
   And Close the browser
   
   
   
   
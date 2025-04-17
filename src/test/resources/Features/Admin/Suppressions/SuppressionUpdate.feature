Feature: Suppression updation

   Background:
   Given The admin launches the browser
   When Enters the url as "https://v3opend.tech-active.com/auth/manage_opend"
   Then Verify that the admin is navigated to the opend website
   When Enters the email address as "admin@opend.com" and the password as "1234"
   And  Clicks on the sign in button
   Then Verify that the admin is navigated to the dashboard page with the confirmation message
   When Clicks on suppression from the side menu bar
   Then Verify that the admin is navigated to the suppression home page
   
  @Smoke
  Scenario: The admin update a suppression
   When Clicks on edit button from kebab menu dropdown on suppression
   And Upload a suppression file
   And Clicks on update button
   Then Ensure that the mapping popup should be displayed
   When Mapping all the mandatory fields
   And Click on upload button
   Then Verify that the suppression successfully updated with the confirmation message
   And Verify that the admin is redirected to suppression home page
   When Clicks on the profile icon
   And Clicks on logout button
   Then Ensure that the admin successfully logout from admin portal with the confirmation message
   And Close the browser
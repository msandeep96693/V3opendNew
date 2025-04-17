
Feature: Recurring Ads Updation
 
  Background:
   Given The admin launches the browser
   When Enters the url as "https://v3opend.tech-active.com/auth/manage_opend"
   Then Verify that the admin is navigated to the opend website
   When Enters the email address as "admin@opend.com" and the password as "1234"
   And  Clicks on the sign in button
   Then Verify that the admin is navigated to the dashboard page with the confirmation message
   When Clicks on recurring Ads from the side menu bar
   Then Verify that the admin is navigated to the recurring Ads home page
 
  @Smoke
  Scenario: The admin update the recurring Ads
   When Clicks on edit button from kebab menu dropdown
   And Select a business type
   And Select a advertiser and publisher cast type
   And Select a campaign mode
   And Select a country from campaign country dropdown
   And Select a audience type from audience type dropdown
   And Select a campaign sector from campaign sector popup dropdown
   And Select a publishers from publisher popup dropdown
   And Select a gender
   And Select a default email domain
   And Disable audience option
   And Enters the budget per day
   And Select a email deliverability
   And Select a email scheduling
   And Click on proceed button
   
   #2nd step of recurring ads creation
   And Enters a subjectA and SubjectB
   And Enters a email body one and email body two
   And Click on schedule campaign button from recurring ads
   Then The recurring Ads successfully updated with confirmation message
   And The admin should be redirected to recurring Ads home page
   When Clicks on the profile icon
   And Clicks on logout button
   Then Ensure that the admin successfully logout from admin portal with the confirmation message
   And Close the browser
   
   
   
   
   
   
   
   
   
   
   
   
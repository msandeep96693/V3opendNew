   
Feature: Campaigns Updation
 
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
  Scenario: The admin update a campaign
   When Clicks on edit button from kebab menu dropdown
   Then Verify the whether it is first step of campaign
   And Select a business type
   And Enter a campaign name
   And Select a advertiser and publisher cast type
   And Select a campaign mode
   And Select a country from campaign country dropdown
   And Select a audience type from audience type dropdown
   And Select a capaign sector from campaign sector popup dropdown
   And Select a publishers from publisher popup dropdown
   And Clicks on proceed button on first step
   
   #2nd step of campaign -- campaign template
   Then verify that the admin should be redirected to second step of campaign
   When Select a campaign type
   And Enters subject name into subject textfield
   And Enters template into email body area
   And Clicks on proceed button on second step
   
   #3nd step of campaign -- Choose Audience
   Then Verify that the admin should be redirected to third step of campaign
   When Select a gender
   And Select a default email domain
   And Disable audience option
   And Clicks on proceed button in third step
   
   #4nd step of campaign -- Targeting & Send
   Then Verify that the admin should be redirected to fourth step of campaign
   When Select a email deliverability
   And Select a email scheduling
   And Enter audience reach
   And Click on schedule campaign button
   Then The campaign updated successfully with confirmation message
   And The admin should be redirected to campaign home page
   When Clicks on the profile icon
   And Clicks on logout button
   Then Ensure that the admin successfully logout from admin portal with the confirmation message
   And Close the browser
   
   
   
   
   
   
   
   
   
   
   
   
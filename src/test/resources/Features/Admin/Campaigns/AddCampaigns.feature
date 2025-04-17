
Feature: New campaign Creation
 
  Background:
   Given The admin launches the browser
   When Enters the url as "https://v3opend.tech-active.com/auth/manage_opend"
   Then Verify that the admin is navigated to the opend website
   When Enters the email address as "admin@opend.com" and the password as "1234"
   And  Clicks on the sign in button
   Then Verify that the admin is navigated to the dashboard page with the confirmation message
   When Clicks on campaigns from the side menu bar
   Then Verify that the admin is navigated to the campaigns home page
   When Clicks on add campaign new button
   Then Verify that the admin should navigate to the new campaigns page
   And Verify the whether it is first step of campaign
 
  @Smoke
  Scenario: The admin creates a Schedule campaign
   When Select an advertiser from advertiser dropdown
   And Select a business type
   And Enter a campaign name
   And Select a advertiser and publisher cast type
   And Select a campaign mode
   And Select a country from campaign country dropdown
   And Select a audience type from audience type dropdown
   And Select a capaign sector from campaign sector popup dropdown
   And Select a publishers from publisher popup dropdown
   And Clicks on proceed button in first step
   
   #2nd step of campaign -- campaign template
   Then verify that the admin should be redirected to second step of campaign
   When Select a campaign type
   And Enters subject name into subject textfield
   And Enters template into email body area
   And Clicks on proceed button in second step
   
   #3nd step of campaign -- Choose Audience
   Then Verify that the admin should be redirected to third step of campaign
   When Select a gender
   And Select a location
   And Select a region
   And Select a town
   And Select a default email domain
   And Disable audience option
   And Clicks on proceed button in third step
   
   #4nd step of campaign -- Targeting & Send
   Then Verify that the admin should be redirected to fourth step of campaign
   When Select a email deliverability
   And Select a email scheduling
   And Enter audience reach
   And Click on schedule campaign button
   Then The new campaign should be successfully created with confirmation message
   And The admin should be redirected to campaign home page
   When Clicks on the profile icon
   And Clicks on logout button
   Then Ensure that the admin successfully logout from admin portal with the confirmation message
   And Close the browser
   
   
  #@Smoke
  #Scenario: The admin creates a immediate campaign
   #When Select an advertiser from advertiser dropdown
   #And Select a business type
   #And Enter a campaign name
   #And Select a advertiser and publisher cast type
   #And Select a campaign mode
   #And Select a country from campaign country dropdown
   #And Select a audience type from audience type dropdown
   #And Select a capaign sector from campaign sector popup dropdown
   #And Select a publishers from publisher popup dropdown
   #And Clicks on proceed button in first step
   #
   #2nd step of campaign -- campaign template
   #Then verify that the admin should be redirected to second step of campaign
   #When Select a campaign type
   #And Enters subject name into subject textfield
   #And Enters template into email body area
   #And Clicks on proceed button in second step
   #
   #3nd step of campaign -- Choose Audience
   #Then Verify that the admin should be redirected to third step of campaign
   #When Select a gender
   #And Select a location
   #And Select a region
   #And Select a town
   #And Select a default email domain
   #And Disable audience option
   #And Clicks on proceed button in third step
   #
   #4nd step of campaign -- Targeting & Send
   #Then Verify that the admin should be redirected to fourth step of campaign
   #When Select a email deliverability
   #And Select a immediate email scheduling
   #And Enter audience reach
   #And Click on start campaign button
   #Then The new campaign should be successfully created with confirmation message
   #And The admin should be redirected to campaign home page
   #When Clicks on the profile icon
   #And Clicks on logout button
   #Then Ensure that the admin successfully logout from admin portal with the confirmation message
   #And Close the browser
   #
  #@Smoke
  #Scenario: The admin creates a immediate campaign with custom domains
   #When Select an advertiser from advertiser dropdown
   #And Select a business type
   #And Enter a campaign name
   #And Select a advertiser and publisher cast type
   #And Select a campaign mode
   #And Select a country from campaign country dropdown
   #And Select a audience type from audience type dropdown
   #And Select a capaign sector from campaign sector popup dropdown
   #And Select a publishers from publisher popup dropdown
   #And Clicks on proceed button in first step
   #
   #2nd step of campaign -- campaign template
   #Then verify that the admin should be redirected to second step of campaign
   #When Select a campaign type
   #And Enters subject name into subject textfield
   #And Enters template into email body area
   #And Clicks on proceed button in second step
   #
   #3nd step of campaign -- Choose Audience
   #Then Verify that the admin should be redirected to third step of campaign
   #When Select a gender
   #And Select a location
   #And Select a region
   #And Select a town
   #And Select a custom email domain
   #And Disable audience option
   #And Clicks on proceed button in third step
   #
   #4nd step of campaign -- Targeting & Send
   #Then Verify that the admin should be redirected to fourth step of campaign
   #When Select a email deliverability
   #And Select a immediate email scheduling
   #And Enter audience reach
   #And Click on start campaign button
   #Then The new campaign should be successfully created with confirmation message
   #And The admin should be redirected to campaign home page
   #When Clicks on the profile icon
   #And Clicks on logout button
   #Then Ensure that the admin successfully logout from admin portal with the confirmation message
   #And Close the browser
   #
  #@Smoke
  #Scenario: The admin creates a immediate campaign with standard domains
   #When Select an advertiser from advertiser dropdown
   #And Select a business type
   #And Enter a campaign name
   #And Select a advertiser and publisher cast type
   #And Select a campaign mode
   #And Select a country from campaign country dropdown
   #And Select a audience type from audience type dropdown
   #And Select a capaign sector from campaign sector popup dropdown
   #And Select a publishers from publisher popup dropdown
   #And Clicks on proceed button in first step
   #
   #2nd step of campaign -- campaign template
   #Then verify that the admin should be redirected to second step of campaign
   #When Select a campaign type
   #And Enters subject name into subject textfield
   #And Enters template into email body area
   #And Clicks on proceed button in second step
   #
   #3nd step of campaign -- Choose Audience
   #Then Verify that the admin should be redirected to third step of campaign
   #When Select a gender
   #And Select a location
   #And Select a region
   #And Select a town
   #And Select a standard email domain
   #And Disable audience option
   #And Clicks on proceed button in third step
   #
   #4nd step of campaign -- Targeting & Send
   #Then Verify that the admin should be redirected to fourth step of campaign
   #When Select a email deliverability
   #And Select a immediate email scheduling
   #And Enter audience reach
   #And Click on start campaign button
   #Then The new campaign should be successfully created with confirmation message
   #And The admin should be redirected to campaign home page
   #When Clicks on the profile icon
   #And Clicks on logout button
   #Then Ensure that the admin successfully logout from admin portal with the confirmation message
   #And Close the browser
   
   
   
   
   
   
   
   
   
   
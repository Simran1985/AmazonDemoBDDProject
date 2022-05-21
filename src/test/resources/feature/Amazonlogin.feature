Feature: Amazon Navigation Link of Account
@AccountValidation
Scenario:ValidateLogin
   Given I am on the Login page URL "https://www.amazon.in/"
   Then I click on sign in button and wait for sign in page
   Then I should see Sign In Page
   When I enter email as "jatys1990@gmail.com"
   And I Click on Continue button
   And I enter password as this "Pollini312890"
   And I click on login button
   Then I am logged in
   Then I Click on Sign out button
    
    
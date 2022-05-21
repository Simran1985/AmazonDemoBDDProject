Feature: Pay Module
@PayOption
Scenario: I want to validate Pay Module
   Given I opened brower and url is navigated
   Then I searched for product as"iphone x"
   Then I click search button
   And I selected phone "iphone x"
   Then I add to cart
   Then  I proceed to checkout
   Then I click on Sign in
   Then I enter email "jatys1990@gmail.com"
   And I click on continue button
   Then I enter password "Pollini312890"
   
   
Feature: Navigate WishList
@WishList 
Scenario:CreateWishList
    Given I have a browser open and url is navigated
    Then I want to click on AccountList
    Then I enter email "jatys1990@gmail.com"
    Then I click continue
    Then I enter Password "Pollini312890"
    Then I click on signin
    Then search product "iphone x"
    Then I clicked search button
    And selected phone "iphone x"
    Then I Added to a wish List
    
   
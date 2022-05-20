
Feature: Title Pay Module
 
  @PayModule
  Scenario: I want to validate Pay Module
    Given  Browser opened and url is navigated
     Then Searched for  product as  "infuser water bottle"
    Then click search button
   And Iclicked on bottle
   Then Add to cart
   
   Then Proceed to checkout
   Then Enter your email "hp_sandhu@hotmail.com"
   And click on continue buttonn
   Then Password "Nabhaite301!"
   And click Signin
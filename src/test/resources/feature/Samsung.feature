Feature: Samsung Galaxys10
@Samsungproductsearch
Scenario: Search product
    Given I have opened browser and url is navigated
    When I search for product as "Samsung Galaxys10"
    Then I click on search button
    Then I want to select a phone "Samsung Galaxys10"
    Then I want to click on price 
    Then I want to click on Select Delivery Location
    And I Sendkeys in postal code field "L7C3v4"
    Then I want to click on Apply
      
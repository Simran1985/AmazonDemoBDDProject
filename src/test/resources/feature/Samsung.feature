
@Samsung
Feature: Search Samsung Galaxys10

  @Productsearch
  
  Scenario: Search product
    Given I have a browser opened and url is navigated
    When I search for a product as "Samsung Galaxys10"
    Then I click on search button
    Then I want to select a phone "Samsung Galaxys10"
     Then I want to click on price 
     Then I want to click on Select Delievery Location
    And Sendkeys in postal code field "L7C3V1"
      Then I want to click on Apply
      
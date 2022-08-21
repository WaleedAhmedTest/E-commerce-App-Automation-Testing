@regression
Feature: Add to shopping cart
  Scenario: Logged user could add different products to Shopping cart
    Given user in home page
    Then user selects the Apple MacBook pro product
    And adds it to shopping cart
    Then confirmation message is displayed
    Then go to shopping cart
    Then check that the macBook Pro product is added
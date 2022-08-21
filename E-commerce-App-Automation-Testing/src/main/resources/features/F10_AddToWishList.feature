@regression
Feature: Add to wishlist
  Scenario: Logged user could add different products to Wishlist
    Given user in home page
    Then user selects the Apple MacBook pro product
    And adds it to wishlist
    Then confirm wishlist message is displayed
    Then go to wishlist
    Then check that the macBook Pro product is added
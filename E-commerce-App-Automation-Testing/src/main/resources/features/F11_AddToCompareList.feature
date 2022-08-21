@regression
Feature: Add to compare list
  Scenario: Logged user could add different products to compare list
    Given user in home page
    Then user adds HTCOne phone directly
    Then user selects the Apple MacBook pro product
    And adds it to compare list
    Then confirm compare list message is displayed
    Then go to compare list
    Then check that the macBook Pro product is added
    Then check that the HTCOne product is added

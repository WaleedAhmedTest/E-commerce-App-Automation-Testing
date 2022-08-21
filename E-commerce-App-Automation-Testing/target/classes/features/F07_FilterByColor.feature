@regression
Feature: Filter by color
  Scenario: Logged user could filter with color
    Given user in home page
    Then user goes to shoes under apparel
    Then check if grey shoes is displayed
    And check if red shoes is displayed
    Then filter by red color
    Then check if grey shoes is not displayed
    And check if red shoes is displayed

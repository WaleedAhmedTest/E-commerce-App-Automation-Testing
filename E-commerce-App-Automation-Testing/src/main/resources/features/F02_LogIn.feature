@regression
Feature: Log in
  Scenario: User could log in with valid email and password
    Given user in log in page
    Then user fills email field
    And user fills password field
    Then press on the log in button
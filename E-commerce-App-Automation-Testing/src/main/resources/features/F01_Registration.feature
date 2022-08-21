@regression
Feature: User Registration
  Scenario: User could register with valid data
    Given user in register page
    Then chooses male gender
    And fills first and last name fields
    And chooses a date of birth
    And fills email field
    And fills company name field
    And fills password and confirm password fields correctly
    Then press the register button
    Then asserts registration success
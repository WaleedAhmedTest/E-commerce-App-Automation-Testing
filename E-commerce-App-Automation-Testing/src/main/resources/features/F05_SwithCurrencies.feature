@regression
Feature: Switch currencies
#  Background: Log in
#    Given user in log in page
#    Then user fills email field
#    And user fills password field
#    Then press on the log in button

  Scenario: Logged User could switch between currencies US-Euro
    Given user in home page
    Then user change currency to Euro
    Then user changes currency back to dollar
@regression
Feature: Search product
#  Background: Log in
#    Given user in log in page
#    Then user fills email field
#    And user fills password field
#    Then press on the log in button

  Scenario: Logged User could search for any product
    Given user in home page
    Then user searches for an item
    Then press on search button
    Then selects the product
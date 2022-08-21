@regression
Feature: Select category
#  Background: Log in
#    Given user in log in page
#    Then user fills email field
#    And user fills password field
#    Then press on the log in button

  Scenario: Logged user could select different Categories (category version)
    Given user in home page
    Then user selects Books category

  Scenario: Logged user could select different Categories (sub-category version)
    Given user in home page
    Then user selects Cellphones subcategory under electronics

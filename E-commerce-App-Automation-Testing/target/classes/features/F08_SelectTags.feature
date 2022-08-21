@regression
Feature: Select tags
  Scenario: Logged user could select different tags
    Given user in computers category
    Then user clicks on game tag
    Then user redirects to games tag URL
    And check that title contains game tag
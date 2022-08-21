@regression
Feature: Successful order
#  Background: logged in user add item to cart
#
#    Given user in log in page
#    Then user fills email field
#    And user fills password field
#    Then press on the log in button
#
#    Given user in home page
#    Then user selects the Apple MacBook pro product
#    And adds it to shopping cart
#    Then confirmation message is displayed
#    Then go to shopping cart

  Scenario: Create successful Order
    Given user in shopping cart page
    Then user chooses to wrap the gift
    Then user agrees to policies
    Then user checks out
    Then user fills billing address
    Then user chooses shipping method
    Then user finishes remaining steps and confirms order
    Then user checks the success of the order


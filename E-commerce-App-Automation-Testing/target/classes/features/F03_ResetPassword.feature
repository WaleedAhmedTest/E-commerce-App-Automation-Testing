@regression
Feature: Reset password
  Scenario: User could reset his/her password successfully
    Given user in reset password page
    Then user enters a valid email
    Then press the recovery button
    Then confirm that the recovery message is displayed
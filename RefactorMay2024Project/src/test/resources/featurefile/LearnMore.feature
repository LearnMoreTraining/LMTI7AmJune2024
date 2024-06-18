Feature: Learn More Automation

  @lmti01
  Scenario: Alert message validation in confirmation box
    Given user click on confirmation box button
    Then user validate the alert message
    And user validate the UI message

  @lmti02 @RT
  Scenario: Change in Text Validation
    Given user clicks on change Text button
    Then validate the change text value

  @lmti03 @RT
  Scenario: login validation
    Given user enter the user name and password
    Then validate the title of the page
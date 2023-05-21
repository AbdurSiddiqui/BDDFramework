Feature: BOA login Page

  @Regression
  Scenario: Login functionality with incorrect username
    Given user opens chrome browser
    When user enters url
    And user enters incorrect username and password
    And user clicks saveID button
    Then user validate open account button


Feature: Test Login Functionality

  Scenario: Check login is successful with valid credentials
    Given Browser is open
    And User is on login page
    When User enters username and password
    And Clicks login button
    Then User is Navigated to the home page

Feature: To check Hospital Registration functionality

  Scenario: To Test Hospital Registration with valid inputs
    Given Open browser 
    And Enter URL.It will navigated to Hospital registration page
    When Enter all valid inputs
    And click on submit button
    Then Hospital should successfully registered with vezencare

Feature: Check Member login Functionality

  Scenario Outline: Chekck Member login functinality with valid credentials
    Given Member on home page
    When Member enters valid <username> and <password>
    And clicks on login button
    Then Member should navigated to dashboard page

    Examples: 
      | username   | password |
      | 7095005155 |   803114 |
      | 7095005155 |     1234 |
      | 9755768494 |   803114 |
      | 8035858900 |   467380 |

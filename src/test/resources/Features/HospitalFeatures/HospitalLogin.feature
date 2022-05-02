@HosMandatory
Feature: Feature to check Hospital login functionality

  Scenario Outline: Check Hospital login successfully with valid credentials
    Given Hospital on login page
    When Hospital enters <husername> and <hpassword>
    And click on login button
    Then Hospital should navigated to Hospital dashboard page
    
    Examples:
	  |husername|hpassword|
	  |9346078959|1234|
	  |9346078959|12345|
	  |9354661256|1234|
	  |9543138931|56238|

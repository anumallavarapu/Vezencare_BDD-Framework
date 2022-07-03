Feature: To check caretaker login functionality

Scenario Outline: Validate to login functionality with valid credentials
				Given User Launch Chrome Browser
				When User Open URL "https://qa.vezencare.com/Home/CaretakerLogin"
				And User enters username as <cusername> and password as <cpassword>
				And Click on Caretaker Login
				Then Page title should be "Vezen Care :: Dashboard"
				And Click on Logout button
				And close browser
				
				Examples:
			|cusername|cpassword|
	  	|9346078959|1234|
		  |9346078959|12345|
		  |9354661256|1234|
		  |9543138931|56238|
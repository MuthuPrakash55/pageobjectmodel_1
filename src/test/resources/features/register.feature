Feature: Register for online banking

Scenario: verify that user can able to register the login info
				Given user opens "chrome" browser
				When user enters the url of "https://parabank.parasoft.com/parabank"
				Then user navigate to the login page 
				And use click the register button
				Then user navigate to the register page
				And user want to fill the required field in that page
				When user clicks the register button
#				Then user navigate to the profile page

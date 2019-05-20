Feature: Login Functionality

Scenario: Verify Login successfully

Given User in login page
When User enter valid useername and valid password
And User click the Signin button
Then Verify user login successfully 
Feature: Signin Funtionality

Scenario: User has signin with valid credentials 
Given User has navigate to Customer Loginpage 
When User has Enter Valid email in email field 
And User has Enter Valid password in password field
And User has click on signin button
Then User has sucessfully signed in message displyed

Scenario: User has signin with Invalid credentials 
Given User has navigate to Customer Loginpage 
When User has Enter InValid email in email field 
And User has Enter InValid password in password field
And User has click on signin button
Then User has should be get proper message about mismatch credentials

Scenario: User has signin with Invalid email and Valid password 
Given User has navigate to Customer Loginpage 
When User has Enter InValid email in email field 
And User has Enter Valid password in password field
And User has click on signin button
Then User has should be get proper message about mismatch credentials

Scenario: User has signin with valid email and InValid password 
Given User has navigate to Customer Loginpage 
When User has Enter Valid email in email field 
And User has Enter InValid password in password field
And User has click on signin button
Then User has should be get proper message about mismatch credentials

Scenario: User has signin without credentials
Given User has navigate to Customer Loginpage 
When User has  dont Enter  email in email field 
And User has  dont Enter password in password field
And User has click on signin button
Then User has should be get proper message about email and password error 

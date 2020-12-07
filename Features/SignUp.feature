Feature: As a new user, i want to sign up a new account
Scenario: Sign a new account
Given I am on the demoblaze.com home page.
When i click on “user name” 
And i create a new password
And i click on “sign up” 
Then i successfully sign up a new account
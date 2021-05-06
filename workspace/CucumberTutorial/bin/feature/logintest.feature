Feature: Login
Description: This feature will test Login Functionality
Scenario: Successful Login with Valid Credentials 
Given User is on Home Page
When User enters UserName and Password
Then he can visit the practice page 

Scenario: Successful LogOut 
When User Logout from the Application 
Then he cannot visit practice page 
Feature: Gmail Login Feature

Scenario Outline: Gmail Login Test Scenario

Given on Login Page
When title of login page is Gmail
Then User enters username clicks enters password
Then user clicks on password Next 
Then user on homepage
Examples:
  |username  |  password |
  |naveenk   |  test123  |
  |azizk     |  1234     |
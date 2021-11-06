Feature: Login
    I want to log into Conduit 

    Scenario: conduit login 
    Given I open conduit login page
    When I type in 
    |username| password|
    |zeezaiz@yahoo.com | Playstation786|
    When I click on sign in button 
    Then "your feed" should be shown 

    
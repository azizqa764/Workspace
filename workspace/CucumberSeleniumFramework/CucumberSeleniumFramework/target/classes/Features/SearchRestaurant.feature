Feature: Use the website to find restaurants
  So that I can order food
  As a hungry customer
  I want to be able to find restaurants in my area

Scenario: Search for restaurants in an area
  Given I want food in "136 Market Avenue, Winnipeg, MB, Canada"
  When I search for restaurants
  Then I should see some restaurants in "136 Market Avenue, Winnipeg, MB, Canada"
  
Scenario: Searchh for Italian Cuisines in an area  
	Given  I search for restaurants in my given area for "Italian"
	When 	I want Italian cusine provider restaurants
	Then I should see some restaurants with Italian cusuine
	
Scenario: Click on skip the dishes logo should drive to home page
	Given I am on any other page than homepage
	When I click on skip the dishes logo
	Then I will land on home page
	
	
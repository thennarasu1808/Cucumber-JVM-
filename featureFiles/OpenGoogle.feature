Feature:  This is to test Google search
Scenario: Google search scenario
	Given user is entering google.co.in	
	When user is typing the search term "Selenium"
	And  enters the return key
	Then the user should see the search results
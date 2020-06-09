Feature: Deal data creation 

Scenario: Free CRM Create a new deal scenario 

	Given user is already on Login Page 
	When title of login page is Free CRM 
	Then user enters username and password 
	
		|		username		   | password	 |			
		| thennarasu1808@gmail.com | Rainie@1808 |
		
	Then user clicks on login button 
	Then user is on home page 
	Then user moves to new deal page 
	Then user enters deal details 
	
		|  title        | amount  | probability | commission |
		| Thenna deal 1 |  1000   |    50       |      10    |
		| Thenna deal 2 |  1300	  |    56	    |      20    |
		
	Then Close the browser
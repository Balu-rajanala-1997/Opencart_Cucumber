Feature: Login with Valid Credentials

 @sanity @regression
 Scenario: Successful login
    Given the user navigates to login page
    When the user enters email as "balurajanala3@gmail.com" and password as "Balu@1997"
    And the user clicks on the Login button
    Then the user should be redirected to the MyAccount page

    
 #@regression
 #Scenario Outline: Login Data Driven
	#Given the user navigates to login page
	#When user enters email as "<email>" and password as "<password>"
	#And the user clicks on the Login button
	#Then the user should be redirected to the MyAccount page
	
	#Examples:
		#| email 				  | password |
		#| balurajanala3@gmail.com | Balu@1997 |
		#| baluraja1997@gmail.com  | Balu@1997 |
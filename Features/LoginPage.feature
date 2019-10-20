Feature: Login Action
Descriptio: This Feature will Test a login Feature
#Step1: simple process and hard code everything in Test definition
#Scenario: Successful Login with Valid Credentials
	#Given Open the Browser
	#When Enter URL
	#And click on My Account
	#And Provide valid username "mahendra.barik330@gmail.com" and password "2019@Matul"
	#And click on login
	#Then User must Login Successfully
	
#Stpe2: Passing parameter to Test definition using regular expression	
	#Scenario: Successful Login with Valid Credentials
	#Given Open the Browser
	#When Enter URL "http://practice.automationtesting.in/"
	#And click on My Account
	#And Provide valid username "mahendra.barik330@gmail.com" and password "2019@Matul"
	#And click on login
	#Then User must Login Successfully
	
#Stpe3: Scenario Outline and examples---->This approach is required for Data Driven Process	
	#Scenario Outline: Successful Login with Valid Credentials
	#Given Open the Browser
	#When Enter URL "http://practice.automationtesting.in/"
	#And click on My Account
	#And Provide valid username "<username>" and password "<password>"
	#And click on login
	#Then User must Login Successfully
	#Then verify login
	
	#Examples:
	#| username | password |
	#| mahendra.barik330@gmail.com | 2019@Matul1 |
	#| mahendra.barik330@gmail.com | 2019@Matul|
	#| mahendra.barik330@gmail.com | 2019@Matul2 |
	
#Stpe4: Login with Data Table Param with single Input---->This approach is required for Data Driven Process	
	#Scenario: Successful Login with Valid Credentials
	#Given Open the Browser
	#When Enter URL "http://practice.automationtesting.in/"
	#And click on My Account
	#And Provide valid username and password
	#| mahendra.barik330@gmail.com | 2019@Matul|
	#And click on login
	#Then User must Login Successfully
	#Then verify login	
	
#Stpe5: Login with Data Table Param with Single Input but with Header---->This approach is required for Data Driven Process	
	Scenario: Successful Login with Valid Credentials
	Given Open the Browser
	When Enter URL "http://practice.automationtesting.in/"
	And click on My Account
	And Provide valid username and password
	| username | password |
	| mahendra.barik330@gmail.com | 2019@Matul |
	| mahendra.barik330@gmail.com | 2019@Matul |
	And click on login
	Then User must Login Successfully
	#Then verify login		
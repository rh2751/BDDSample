Feature: User Login Feature

#Scenario: Valid Login
#Given User is on Login Page
#When User enters credentials
#Then Should display Success Msg

#"tomsmith"
#"SuperSecretPassword!"

#Scenario: Valid Login
#Given User is on Login Page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display Success Msg

#cenario Outline: Valid Login
#Given User is on Login Page
#When User enters "<username>" and "<password>"
#Then Should display Success Msg

#Examples:
#		| username	| password	|
#		|	tomsmith	|	SuperSecretPassword! |
#		|	testuser1 | Welcome123 |
#		| testuser2	| Welcome123 |
		
Scenario: Valid Login
Given User is on Login Page
When User enters credentials
		| username	| password	|
		| tomsmith	|	SuperSecretPassword!	|
Then Should display Success Msg
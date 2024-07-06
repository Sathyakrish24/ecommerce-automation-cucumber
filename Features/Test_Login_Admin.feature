Feature: Login_AdminTest

Scenario: Successful login with Valid Credentials
			Given User launch the Chrome Browser
			When User open the url as "https://admin-demo.nopcommerce.com/login"
			And User enter mail id as "admin@yourstore.com" and password as "admin"
			And user click on the login button
			Then Pag title should be "Dashboard/nopCommerce administration"
			When user click on logout link
			Then after click on logout Page title shoud be "Your store.Login"
			And close browser
			
			Scenario Outline: Successful login with Valid Credentials DDT
			Given User launch the Chrome Browser
			When User open the url as "https://admin-demo.nopcommerce.com/login"
			And User enter mail id as "admin@yourstore.com" and password as "admin"
			And user click on the login button
			Then Pag title should be "Dashboard/nopCommerce administration"
			When user click on logout link
			Then after click on logout Page title shoud be "Your store.Login"
			And close browser
			
			
Examples:
|email|pass|
|admin@yourstore.com|admin|
|jyo@gmail.com|adminTest|
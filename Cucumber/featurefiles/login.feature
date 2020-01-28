Feature: Login Functionality 
@data-driven
Scenario: login with valid credentials

Given Navigvate to Home Page
When user enters username and password
Then user logged in successfully

@data-driven
Scenario: The one where user picks different product through search functionality 
  	When Larry searches below products in the search box:
  |Head|
  |Travel|
  |Laptop|
   Then product shoulde be added in the cart if available


@user-specific
Scenario Outline: login with different username


Given Navigvate to Home Page
When user enters username and password
Then user logged in successfully
 Examples:
 	|userName|password|
 	|lalitha|Password123|
 	|ABC|XYZ|











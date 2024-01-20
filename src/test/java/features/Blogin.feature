@chilternoak
Feature: Login functionality
@signin @signin_mobile @signin_web
  Scenario Outline: User login with different credentials
    Given user navigates to the login page
    When user enters '<username>' and '<password>'
    And clicks the login button
    Then Message Should Be Displayed '<loginResult>'

  Examples:
    | username                         | password       			| loginResult           			|
    | farhanbelgaumi1@gmail.com				 | farhan@123		   			| 			|
    | far@gmail.com            		 		 | farhan@123			 			| Incorrect email or password. |
    | farhanbelgaumi1@gmail.com    		 | far123       				| Incorrect email or password. |
    | far@gmail.com  				       		 | far123								| Incorrect email or password. |
    |                              		 |               			  | Incorrect email or password. |

Feature: User is able to login with valid email & password

Description: "User login to zoopla website & verify login"

Scenario Outline: User login with valid email and verify page title

Given User can open any browser
And User is able to enter the "https://www.zoopla.co.uk" url
When User Clicks on the Sign in button
And User enter email "<username>"
And User enter password "<password>"
And User Click on the Sign in botton
Then User successfully login zoopla account
Examples:
| username					| password	  |
| mayeedul.islam27@gmail.com|abcd12345678 |
| mayeedul.islam27			|abcd12345678 |
| mayeedul.islam			|abcd12345678 |
| mayeedul.islam27@gmail.com|abcd1234567  |
| mayeedul.islam27@yahoo.com|abcd12345678 |
| mayeedul.islam27@gmail.com|abcd123456789|

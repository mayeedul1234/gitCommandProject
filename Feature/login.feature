Feature: User is able to login with valid email & password

Description: "User login to zoopla website & verify login"

Scenario: User login with valid email and verify page title

Given User can open any browser
And User is able to enter the "https://www.zoopla.co.uk" url
When User Clicks on the Sign in button
And User enter email "mayeedul.islam27@gmail.com"
And User enter password "abcd12345678"
And User Click on the Sign in botton
Then User successfully login zoopla account


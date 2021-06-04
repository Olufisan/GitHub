Feature: Log In Error Message

Scenario Outline: Log in error message
Given User initialising the browser
Given User navigates to the url "https://www.konga.com/"
When User clicks on the Login/Signup
And Enter an invalid username with <username> and password with <password>
And User clicks on the Login button
Then Error message is displayed
And Close the browser




Examples:
|username        | password |
|James@bond.com" | 1234567  |
|George@smith.com| 2340987  |


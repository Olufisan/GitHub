Feature: Home page navigation

Scenario: User navigates to other categories
Given User is on the home page 
When User clicks on the header menu category option
Then User is navigated to the category page
And Close browser

Feature: Hooks in Cucumber

Scenario: Add new customer
Given User is in Add customer page
When user fills the customer deatils
Then Customer is added

Scenario: Edit customer
Given User is on Edit customer page
When user edit contact deatils
Then Contact details updated

Scenario: Delete existing customer
Given User is on delete customer page
When user delete the customer deatils
Then Customer is deleted
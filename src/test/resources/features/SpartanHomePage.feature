
Feature: User should be able to add a Spartan

@spartan
Scenario: User should be able to arrive at Add Spartan page
  Given User is on Spartan home page
  When User clicks on Add Spartan linkText
  Then Verify the user is on Add Spartan page

@spartan
Scenario: user should be able to add a spartan successfully
  Given User is on Spartan home page
  When User clicks on Add Spartan linkText
  Given user enters a valid name
  When user selects gender for gender
  And user enters a valid phone number
  And user clicks on the save button
  Then verify user added a spartan to the list successfully



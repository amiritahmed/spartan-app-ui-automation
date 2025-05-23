
Feature: User should be able to add a Spartan

Background:
  Given User is on Spartan home page

  @spartan
  Scenario: User should be able to arrive at Add Spartan page
    When User clicks on Add Spartan linkText
    Then Verify the user is on Add Spartan page

  @spartan
  Scenario: user should be able to add a spartan successfully
    When User clicks on Add Spartan linkText
    Given user enters a valid name
    When user selects gender for gender
    And user enters a valid phone number
    And user clicks on the save button
    Then verify user added a spartan to the list successfully

  @spartan
  Scenario: user should be able to locate and delete the first spartan
    When user clicks on Web Data link text
    Then Verify user is on Spartan List page
    And User clicks on the first spartan delete icon
    # Then Verify user deletes the first spartan from the list successfully

  @spartan
  Scenario: Edit Spartan
    When user clicks on Web Data link text
    Then Verify user is on Spartan List page
    And User clicks on the first spartan view icon
    Then verify user lands on Spartan details screen



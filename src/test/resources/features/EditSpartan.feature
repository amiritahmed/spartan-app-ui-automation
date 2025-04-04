Feature: User should be able to edit existing spartan successfully

  Background: user lands on spartan home screen

    @spartan
    Scenario: Edit Spartan
      Given User is on Spartan home page
      When user clicks on Web Data link text
      Then Verify user is on Spartan List page
      And User clicks on the first spartan view icon
      Then verify user lands on Spartan details screen


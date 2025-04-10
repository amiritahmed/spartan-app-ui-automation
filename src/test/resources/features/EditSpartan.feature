Feature: User should be able to edit existing spartan successfully

  Background:
    Given User is on Spartan home page


  @test561
    Scenario: Edit Spartan
      When user clicks on Web Data link text
      Then Verify user is on Spartan List page
      And User clicks on the first spartan view icon
      Then verify user lands on Spartan details screen


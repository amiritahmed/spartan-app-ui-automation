Feature: User should be able to delete Spartan

  Background:
    Given User is on Spartan home page


  @spartRsd
  Scenario: user should be able to locate and delete the first spartan
    When user clicks on Web Data link text
    Then Verify user is on Spartan List page
    And User clicks on the first spartan delete icon
    # Then Verify user deletes the first spartan from the list successfully



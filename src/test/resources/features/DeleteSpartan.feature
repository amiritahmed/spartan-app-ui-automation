Feature: User should be able to delete Spartan

  @add2
  Scenario: user should be able to locates and deletes the first spartan
    Given User is on Spartan home page
    When user clicks on Web Data link text
    Then Verify user is on Spartan List page
    And User clicks on the first spartan delete icon
    #    Then Verify user deletes the first spartan from the list successfully



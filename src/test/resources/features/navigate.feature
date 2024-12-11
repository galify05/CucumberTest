Feature: HomePage

  @navigate
  Scenario: Verify homepage title is displayed
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    Then User verifies HomePage title
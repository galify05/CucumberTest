Feature: Car_Work

  @carwork
  Scenario: Entered valid data in all Fields
    Given User launches Chrome browser
    When User opens ilCarro HomePage

    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button

    And User clicks on Let the car work link

    And User select Location

    And User enters valid datas
    And User upload cars photo
    And User clicks on Submit button
    Then User verifies Complete message is displayed
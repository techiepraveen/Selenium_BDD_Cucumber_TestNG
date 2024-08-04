Feature: Amazon

  Scenario: Verify that the price of all the shirt should be in ascending order
    Given user is on the website
    When user trying to fetch prices of all the shirts
    Then price should be shown in ascending order

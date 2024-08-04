Feature: Entry ad

  Scenario: Verify that entry ad is working fine
    Given user is on the website
    When user is trying to close the ads
    Then ad should gets close

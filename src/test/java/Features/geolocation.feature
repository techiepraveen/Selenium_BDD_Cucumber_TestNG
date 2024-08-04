Feature: GeoLocation

  Scenario: Verify that geolocation notification is working fine
    Given user is on the website
    When user clicks on enabling the notification
    Then notification should be shown and clickable
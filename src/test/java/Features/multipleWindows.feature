Feature: Multiple Window

  Scenario: verify that multiple window functionality is working fine
    Given user is on the website
    When user trying to click on multiple window
    Then verify new window is getting open
    And close new window


Feature: Hotel Booking Functionality

  Scenario: User books a hotel successfully
    Given user is on login page
    When user searches hotel
    And user selects hotel
    Then user books hotel successfully

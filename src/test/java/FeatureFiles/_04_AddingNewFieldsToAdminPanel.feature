Feature: Setting up Parameters Field

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:
    Given Navigate to Fields Page
    When Create a new Field

    And edit a Field
    Then delete a Field
    Then User should delete successfully


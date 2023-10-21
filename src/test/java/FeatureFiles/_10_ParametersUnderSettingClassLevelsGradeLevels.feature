Feature: Grade Levels

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: User should be able to create new Grade Level.
    When a new grade level is created
    Then the grade level should appear in the list

  Scenario: User should be able to edit Grade Levels so user can make changes.
    When an existing grade level edited
    Then the grade level should have changed

  Scenario: User should be able to delete Grade Levels.
    When an existing grade level deleted
    Then the grade level should be removed from the list

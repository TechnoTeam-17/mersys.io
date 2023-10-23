Feature: Grade Levels

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: The user add Grade Levels
    When the user navigates to grade levels
      | setup        |
      | parameters   |
      | grade levels |
    And the user adds a new grade level
    Then the grade level should be added successfully

  Scenario: The user edit Grade Levels
    When the user navigates to grade levels
      | setup        |
      | parameters   |
      | grade levels |
    And the user edits a grade level
    Then the grade level should be edited successfully

  Scenario: The user delete Grade Levels
    When the user navigates to grade levels
      | setup        |
      | parameters   |
      | grade levels |
    And the user deletes a grade level
    Then the grade level should be deleted successfully


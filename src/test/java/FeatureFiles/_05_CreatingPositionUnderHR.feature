Feature: Creating Position under HR

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully




  Scenario: Creating Position under HR
    When Navigates to grade levels
      | setup        |
      | parameters   |
      | grade levels |
    And the user adds a new grade level
    Then the grade level should be added successfully

  Scenario:
    Given Navigate to Position Categories
    When Create a new Field

    And edit a Field
    And delete a Field
    And User should delete successfully


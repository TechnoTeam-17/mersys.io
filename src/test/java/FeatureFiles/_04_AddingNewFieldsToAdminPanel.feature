Feature: Setting up Parameters Field

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:
    Given Navigate to Set Up Categories
    When Create new Fields
    And add a Field
    And edit a Field
    And delete a Field
    And User should delete successfully

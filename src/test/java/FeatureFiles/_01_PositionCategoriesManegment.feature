Feature: Setting up Position Categories

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario:
      Given Navigate to Position Categories
      When Create a new Category
      Then success message should be displayed

      And user edit position category
      Then delete position category
      Then success message should be displayed


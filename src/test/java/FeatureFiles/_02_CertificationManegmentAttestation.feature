Feature: Attestation Management

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:
    Given Navigate to Attestations
    When Create a new attestation
    Then success message should be displayed

    And user edit attestation
    Then delete attestation
    Then success message should be displayed
Feature: Document Types

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:
    Given Navigate to Document Types
    When Create a new document

    And edit a document
    Then delete document
    Then document should be deleted


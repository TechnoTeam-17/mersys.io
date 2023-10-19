Feature:

  Background:

    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Adding Discounts

    Given User accesses the "Setup > Parameters" page
    When the User clicks on the "Discounts" tab
    And the User fills in the necessary information to add a new discount
    Then the discount should be added

  Scenario: Editing Discounts

    Given User accesses the "Setup > Parameters" page
    When the User clicks on the "Discounts" tab
    And the User updates the necessary information for an existing discount
    Then the changes should be saved

  Scenario: Deleting Discounts

    Given User accesses the "Setup > Parameters" page
    When the User clicks on the "Discounts" tab
    And the User initiates the process to delete an existing discount
    Then the discount should be deleted, and the User completes the verification step

Feature:Parameters Nationalities

  Background:

    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully


  Scenario:
  Adding Nationalities

    Given User accesses the "Setup > Parameters" page.
    When the User is on the page to add nationalities.
    And the User enters the required information to add a new nationality.
    Then the nationality should be added.
  Scenario: Editing Nationalities

    Given User accesses the "Setup > Parameters" page.
    When the User is on the page to edit nationalities
    And the User updates the valid information for an existing nationality
    Then the changes should be saved
  Scenario: Deleting Nationalities

    Given User accesses the "Setup > Parameters" page.
    When the User is on the page to delete nationalities
    And the User initiates the process to delete an existing nationality
    Then the nationality should be deleted, and the User completes the verification step

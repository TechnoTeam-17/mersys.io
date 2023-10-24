Feature: School Location Functionality

  @SmokeTest @Regression
  Background:

    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully

  Scenario: Manage school positions

    Given Click on the element in Setup
      | Setup        |
      | School_Setup |
      | Locations  |
    And Click to addbutton

    Then User create the keys in Locations
      | name          | lab7      |
      | shortname     | l7        |
      | location Type | labrotary |
      | capacity      | 12        |

    Then edit as name "lab7"  in Locations
      | name          | lab8      |
      | shortname     | l8        |
      | location Type | labrotary |
      | capacity      | 10        |

    Then click delete as name "lab8"
    And check verification step
    And delete as name "lab8"  in Locations

    And User must be able to enable and disable Partitions


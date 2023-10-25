Feature: School Functionality

  @SmokeTest @Regression
  Background:

    Given Navigate to Campus
    When Enter username and password click login button with ApachePOI
      | username    |
      | password    |
      | loginButton |
    Then User should successfully

  Scenario: Configuration of sections under school adjustment

    Given Click on the element in Setup
      | Setup        |
      | School_Setup |
      | Departments  |
    Then Click to addbutton

    And User sending the keys in School Department
      | nameInput | tech1 |
      | code      | omr3  |
    And add the keys in Section
      | name      | tec111 |
      | shortname | omr345 |
    And add the keys in Department Parameters
      | key   | afre |
      | value | 7    |
    And save all info

    Then User edit as name "tech1"  in School Department
      | nameInput | tech2 |
      | code      | omr4  |
    And add the keys in Section
      | name      | tec222 |
      | shortname | omr678 |
    And add the keys in Department Parameters
      | key   | gtre |
      | value | 9    |
    And save all info

    Then click delete as name "tech1"
    And check verification step
    And delete as name "tech1"  in School Department

    And User must be able to enable and disable Partitions





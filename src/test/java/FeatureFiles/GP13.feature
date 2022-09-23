Feature: As an Admin User I should be able to Add-Edit-Delete Positions under Human Resources Setup

  Background: Login with valid username and password
    Given Navigate to mersys13
    When Enter username and password and click login button13
    Then User should login successfuly13
    And Navigate to Positions
      | Human Resources    |
      |Setup|
      |Positions|
  @Regression
  Scenario: Add Positions
    Then Click addbutton
      | addbutton |
    And send Positionsname Shortname
      | Gruop35   |
      | Grp |
    And click saveButton
    And check success text
    And send searchName
    Then Search button
      | searchButton |
    And click editbutton
      | editButton |
    And send newPositionsName and newCode
    And click saveButton
    And check success text
    And send searchName
    Then Search button
      | searchButton |
    And click delete
      | trashButton       |
      | deleteButtonFinal |




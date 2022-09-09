Feature: As an Admin User I should be able to Add-Edit-Delete Fields under Parameters Setup

    #Scenario: Login with valid username and password

  Background:
    Given Navigate to mersys12
    When Enter username and password and click login button12
    Then User should login successfuly12
    And Navigate to Fields
      | setup      |
      | parameters |
      | fields     |

  Scenario: Add Fields
    Then Click addbutton
      | addbutton |
    And send fieldsname fieldsCode
      | fieldsname | ismetCoun28 |
      | fieldsCode | 1212328     |
    And select fieldsType
      | fieldsTypeMain   |
      | fieldsTypeSelect |
    And click saveButton
    And check success text

  Scenario: Edit Fields
    And send searchName
      | searchName | ismetCoun28 |
      | searchcode | 1212328     |
    Then Search button
      | searchButton |
    And click editbutton
      | editButton |
    And send newFieldsName and newFieldsCode
      | fieldsname | ismetCoun2129 |
      | fieldsCode | 12123329      |
    And click saveButton
    And check success text

  Scenario: delete Fields
    And send searchName
      | searchName | ismetCoun2129 |
      | searchcode | 12123329      |
    And click delete
      | trashButton       |
      | deleteButtonFinal |
    And check success text









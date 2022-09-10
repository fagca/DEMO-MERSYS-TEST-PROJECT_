Feature: As an Admin User I should be able to Add-Edit-Delete Fields under Parameters Setup

  Background: Login with valid username and password
    Given Navigate to mersys12
    When Enter username and password and click login button12
    Then User should login successfuly12
    And Navigate to Fields
      | setup      |
      | parameters |
      | fields     |
  @Regression
  Scenario: Add Fields
    Then Click addbutton
      | addbutton |
    And send fieldsname fieldsCode
    And select fieldsType
      | fieldsTypeMain   |
      | fieldsTypeSelect |
    And click saveButton
    And check success text
  #Edit Fields
    And send searchName
    Then Search button
      | searchButton |
    And click editbutton
      | editButton |
    And send newFieldsName and newFieldsCode
    And click saveButton
    And check success text
  #delete Fields
    And send searchName
    Then Search button
      | searchButton |
    And click delete
      | trashButton       |
      | deleteButtonFinal |










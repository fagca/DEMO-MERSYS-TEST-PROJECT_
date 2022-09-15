Feature: Admin should be able to Education/Setup/Add Subject Categories,
  Edit Subject Categories and Delete Subject Categories

  Scenario: Add - Edit - Delete Subject Categories
    Given Navigate to mersys
    When Enter username and password and click login button
    Then Click the Education-Setup-Subject Categories
    And Click to Add button and write name and code
    And Click to Save button
    Then "Subject Category successfully created" should be wrinting displayed

    Then Click to Edit button and write a new name and new code
    And Click to edit save button
    Then "Subject Category successfully updated" should be wrinting displayed

    Then Click to Delete Button and confirm the delete
    And "Subject Category successfully deleted" should be wrinting displayed












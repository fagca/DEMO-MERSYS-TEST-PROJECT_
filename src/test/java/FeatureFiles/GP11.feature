Feature: Add-Edit-Delete Document Types

  @Regression
  Scenario: As an Admin User I should be able to Add-Edit-Delete Document Types under Parameters Setup
    Given Navigate to mersys
    When Enter username and password and click login button
    And Navigate to Document Types
    And fill the Document Types inputs and save
    Then Write the name in name search box for Document Types
    And Edit Document Types inputs and save
    Then Write the new name in name search box for Document Types
    When Delete the Document Type
    Then "There is no data to display" should be displayed in Document Types page
Feature: As an Admin User I should be able to Add-Edit-Delete Bank Accounts under Parameters Setup

  @Regression
  Scenario: User should Add - Edit - Delete under Parameters Setup

    Given Navigate to mersys
    When Enter username and password and click login button
    And Navigate to Bank accounts
    And fill the inputs and save
    Then Write the name in name search box
    And Edit bank account inputs and save
    Then Write the new name in name search box
    When Delete the bank account
    Then "There is no data to display" should be displayed



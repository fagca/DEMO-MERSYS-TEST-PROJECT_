
  Feature: As an Admin User I should be able to Add-Edit-Delete Discounts under Parameters Setup
    Background: Login with valid username and password
      Given Navigate to mersys
      When Enter username and password and click login button
      Then User should login successfuly
      And Navigate to Discounts
    @Regression
    Scenario:
      Given User add button in discount setup
      When User filled form and click save button in discount setup
      Then User must to see successful alert
    @Regression
    Scenario:
      Given User search a position and click edit button in discount setup
      When User filled form with different data and click save button in discount setup
      Then User must to see successful alert
    @Regression
    Scenario:
      Given User search a position and click delete button in discount setup
      When User click delete button in form
      Then User must to see successful alert
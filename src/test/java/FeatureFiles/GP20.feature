Feature: As an Admin User I should be able to Add-Edit-Delete Nationalities under Parameters Setup

  Background: Login with valid username and password
    Given Navigate to mersys
    When Enter username and password and click login button
    Then User should login successfuly
    And Navigate to Nationality page
   @Regression
  Scenario:Nationality create
    When User create a Nationality name as
    Then User should click save buttons
      | save    |
    #Add nationality
    When User should enter name
    And User should search button
     |searchButton    |
    #Edit
    And User should click edit buttons
      | editButton  |
    And User should enter name
    Then  User should click save buttons
     | save |
    # Nationality delete
   When User should enter name
    And User should search button
      |searchButton    |
    And User should click delete buttons
      | deleteButton  |
      |deleteButton2  |
    And Success messeage sould be displayed





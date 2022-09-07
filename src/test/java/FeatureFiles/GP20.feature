Feature: As an Admin User I should be able to Add-Edit-Delete Nationalities under Parameters Setup

  Background:

    Given Navigate to mersys
    When Enter username and password and click login button
    Then User should login successfuly
    And Navigate to Nationality page

  Scenario: Nationality create
    When Enter user a Nationality name as
    |name | esra1|
    Then User should click save buttons




  #Admin User should be able to Add Nationalities, Edit Nationalities and Delete Nationalities for setting up parameters for different schools and environments.

 # Nationalities tab should be under Setup > Parameters tab. We should also have a search functionality for this page.

  #Please see the attachment for design of the page:
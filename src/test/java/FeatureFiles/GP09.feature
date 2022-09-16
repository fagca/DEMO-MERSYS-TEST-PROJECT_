
  Feature:

    Background: Login with valid username and password
      Given Navigate to mersys
      When Enter username and password and click login button
      Then User should login successfuly
      And Navigate to Positions

    Scenario:
      Given User add button in position setup
      When User filled form and click save button in position setup
      Then User must to see successful alert

    Scenario:
      Given User search a position and click edit button in position setup
      When User filled form with different data and click save button in position setup
      Then User must to see successful alert

    Scenario:
      Given User search a position and click delete button in position setup
      When User click delete button in form
      Then User must to see successful alert



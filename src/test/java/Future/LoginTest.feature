Feature: Login Feature
  This Feature deals with login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to login page
    And I enter the following email:admin
    And I enter the following for login
    |username|password|
    |admin   |admin   |

    And I click login button
    Then I should see the userform page




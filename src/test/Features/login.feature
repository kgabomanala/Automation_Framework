Feature: Login to Swag labs

  Scenario: Login into swag labs
    Given a user is on the swag labs login page
    When  a user enters username and password
    Then  user has successfully logged in

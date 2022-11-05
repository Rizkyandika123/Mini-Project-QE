Feature: Logout
	As a user
  I want to logout from the application

  Scenario: As a user, I want to logout from the application
    Given I am already on the home page
    When I am click logout button
    Then I am navigate to login page


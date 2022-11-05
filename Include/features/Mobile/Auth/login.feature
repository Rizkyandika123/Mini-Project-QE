Feature: Login
  As a user
  I want to login to the apps

  Scenario Outline: As user, I want to login to the apps
    Given I am on the login page
    When I am input <email> in form email in login page
    And I am input <password> in form password in login page
    And I am click login button
    Then I am navigate to home page

    Examples: S
      | email              | password   |
      | testsatu@email.com | 1234567890 |

Feature: Register
  As a user
  I want to register and make new account

  Scenario Outline: As User, I want to register and make new account
    Given I am on the register page
    When I am input <fullname> in form fullname
    And I am input <email> in form email
    And I am input <password> in form password
    And I am click register button
    Then I am on the home page

    Examples: 
      | fullname     | email                | password      |
      | Test lima ok | testlimaok@email.com | tes1234567890 |

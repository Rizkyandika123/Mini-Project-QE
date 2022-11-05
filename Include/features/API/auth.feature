Feature: Authentication

  Scenario: Register
    Given I am send request for register
    Then I am verify register HTTP response code 200

  Scenario: Login
    Given I am send request for login
    Then I am verify login HTTP response code 200

  Scenario: Get user information
    Given I am send request for get user information
    Then I am verify user information HTTP response code 200
  
  Scenario: Register with same email
    Given I am send request for register with same email
    Then I am verify register with same email HTTP response code 400

  Scenario: Login with invalid password
    Given I am send request for login with invalid password
    Then I am verify login HTTP response code 400
    
	Scenario: Get user information without login
    Given I am send request for get user information without login
    Then I am verify user information without login HTTP response code 401

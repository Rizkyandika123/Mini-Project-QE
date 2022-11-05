Feature: Order

  Scenario: Create a new order
    Given I am send request for Create a new order
    Then I am verify Create a new order HTTP response code 200

  Scenario: Get all orders
    Given I am send request for Get all orders
    Then I am verify Get all orders HTTP response code 200

  Scenario: Get order by ID
    Given I am send request for Get order by ID
    Then I am verify Get order by ID HTTP response code 200
    
  Scenario: Create a new order without access token
    Given I am send request for Create a new order without access token
    Then I am verify Create a new order without access token HTTP response code 401

  Scenario: Get all orders with invalid endpoint
    Given I am send request for Get all orders with invalid endpoint
    Then I am verify Get all orders with invalid endpoint HTTP response code 404
    
	Scenario: Get order by id without access token
    Given I am send request for Get order by id without access token
    Then I am verify Get order by id without access token HTTP response code 401
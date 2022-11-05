Feature: Product

  Scenario: Create a new product
    Given I am send request for Create a new product
    Then I am verify Create a new product HTTP response code 200

  Scenario: Get all product
    Given I am send request for Get all product
    Then I am verify Get all product HTTP response code 200

  Scenario: Get product by ID
    Given I am send request for Get product by ID
    Then I am verify Get product by ID HTTP response code 200
  
  Scenario: Delete a product
    Given I am send request for Delete a product
    Then I am verify Delete a product HTTP response code 200
  
  Scenario: Assign a product rating
    Given I am send request for Assign a product rating
    Then I am verify Assign a product rating HTTP response code 200
    
  Scenario: Get product ratings
    Given I am send request for Get product ratings
    Then I am verify Get product ratings HTTP response code 200
    
  Scenario: Create a comment of product
    Given I am send request for Create a comment of product
    Then I am verify Create a comment of product HTTP response code 200
  
  Scenario: Get product comment
    Given I am send request for Get product comment
    Then I am verify Get product comment HTTP response code 200
    
  @negative
  Scenario: Create a new product with invalid endpoint
    Given I am send request for Create a new product with invalid endpoint
    Then I am verify Create a new product with invalid endpoint HTTP response code 404

  Scenario: Get all product with invalid endpoint
    Given I am send request for Get all product with invalid endpoint
    Then I am verify Get all product with invalid endpoint HTTP response code 404

  Scenario: Get product by ID with invalid ID
    Given I am send request for Get product by ID with invalid ID
    Then I am verify Get product by ID with invalid ID HTTP response code 404
  
  Scenario: Delete a product with invalid endpoint
    Given I am send request for Delete a product with invalid endpoint
    Then I am verify Delete a product with invalid endpoint HTTP response code 404
  
  Scenario: Assign a product rating without access token
    Given I am send request for Assign a product rating without access token
    Then I am verify Assign a product rating HTTP response code 401
    
  Scenario: Get product ratings with invalid endpoint
    Given I am send request for Get product ratings with invalid endpoint
    Then I am verify Get product ratings HTTP response code 404
    
  Scenario: Create a comment of product without access token
    Given I am send request for Create a comment of product without access token
    Then I am verify Create a comment of product without access token HTTP response code 401
  
  Scenario: Get product comment with invalid endpoint
    Given I am send request for Get product comment with invalid endpoint
    Then I am verify Get product comment with invalid endpoint HTTP response code 404
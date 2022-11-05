Feature: Product Categories

  Scenario: Create a product category
    Given I am send request for create a category
    Then I am verify create a category HTTP response code 200

  Scenario: Get all product category
    Given I am send request for get all category
    Then I am verify get all category HTTP response code 200

  Scenario: Get product category by ID
    Given I am send request for get category by id
    Then I am verify get category by id HTTP response code 200
    
  Scenario: Create a product category with blank data input
    Given I am send request for Create a product category with blank data input
    Then I am verify Create a product category with blank data input HTTP response code 500

  Scenario: Get all category with invalid endpoint
    Given I am send request for Get all category with invalid endpoint
    Then I am verify Get all category with invalid endpoint HTTP response code 404

  Scenario: Get category with invalid ID
    Given I am send request for Get category with invalid ID
    Then I am verify Get category with invalid ID HTTP response code 404
  

  

$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/iputu/Katalon Studio/Mini project/Include/features/API/product.feature");
formatter.feature({
  "name": "Product",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create a new product",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Create a new product",
  "keyword": "Given "
});
formatter.match({
  "location": "products.sendRequestCreateNewProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Create a new product HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "products.verifyCreateNewProductResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get all product",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Get all product",
  "keyword": "Given "
});
formatter.match({
  "location": "products.sendRequestGetAllProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Get all product HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "products.verifyGetAllProductResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get product by ID",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Get product by ID",
  "keyword": "Given "
});
formatter.match({
  "location": "products.sendRequestGetProductById()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Get product by ID HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "products.verifyGetProductByIdResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete a product",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Delete a product",
  "keyword": "Given "
});
formatter.match({
  "location": "products.sendRequestDeleteProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Delete a product HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "products.verifyDeleteProductResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Assign a product rating",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Assign a product rating",
  "keyword": "Given "
});
formatter.match({
  "location": "products.sendRequestAssignProductRating()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Assign a product rating HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "products.verifyAssignProductRatingResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get product ratings",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Get product ratings",
  "keyword": "Given "
});
formatter.match({
  "location": "products.sendRequestGetProductRatings()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Get product ratings HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "products.verifyGetProductRatingsResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create a comment of product",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Create a comment of product",
  "keyword": "Given "
});
formatter.match({
  "location": "products.sendRequestCreateCommentOfProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Create a comment of product HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "products.verifyCreateCommentOfProductResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get product comment",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Get product comment",
  "keyword": "Given "
});
formatter.match({
  "location": "products.sendRequestGetProductComment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Get product comment HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "products.verifyGetProductCommentResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create a new product with invalid endpoint",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@negative"
    }
  ]
});
formatter.step({
  "name": "I am send request for Create a new product with invalid endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "products.sendRequestCreateNewProductWithInvalidEndpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Create a new product with invalid endpoint HTTP response code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "products.verifyCreateNewProductWithInvalidEndpointResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get all product with invalid endpoint",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Get all product with invalid endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "products.sendRequestGetAllProductWithInvalidEndpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Get all product with invalid endpoint HTTP response code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "products.verifyGetAllProductWithInvalidEndpointResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get product by ID with invalid ID",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Get product by ID with invalid ID",
  "keyword": "Given "
});
formatter.match({
  "location": "products.sendRequestGetProductByIdWithInvalidId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Get product by ID with invalid ID HTTP response code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "products.verifyGetProductByIdWithInvalidIdResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete a product with invalid endpoint",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Delete a product with invalid endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "products.sendRequestDeleteProductWithInvalidEndpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Delete a product with invalid endpoint HTTP response code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "products.verifyDeleteProductWithInvalidEndpointResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Assign a product rating without access token",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Assign a product rating without access token",
  "keyword": "Given "
});
formatter.match({
  "location": "products.sendRequestAssignProductRatingWithoutAccessToken()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Assign a product rating HTTP response code 401",
  "keyword": "Then "
});
formatter.match({
  "location": "products.verifyAssignProductRatingWithoutAccessTokenResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get product ratings with invalid endpoint",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Get product ratings with invalid endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "products.sendRequestGetProductRatingsWithInvalidEndpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Get product ratings HTTP response code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "products.verifyGetProductRatingsWithInvalidEndpointResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create a comment of product without access token",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Create a comment of product without access token",
  "keyword": "Given "
});
formatter.match({
  "location": "products.sendRequestCreateCommentOfProductWithoutAccessToken()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Create a comment of product without access token HTTP response code 401",
  "keyword": "Then "
});
formatter.match({
  "location": "products.verifyCreateCommentOfProductWithoutAccessTokenResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get product comment with invalid endpoint",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Get product comment with invalid endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "products.sendRequestGetProductCommentWithInvalidEndpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Get product comment with invalid endpoint HTTP response code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "products.verifyGetProductWithInvalidEndpointCommentResponseCode()"
});
formatter.result({
  "status": "passed"
});
});
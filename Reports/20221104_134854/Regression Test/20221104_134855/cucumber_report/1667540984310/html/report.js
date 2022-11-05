$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/iputu/Katalon Studio/Mini project/Include/features/API/product_categories.feature");
formatter.feature({
  "name": "Product Categories",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create a product category",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for create a category",
  "keyword": "Given "
});
formatter.match({
  "location": "product_categories.sendRequestCreateCategory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify create a category HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "product_categories.verifyCreateCategoryResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get all product category",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for get all category",
  "keyword": "Given "
});
formatter.match({
  "location": "product_categories.sendRequestGetAllCategory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify get all category HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "product_categories.verifyGetAllCategoryResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get product category by ID",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for get category by id",
  "keyword": "Given "
});
formatter.match({
  "location": "product_categories.sendRequestGetCategoryByID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify get category by id HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "product_categories.verifyGetCategoryByIDResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create a product category with blank data input",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Create a product category with blank data input",
  "keyword": "Given "
});
formatter.match({
  "location": "product_categories.sendRequestCreateProductCategoryWithBlankDataInput()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Create a product category with blank data input HTTP response code 500",
  "keyword": "Then "
});
formatter.match({
  "location": "product_categories.verifyCreateProductCategoryWithBlankDataInpuResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get all category with invalid endpoint",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Get all category with invalid endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "product_categories.sendRequestGetAllCategoryWithInvalidEndpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Get all category with invalid endpoint HTTP response code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "product_categories.verifyGetAllCategoryWithInvalidEndpointResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get category with invalid ID",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Get category with invalid ID",
  "keyword": "Given "
});
formatter.match({
  "location": "product_categories.sendRequestGetCategoryWithInvalidID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Get category with invalid ID HTTP response code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "product_categories.verifyGetCategoryWithInvalidIDResponseCode()"
});
formatter.result({
  "status": "passed"
});
});
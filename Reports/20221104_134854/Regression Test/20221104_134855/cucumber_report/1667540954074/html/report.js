$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/iputu/Katalon Studio/Mini project/Include/features/API/order.feature");
formatter.feature({
  "name": "Order",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create a new order",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Create a new order",
  "keyword": "Given "
});
formatter.match({
  "location": "order.sendRequestRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Create a new order HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "order.verifyRegiterResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get all orders",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Get all orders",
  "keyword": "Given "
});
formatter.match({
  "location": "order.sendRequestLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Get all orders HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "order.verifyLoginResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get order by ID",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Get order by ID",
  "keyword": "Given "
});
formatter.match({
  "location": "order.sendRequestinfo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Get order by ID HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "order.verifyInfoResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create a new order without access token",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Create a new order without access token",
  "keyword": "Given "
});
formatter.match({
  "location": "order.sendRequestCreateNewOrderWithoudAccessToken()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Create a new order without access token HTTP response code 401",
  "keyword": "Then "
});
formatter.match({
  "location": "order.verifyCreateNewOrderWithoudAccessTokenResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get all orders with invalid endpoint",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Get all orders with invalid endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "order.sendRequestGetAllOrderWithInvalidEndpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Get all orders with invalid endpoint HTTP response code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "order.verifyGetAllOrderWithInvalidEndpointResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get order by id without access token",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for Get order by id without access token",
  "keyword": "Given "
});
formatter.match({
  "location": "order.sendRequestGetOrderByIdWithoutAccessToken()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify Get order by id without access token HTTP response code 401",
  "keyword": "Then "
});
formatter.match({
  "location": "order.verifyGetOrderByIdWithoutAccessTokenResponseCode()"
});
formatter.result({
  "status": "passed"
});
});
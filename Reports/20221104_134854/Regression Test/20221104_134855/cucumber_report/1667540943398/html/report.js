$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/iputu/Katalon Studio/Mini project/Include/features/API/auth.feature");
formatter.feature({
  "name": "Authentication",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Register",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for register",
  "keyword": "Given "
});
formatter.match({
  "location": "authentication.sendRequestRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify register HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "authentication.verifyRegiterResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for login",
  "keyword": "Given "
});
formatter.match({
  "location": "authentication.sendRequestLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify login HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "authentication.verifyLoginResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get user information",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for get user information",
  "keyword": "Given "
});
formatter.match({
  "location": "authentication.sendRequestGetUserInformation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify user information HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "authentication.verifyGetUserInformationResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Register with same email",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for register with same email",
  "keyword": "Given "
});
formatter.match({
  "location": "authentication.sendRequestRegisterWithSameEmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify register with same email HTTP response code 400",
  "keyword": "Then "
});
formatter.match({
  "location": "authentication.verifyRegisterWithSameEmailResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for login with invalid password",
  "keyword": "Given "
});
formatter.match({
  "location": "authentication.sendRequestLoginWithInvalidPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify login HTTP response code 400",
  "keyword": "Then "
});
formatter.match({
  "location": "authentication.verifyLoginWithInvalidPasswordResponseCode()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get user information without login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am send request for get user information without login",
  "keyword": "Given "
});
formatter.match({
  "location": "authentication.sendRequestGetUserInformationWithoutLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am verify user information without login HTTP response code 401",
  "keyword": "Then "
});
formatter.match({
  "location": "authentication.verifyGetUserInformationWithoutLoginResponseCode()"
});
formatter.result({
  "status": "passed"
});
});
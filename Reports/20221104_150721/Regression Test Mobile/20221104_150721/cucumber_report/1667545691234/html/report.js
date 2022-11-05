$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/iputu/Katalon Studio/Mini project/Include/features/Mobile/Auth/login.feature");
formatter.feature({
  "name": "Login",
  "description": "  As a user\n  I want to login to the apps",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "As user, I want to login to the apps",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "I am input \u003cemail\u003e in form email in login page",
  "keyword": "When "
});
formatter.step({
  "name": "I am input \u003cpassword\u003e in form password in login page",
  "keyword": "And "
});
formatter.step({
  "name": "I am click login button",
  "keyword": "And "
});
formatter.step({
  "name": "I am navigate to home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "S",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "testsatu@email.com",
        "1234567890"
      ]
    }
  ]
});
formatter.scenario({
  "name": "As user, I want to login to the apps",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.onTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am input testsatu@email.com in form email in login page",
  "keyword": "When "
});
formatter.match({
  "location": "login.inputEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am input 1234567890 in form password in login page",
  "keyword": "And "
});
formatter.match({
  "location": "login.inputPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am click login button",
  "keyword": "And "
});
formatter.match({
  "location": "login.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am navigate to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "login.navigateToHomePage()"
});
formatter.result({
  "status": "passed"
});
});
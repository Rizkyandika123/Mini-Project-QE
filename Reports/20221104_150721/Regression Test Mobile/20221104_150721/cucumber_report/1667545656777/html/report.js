$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/iputu/Katalon Studio/Mini project/Include/features/Mobile/Auth/register.feature");
formatter.feature({
  "name": "Register",
  "description": "  As a user\n  I want to register and make new account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "As User, I want to register and make new account",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the register page",
  "keyword": "Given "
});
formatter.step({
  "name": "I am input \u003cfullname\u003e in form fullname",
  "keyword": "When "
});
formatter.step({
  "name": "I am input \u003cemail\u003e in form email",
  "keyword": "And "
});
formatter.step({
  "name": "I am input \u003cpassword\u003e in form password",
  "keyword": "And "
});
formatter.step({
  "name": "I am click register button",
  "keyword": "And "
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fullname",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "Test lima ok",
        "testlimaok@email.com",
        "tes1234567890"
      ]
    }
  ]
});
formatter.scenario({
  "name": "As User, I want to register and make new account",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the register page",
  "keyword": "Given "
});
formatter.match({
  "location": "register.onTheRegisterPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am input Test lima ok in form fullname",
  "keyword": "When "
});
formatter.match({
  "location": "register.inputFullnameInFormFullname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am input testlimaok@email.com in form email",
  "keyword": "And "
});
formatter.match({
  "location": "register.I_check_for_the_value_in_step(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am input tes1234567890 in form password",
  "keyword": "And "
});
formatter.match({
  "location": "register.I_check_for_the_value_in_stepwe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am click register button",
  "keyword": "And "
});
formatter.match({
  "location": "register.I_check_for_the_value_in_stepqwee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "register.I_verify_the_status_in_step()"
});
formatter.result({
  "status": "passed"
});
});
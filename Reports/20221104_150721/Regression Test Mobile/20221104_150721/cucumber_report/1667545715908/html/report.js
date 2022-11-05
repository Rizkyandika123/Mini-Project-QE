$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/iputu/Katalon Studio/Mini project/Include/features/Mobile/Auth/logout.feature");
formatter.feature({
  "name": "Logout",
  "description": "\tAs a user\n  I want to logout from the application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a user, I want to logout from the application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am already on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "logout.alreadyOnTheHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am click logout button",
  "keyword": "When "
});
formatter.match({
  "location": "logout.clickLogoutButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am navigate to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "logout.navigateToLoginButton()"
});
formatter.result({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureFiles/FreeCrmFeatureFiles.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Free CRM login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user is in homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "FressCrmStepDefinitions.user_is_in_login_page()"
});
formatter.result({
  "duration": 536142235600,
  "status": "passed"
});
formatter.match({
  "location": "FressCrmStepDefinitions.user_enters_username_and_password()"
});

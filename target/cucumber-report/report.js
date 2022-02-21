$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FeatureFiles/Login.feature");
formatter.feature({
  "name": "User should be able to login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Application is up and running and validated",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.LoginStepDefination.application_is_up_and_running_and_validated()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "User should login with valid credentials");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user enter username as \"Admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.LoginStepDefination.user_enter_username_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "User should login with valid credentials");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user enter password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.LoginStepDefination.user_enter_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", "User should login with valid credentials");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.LoginStepDefination.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", "User should login with valid credentials");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to see dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.LoginStepDefination.user_should_be_able_to_see_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", "User should login with valid credentials");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
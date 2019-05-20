$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Login successfully",
  "description": "",
  "id": "login-functionality;verify-login-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter valid useername and valid password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click the Signin button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify user login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_in_login_page()"
});
formatter.result({
  "duration": 4848601468,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_enter_valid_useername_and_valid_password()"
});
formatter.result({
  "duration": 4527601,
  "error_message": "java.lang.NullPointerException\r\n\tat com.StepDefination.LoginStepDefination.user_enter_valid_useername_and_valid_password(LoginStepDefination.java:28)\r\n\tat ✽.When User enter valid useername and valid password(Login.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_the_Signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.verify_user_login_successfully()"
});
formatter.result({
  "status": "skipped"
});
});
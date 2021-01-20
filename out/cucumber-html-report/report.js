$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("signUp.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp for New User",
  "description": "",
  "id": "signup-for-new-user",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10897237100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "sign up for valid credential",
  "description": "",
  "id": "signup-for-new-user;sign-up-for-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SignUp"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user navigate application url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter email id",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enter his personal information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enter valid address",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click on register button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user should be abale to succefully Register",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpTest.user_navigate_application_url()"
});
formatter.result({
  "duration": 15817196100,
  "status": "passed"
});
formatter.match({
  "location": "SignUpTest.user_enter_email_id()"
});
formatter.result({
  "duration": 487080200,
  "status": "passed"
});
formatter.match({
  "location": "SignUpTest.user_enter_his_personal_information()"
});
formatter.result({
  "duration": 4754767000,
  "status": "passed"
});
formatter.match({
  "location": "SignUpTest.user_enter_valid_address()"
});
formatter.result({
  "duration": 1328446000,
  "status": "passed"
});
formatter.match({
  "location": "SignUpTest.user_click_on_register_button()"
});
formatter.result({
  "duration": 4799736900,
  "status": "passed"
});
formatter.match({
  "location": "SignUpTest.user_should_be_abale_to_succefully_Register()"
});
formatter.result({
  "duration": 58099900,
  "status": "passed"
});
formatter.after({
  "duration": 747250700,
  "status": "passed"
});
});
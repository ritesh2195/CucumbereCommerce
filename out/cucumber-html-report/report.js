$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Ecommerce",
  "description": "",
  "id": "testing-ecommerce",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8096280801,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login with valid credential",
  "description": "",
  "id": "testing-ecommerce;login-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I naviagate to launch page of the application and click on login link field",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters the Username riteshranjanmishra938@gmail.com and Password mishra21 into the fields",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should be abale to succefully Login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.i_naviagate_to_launch_page_of_the_application()"
});
formatter.result({
  "duration": 12719593800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "riteshranjanmishra938@gmail.com",
      "offset": 25
    },
    {
      "val": "mishra21",
      "offset": 70
    }
  ],
  "location": "LoginTest.user_enters_the_Username_and_Password_into_the_fields(String,String)"
});
formatter.result({
  "duration": 2810012201,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_should_be_abale_to_succefully_Login()"
});
formatter.result({
  "duration": 107568001,
  "status": "passed"
});
formatter.after({
  "duration": 765568099,
  "status": "passed"
});
});
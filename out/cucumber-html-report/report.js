$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login1.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Ecommerce",
  "description": "",
  "id": "testing-ecommerce",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8068673900,
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
      "name": "@Login"
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
formatter.step({
  "line": 7,
  "name": "I type item in the search box and click on the search button field",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I select the particular item and click on the particular item",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on the add item to cart field",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on the proceed to checkout field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on agree term and proceed to checkout field",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click on the payment field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on the confirm my order field",
  "keyword": "Then "
});
formatter.match({
  "location": "login1.i_naviagate_to_launch_page_of_the_application()"
});
formatter.result({
  "duration": 10854605800,
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
  "location": "login1.user_enters_the_Username_and_Password_into_the_fields(String,String)"
});
formatter.result({
  "duration": 3199597400,
  "status": "passed"
});
formatter.match({
  "location": "login1.user_should_be_abale_to_succefully_Login()"
});
formatter.result({
  "duration": 97227900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "item",
      "offset": 7
    }
  ],
  "location": "login1.I_type_item_in_the_search_box(String)"
});
formatter.result({
  "duration": 3893040800,
  "status": "passed"
});
formatter.match({
  "location": "login1.I_select_the_particular_item()"
});
formatter.result({
  "duration": 3074103200,
  "status": "passed"
});
formatter.match({
  "location": "login1.I_click_on_the_add_item_to_cart_field()"
});
formatter.result({
  "duration": 4187291600,
  "status": "passed"
});
formatter.match({
  "location": "login1.I_click_on_the_proceed_to_checkout_field()"
});
formatter.result({
  "duration": 4542423400,
  "status": "passed"
});
formatter.match({
  "location": "login1.I_click_on_agree_term_and_proceed_to_checkout_field()"
});
formatter.result({
  "duration": 2791898900,
  "status": "passed"
});
formatter.match({
  "location": "login1.I_click_on_the_payment_field()"
});
formatter.result({
  "duration": 1584055600,
  "status": "passed"
});
formatter.match({
  "location": "login1.I_click_on_the_confirm_my_order_field()"
});
formatter.result({
  "duration": 4902010600,
  "status": "passed"
});
formatter.after({
  "duration": 797987200,
  "status": "passed"
});
});
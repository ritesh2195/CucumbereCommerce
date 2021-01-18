$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Searching Product and placing order",
  "description": "",
  "id": "searching-product-and-placing-order",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8279162900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Searching Product with valid user credebtials",
  "description": "",
  "id": "searching-product-and-placing-order;searching-product-with-valid-user-credebtials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@search"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user login into application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user search a \"Product\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click on the add item to cart field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on the proceed to checkout field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click on agree term and proceed to checkout field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user add payment method",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click on the confirm order",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user should be able to place order of the product",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchTest.user_login_into_application()"
});
formatter.result({
  "duration": 14748688300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Product",
      "offset": 15
    }
  ],
  "location": "SearchTest.user_search_a(String)"
});
formatter.result({
  "duration": 7540699500,
  "status": "passed"
});
formatter.match({
  "location": "SearchTest.user_click_on_the_add_item_to_cart_field()"
});
formatter.result({
  "duration": 6353158900,
  "status": "passed"
});
formatter.match({
  "location": "SearchTest.user_click_on_the_proceed_to_checkout_field()"
});
formatter.result({
  "duration": 5166971700,
  "status": "passed"
});
formatter.match({
  "location": "SearchTest.user_click_on_agree_term_and_proceed_to_checkout_field()"
});
formatter.result({
  "duration": 3757234300,
  "status": "passed"
});
formatter.match({
  "location": "SearchTest.user_add_payment_method()"
});
formatter.result({
  "duration": 2354852501,
  "status": "passed"
});
formatter.match({
  "location": "SearchTest.user_click_on_the_confirm_order()"
});
formatter.result({
  "duration": 5397974899,
  "status": "passed"
});
formatter.match({
  "location": "SearchTest.user_should_be_able_to_place_order_of_the_product()"
});
formatter.result({
  "duration": 30013563700,
  "status": "passed"
});
formatter.after({
  "duration": 88001,
  "status": "passed"
});
});
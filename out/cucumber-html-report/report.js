$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login1.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Ecommerce",
  "description": "",
  "id": "testing-ecommerce",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7724640200,
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
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user should be abale to succefully Login",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I type item in the search box and click on the search button field",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I select the particular item and click on the particular item",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on the add item to cart field",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on the proceed to checkout field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on agree term and proceed to checkout field",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I click on the payment field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on the confirm my order field",
  "keyword": "Then "
});
formatter.match({
  "location": "login1.i_naviagate_to_launch_page_of_the_application()"
});
formatter.result({
  "duration": 5389655600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@title\u003d\u0027Log in to your customer account\u0027]\"}\n  (Session info: chrome\u003d84.0.4147.135)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-D0ODKLV\u0027, ip: \u0027192.168.43.211\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.135, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51832}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 5db0ef1ec7d20e88131c6b441685f8bf\n*** Element info: {Using\u003dxpath, value\u003d//*[@title\u003d\u0027Log in to your customer account\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\r\n\tat CBPack.Page.LaunchPage.SingInPage(LaunchPage.java:42)\r\n\tat stepDefinition.login1.i_naviagate_to_launch_page_of_the_application(login1.java:56)\r\n\tat ✽.Given I naviagate to launch page of the application and click on login link field(login1.feature:4)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "login1.i_click_on_Sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "login1.user_should_be_abale_to_succefully_Login()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "login1.I_select_the_particular_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "login1.I_click_on_the_add_item_to_cart_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "login1.I_click_on_the_proceed_to_checkout_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "login1.I_click_on_agree_term_and_proceed_to_checkout_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "login1.I_click_on_the_payment_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "login1.I_click_on_the_confirm_my_order_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1185022200,
  "status": "passed"
});
});
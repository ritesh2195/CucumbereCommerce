Feature: Testing Ecommerce
@login
Scenario: Login with valid credential
  Given I naviagate to launch page of the application and click on login link field
  When User enters the Username riteshranjanmishra938@gmail.com and Password mishra21 into the fields
  Then user should be abale to succefully Login

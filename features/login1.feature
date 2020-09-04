Feature: Testing Ecommerce
@Login
Scenario: Login with valid credential
  Given I naviagate to launch page of the application and click on login link field
  When User enters the Username riteshranjanmishra938@gmail.com and Password mishra21 into the fields
  Then user should be abale to succefully Login
  Given I type item in the search box and click on the search button field
  And I select the particular item and click on the particular item
  When I click on the add item to cart field
  And I click on the proceed to checkout field
  Then I click on agree term and proceed to checkout field
  And I click on the payment field
  Then I click on the confirm my order field
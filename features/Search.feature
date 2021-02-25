Feature: Searching Product and placing order

  @search
  Scenario: Searching Product with valid user credebtials

    Given user login into application
    When user search a "dress"
    And user click on the add item to cart field
    And user click on the proceed to checkout field
    And user click on agree term and proceed to checkout field
    And user add payment method
    And user click on the confirm order
    Then user should be able to place order of the product
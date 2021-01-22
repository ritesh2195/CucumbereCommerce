Feature: Validating Contact us feature

  @contact
  Scenario: verifying user is able to send message

    Given user is on contact us page
    And user choose subject heading
    And user enter required details
    When user click submit button
    Then user should able to send message successfully
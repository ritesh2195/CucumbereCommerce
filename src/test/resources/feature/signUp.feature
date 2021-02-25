Feature: SignUp for New User

  @SignUp
  Scenario: sign up for valid credential

    Given user navigate application url
    When user enter email id
    And user enter his personal information
    And user enter valid address
    And user click on register button
    Then user should be abale to succefully Register

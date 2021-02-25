Feature: Testing Ecommerce

Background: user is on login page

  Given user navigate to login page

@login
Scenario: Login with valid credential
  When user enters the Username rrm@gmail.com and Password qwerty into the fields
  Then user should be able to login successfully

@login_unsuccessfully
Scenario Outline:
  When user enters invalid sets of "<username>" and "<password>" and click on login button
  Then user should not be able to login successfully
  Examples:
    | username | password |
    | rrm@gmail.com| dhyhdj|
    | dchbdcb@gmail.com| qwerty|

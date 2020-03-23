Feature: User logins with multiple accounts

  @Weebly
  Scenario Outline: User logins with multiple accounts
    Given The user has access to the "<url>" website
    Given The user enters the "<email>" address
    And The user enters a "<password>" password
    And The user click Login button
    Then The user should be on the homepage

        Examples:
          |        url                       |      email           | password       |
          | https://www.weebly.com/login     | rohonda300@gmail.com | portugal01     |
#          | https://www.moonfruit.com/       | username2@gmail.co.uk| pass2         |

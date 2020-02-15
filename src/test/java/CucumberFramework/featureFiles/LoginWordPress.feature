Feature: User Logins into WordPress account

  @WordPress
  Scenario: The user is able to login with the right credentials
    Given The user has access to the WordPress website
    When The user enters the email address
    And The user enters a username
    And The user enters a password
    And The user click the create account button
    Then The user should be on the WordPress main page
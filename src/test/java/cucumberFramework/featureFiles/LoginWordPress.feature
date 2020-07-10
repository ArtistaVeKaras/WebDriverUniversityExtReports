Feature: User Logins into WordPress account

  @WordPress
  Scenario: The user is able to login with the right credentials
    Given The user has access to the WordPress website
    When The user enters the email address
    | rohonda100@gmail.com | paymail@gmail.com  |  this@gmail.com |
    | claud@gmail.com | 700@gmail.com  |  that@gmail.com |
    And The user enters a username
    | claudio   | jonh  |   alex   |
    And The user enters a password
    |   pass1123    |   learn123   |
    And The user click the create account button
    Then The user should be on the WordPress main page


#TODO: Implement this code for the data parameterization to user different values

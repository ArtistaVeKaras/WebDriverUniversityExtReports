Feature: User Logins into WordPress account

  @WordPress
  Scenario: The user is able to login with the right credentials
    Given The user has access to the WordPress website
    When The user enters the email address
    And The user enters a username
    And The user enters a password
    And The user click the create account button
    Then The user should be on the WordPress main page


#TODO: Implement this code for the data parameterization to user different values

#    Background:
#    Given The user has access to the WordPress website
#
#      @Word
#  Scenario Outline: User creates a new account with wordPress
#    Given The user enters the "<email>" address
#    And The user enters a "<username>" username
#    And The user enters a "<password>" password
#    And The user click the create account button
#    Then The user should be on the WordPress main page
#
#        Examples:
#          |         email          | username  | password  |
#          | email@worpress.com     | username1 | password1 |
#          | email@wordPress1.com   | username2 | password2 |

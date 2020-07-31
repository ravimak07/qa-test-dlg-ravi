Feature: Login feature

  As a user I want to login to qa experience account

  Scenario: User should Login successfully with valid credentials

    Given   I am on Login page
    When    I enter user name to the field "test@qa-experience.com"
    And     I enter password to the field "Password1"
    And     I click on Login submit button
    Then    I should Login successfully

#  Scenario Outline: User should not Login successfully with invalid credentials
#
#    Given   I am on Login page
#    When    I enter user name to the field "<username>"
#    And     I enter password to the field "<password>"
#    And     I click on Login submit button
#    Then    I should not Login successfully
#
#    Examples:
#      | username         | password |
#      | ram444@yahoo.com | london4  |
#      | ram555@yahoo.com | london5  |
#      | xyz13@gmail.com  | abc123   |
#      | xyz1@gmail.com   | abc1234  |
Feature: As a New User, I have to success logout from my account, So that I can be able to login with another account

  @logout
  Scenario: As a User, I have be able to logout from my account
    Given I am in the home page
    When I click the profile button
    Then I am in the profile page
    And I click the logout button
    And I go to the front page
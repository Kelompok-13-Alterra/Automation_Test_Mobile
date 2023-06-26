Feature: As a  User, I have to success login, So that I can be able to make an order

  @login
  Scenario: As a User, I have be able to login with my account
    Given I am on the front page
    When I click on the skip button
    Then I am in the login page
    And I input "kelompok13@gmail.com" on email field
    And I input "131313" on password field
    And I click on remember me checkbox
    And I click the login button
    And I am on the home page
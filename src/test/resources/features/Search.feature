Feature: As a  User, I have to success search an office, So that I can be able to make an order

  @login
  Scenario: As a User, I have be able to search
    Given I am in home page
    When I click on the search field
    Then I am in search page
    And I input "Malang" on search field
    And I am in the result search page
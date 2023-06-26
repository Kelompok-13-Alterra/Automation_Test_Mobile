Feature: As a User, I have to success book a building, so that I can have an agreement.

  @booking
  Scenario: As a User, I have be able to book a building
    Given I am on home page
    When I click on the office button
    Then I am on the office page
    And I click on the booking button
    And I click on the start date button
    And I click on the end date button
    And I click on the save button
    And I click on the next button
    And I click on the choose payment method button
    And I click on the bni button
    And I click on the payment button
    And I am on the payment page
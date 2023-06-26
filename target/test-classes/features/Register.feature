   Feature: As a New User, I have to success register account, So that I can be able to login

     @register
     Scenario: As a New User, I have be able to register or create new account
       Given I am in the front page
       When I click the skip button
       Then I click the register link
       And I input "QE Kelompok 13" as valid name on name field
       And I input "QEK13@gmail.com" as valid email on email field
       And I input "QE13" as valid password on password field
       And I confirm password
       And I click on term and condition checkbox
       And I click register button
       And I am on the login page
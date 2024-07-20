Feature: Test cogmneto Application

  Scenario: validate login functionality
    Given user is on login page
    When user enter username and password
    Then user click on login button

    Scenario: validate contact page functionality
    When user click on contact link page
    When user click on create button
    And user enter first name and last name
    And user click on save button
    Then user click on delete and confirm delete
   
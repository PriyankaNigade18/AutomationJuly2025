Feature: Test demo automationTesting application

  Scenario: Test Register page
    Given open register page
    When user enter all required data
      | fname | lname  | address | email           | phonenumber | password | cpassword |
      | Sumit | sharma | Mumbai  | sumit@gmail.com |    8877666567 | test123  | test123   |
    And user select gender
    And user select hobby
    And user select language
    And user select skills
    And user select country
    And select specific country
    And select date of birth
    And click on Submit
    Then user should be register
    

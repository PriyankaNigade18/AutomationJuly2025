Feature: Test SwagLab Demo application

  Scenario: Test for login with valid credentials
    Given Open Application with url "https://www.saucedemo.com/"
    When User enter username as "standard_user" and password as "secret_sauce"
    And User click on swaglab Login button
    Then login should complete and user should nvaigate to inventory page

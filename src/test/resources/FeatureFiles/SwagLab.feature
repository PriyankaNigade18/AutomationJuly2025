Feature: Test SwagLab Demo application

  Background: 
    Given Open Application with url "https://www.saucedemo.com/"
  

  Scenario: Test for login with valid credentials
    #Given Open Application with url "https://www.saucedemo.com/"
    When User enter username as "standard_user" and password as "secret_sauce"
  	And User click on swaglab Login button
    Then login should complete and user should nvaigate to inventory page
  
  Scenario: Test for login with valid credentials using datatable
    #Given Open Application with url "https://www.saucedemo.com/"
    When user enter required username and password
      | standard_user | secret_sauce |
    And User click on swaglab Login button
    Then login should complete and user should nvaigate to inventory page
  

Feature: Test CRM application

  Background: 
    Given Open CRM application
    When User click on SignIn link

  Scenario: Test for SignIn link
    #When User click on SignIn link
    Then User should navigate to login page

  Scenario: Test fof CRM login
    #When User click on SignIn link
    When User enter valid "test@gmail.com" & valid "test123"
    And User click on crm Submit button
    Then User should navigate to customer page

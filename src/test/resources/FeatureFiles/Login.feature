Feature: Test Swaglab application login page

  Background: 
    Given Open Application

  Scenario: Test for swaglab login page title
    When I get the current page title
    Then Title should match

  Scenario: Test for Swaglab login with valid credentials
    When I enter "standard_user" & "secret_sauce"
    When I click on Login button
    Then I should be navigated to inventory page

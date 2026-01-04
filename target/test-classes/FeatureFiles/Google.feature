Feature: Test Google application

  Background: 
    Given Open Google application

  Scenario: Test for Google page title
    #Given Open Google application
    When User get the current title of the google
    Then Title should match

  Scenario: Test for valid keyword search
    #Given Open Google application
    When User entervalid keyword in search
    Then It should display valid search Result

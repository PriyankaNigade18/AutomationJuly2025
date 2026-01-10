@All
Feature: Test Amazon application

  Background: 
    Given Open Amazon application

  @smoke @homepage
  Scenario: Test home page title
    #Given Open Amazon application
    When User get the home page title
    Then title should match with home page

  @sellpage @ignore
  Scenario: Test Sell page title
    #Given Open Amazon application
    When User open Sell page
    And User get the sell page title
    Then title should match with Sell page

  @mobilepage  @ignore
  Scenario: Test Mobile page title
    When User open mobile page
    And User get the mobile page title
    Then title should match with Mobile page

  @fashionpage  @ignore
  Scenario: Test Fashion page title
    When User open Fashion page
    And User get the Fashion page title
    Then title should match with Fashion page

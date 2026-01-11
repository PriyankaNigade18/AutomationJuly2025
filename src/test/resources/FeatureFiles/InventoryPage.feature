Feature: Test Inventory page

  Background: 
    Given User should be login with valid credentials
    Given User should be on Inventory page

  Scenario: Test for Product count
    When user get total product count
    Then Product count should be 6

  Scenario: Test for Product details
    When User get product details
    Then product details should be display

  Scenario: Test for Add product to cart
    When User add "Sauce Labs Bolt T-Shirt" product into Cart
    Then Product should be added into cart

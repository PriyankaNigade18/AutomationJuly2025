Feature: Test Data driven Testing

  Scenario Outline: Test HRM data driven
    Given Open Orangehrm application
    When user enter "<username>" and "<password>"
    When user click on Hrm login button
    Then Valid user should be navigated to dashboard page

    #list of entries
    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Suresh   | test123  |
      | Admin    | admin123 |
      | Pooja    | test123  |

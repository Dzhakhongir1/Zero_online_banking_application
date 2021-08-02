Feature: add new payee under pay bills

  Scenario: Add a new payee
    Given the user is logged in
    And clicks pay Bills tab
    Given user clicks to Add new Payee tab
    And creates new payee using following information
      | Payee Name    | The Law Officers of Hyde, Price & Scharks |
      | Payee Address | 100 Same st,Anytown,USA10001              |
      | Account       | Checking                                  |
      | Payee details | XYZ account                               |
    Then message "The new payee The Law Officers of Hyde, Price & Scharks was successfully created." should be displayed
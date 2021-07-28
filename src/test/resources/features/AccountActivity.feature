Feature: Account	summary	page	should	have following aspects

  Scenario: Account activity test
    Given the user is logged in
    And account title should be "Zero - Account Activity"
    And Account dropdown should have
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |
    Then Transactions table should have column names
    | Date        |
    | Description |
    | Deposit     |
    | Withdrawal  |

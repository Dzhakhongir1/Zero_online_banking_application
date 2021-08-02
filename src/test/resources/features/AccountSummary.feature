Feature: Account	summary	page	should	have	the	title
  Scenario: summary	page	should	have
  Given the user is logged in
  And the title should be "Zero - Account Summary"
  Then user should see "Cash Accounts"
    Then user should see "Investment Accounts"
    Then user should see "Credit Accounts"
    Then user should see "Loan Accounts"


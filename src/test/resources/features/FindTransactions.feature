@3
Feature:Find Transactions in Account Activity

  Scenario: Search date range
    Given the user is logged in
    Given the user accesses the find Transaction tab
    When the user enters data range from "2012-09-01" to "2012-09-06"
    And cluck search
    Then result table should only show transaction dates between "2012-09-01" to "2012-09-06"
    And the result should be sorted by most recent date


    Scenario: search date range 2
    Given the user is logged in
    Given the user accesses the find Transaction tab
    When the user enters data range from "2012-09-02" to "2012-09-06"
    And cluck search
    Then result table should only show transaction dates between "2012-09-02" to "2012-09-06"
    And the result table should not contain transaction date "2012-09-01"

    Scenario: Search description
      Given the user is logged in
      Given the user accesses the find Transaction tab
      When the user enters description "ONLINE"
      And cluck search
      Then results table should	only show descriptions containing "ONLINE"

  Scenario: search description
      Given the user is logged in
      Given the user accesses the find Transaction tab
      When the user enters description "OFFICE"
      And cluck search
      Then results table should	only show descriptions containing "OFFICE"
      But results table	should not show	descriptions containing	"ONLINE"


  Scenario: Search description case insensitive
    Given the user is logged in
    Given the user accesses the find Transaction tab
    When the user enters description "online"
    And cluck search
    Then results table should	only show descriptions containing "ONLINE"

Scenario: Type
  Given the user is logged in
  Given the user accesses the find Transaction tab
  And cluck search
  Then result should show at least one result under Deposit
  Then result tab should show at least one result under Withdrawal
  When user selects type "Deposit"
  And cluck search
  Then result should show at least one result under Deposit
  But result table should not show results under Withdrawal
  When user selects type "Withdrawal"
  And cluck search
  Then result tab should show at least one result under Withdrawal
  But result table should not show results under Deposit






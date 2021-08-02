@wip
Feature: Purchase Foreign Currency

  Scenario: Available currencies
    Given the user is logged in
    And clicks pay Bills tab
    Given the user accesses the Purchase foreign currency cash tab
    Then Following Options should be available
      | Select One            |
      | Australia (dollar)    |
      | Canada (dollar)       |
      | Switzerland (franc)   |
      | China (yuan)          |
      | Denmark (krone)       |
      | Eurozone (euro)       |
      | Great Britain (pound) |
      | Hong Kong (dollar)    |
      | Japan (yen)           |
      | Mexico (peso)         |
      | Norway (krone)        |
      | New Zealand (dollar)  |
      | Sweden (krona)        |
      | Singapore (dollar)    |
      | Thailand (baht)       |

    Scenario:Error message for not selecting currency
      Given the user is logged in
      And clicks pay Bills tab
      Given the user accesses the Purchase foreign currency cash tab
      When user tries to calculate cost without selecting a currency
      Then error message "Please, ensure that you have filled all the required fields with valid values." should be displayed.

    Scenario: Error	message for	not	entering value
      Given the user is logged in
      And clicks pay Bills tab
      Given the user accesses the Purchase foreign currency cash tab
      When user tries to calculate cost without entering a value
      Then error message "Please, ensure that you have filled all the required fields with valid values." should be displayed.




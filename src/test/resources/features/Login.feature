@wip1
Feature: User with wrong credentials should not be able to log in

  Scenario:when user logs in with wrong credentials should not log in
    Given Users	with wrong username	or wrong password should not be	able to	login
    Then error message "Login and/or password are wrong." are	wrong should be displayed.

  Scenario:when user logs in with wrong credentials should not log in
    Given Users with blank username or password should also not be able to login
    Then error message "Login and/or password are wrong." are	wrong should be displayed.

  Scenario: passed scenario
    Given the user is logged in
    Then "Account Summary" page should be	displayed.




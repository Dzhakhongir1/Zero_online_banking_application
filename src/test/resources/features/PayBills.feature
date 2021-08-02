Feature: Pay bills check functionality

  Scenario: User should be able to submit info successful
    Given the user is logged in
    And clicks pay Bills tab
    Then title should be "Zero - Pay Bills"
    And fills out the form
    Then user should get Message Displayed "The payment was successfully submitted."




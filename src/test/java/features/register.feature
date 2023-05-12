Feature: Register

  @Register @Negative
    Scenario: Register with blank field
    Given User on Register page
    When User Click button Next Step
    Then User get Alert message

  @Register @Positive
    Scenario: Register with valid credentials
    Given User on Register page
    When User input First Name
    And User input Last Name
    And User input Email
    And User input Password
    And User input Company Name
    And User click Code Phone
    Then User Select Code Phone
    And User input Phone Number
    And User click Country
    Then User select Country
    And User input state
    And User click checkbox
    And User Click button Next Step
    Then User directed to Dashboard

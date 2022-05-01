Feature: Adding the employee in HRMS application
  @regression @Joel
  Scenario: Adding one employee from feature file
    #Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option
    And user enters firstname middlename and lastname
    And user clicks on save button
    Then employee added successfully

    @Freeman
    Scenario: Adding one employee using cucumber feature file
      When user enters valid admin credentials
      And user clicks on login button
      Then admin user is successfully logged in
      When user clicks on PIM option
      And user clicks on add employee option
      And user enter "zuhoor" "Mujeeb" and "silva"
      And user clicks on save button
      Then employee added successfully

      @123
      Scenario Outline: Adding multiple employees
        When user enters valid admin credentials
        And user clicks on login button
        Then admin user is successfully logged in
        When user clicks on PIM option
        And user clicks on add employee option
        And user enters "<firstName>" "<middleName>" and "<lastName>"
        And user clicks on save button
        Then employee added successfully
        Examples:
        |firstName|middleName|lastName|
        |Asel     |MS        |Tolga   |
        |Yazgul   |MS        |Kishan  |
        |Tarik    |MS        |Mujeeb  |
        |Nassir   |MS        |Volkan  |

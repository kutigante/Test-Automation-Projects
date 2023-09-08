Feature: GET all employees or single employee details

#  Background: Retrieve jwt token
#    Given User 'USER_1' is authorized

  Scenario: Verify user retrieves all the employees details
    Given User sets the below headers for the api request
      | content-type | application/json |
    When User sends GET request to fetch all the employees details
    Then Verify status code is 200

  Scenario: Verify user retrieves single employee details
    Given User sets the below headers for the api request
      | content-type | application/json |
    And User sets the create employee request body with below data
      | name   | kavitha |
      | salary | 1000000 |
      | age    | 30      |
    When User creates new employee using create api endpoint
    Then Verify status code is 200
    Given User sets the below headers for the api request
      | content-type | application/json |
    When User sends GET request to fetch single employee details
    Then Verify status code is 200
    And Verify GET response payload
      | name   | kavitha |
      | salary | 1000000 |
      | age    | 30      |
    Given User sets the below headers for the api request
      | content-type | application/json |
    When User sends DELETE request to delete employee details
    Then Verify status code is 200


  Scenario: Verify user retrieves single employee details1
    Given User sets the below headers for the api request
      | content-type | application/json |
    When User sends GET request to fetch single employee details
    Then Verify status code is 200
    And Verify GET response payload
      | name   | Tiger Nixon |
      | salary | 320800      |
      | age    | 61          |
#  Scenario: Verify user retrieves single employee details1
#    Given User sets the below headers for the api request
#      | content-type | application/json |
#    When User sends GET request to fetch single employee details
#    Then Verify status code is 200
#    And Verify GET response payload
#      | name   | Tiger Nixon |
#      | salary | 320800      |
#      | age    | 61          |

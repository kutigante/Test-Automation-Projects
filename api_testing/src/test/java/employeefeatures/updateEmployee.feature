Feature: Update employee details using PUT

  #  Background: Retrieve jwt token
#    Given User 'USER_1' is authorized

  Scenario: Verify User is able to update the employee details using PUT end point
    Given User sets the below headers for the api request
      | content-type | application/json |
    And User sets the create employee request body with below data
      | name   | kavitha123 |
      | salary | 10000000   |
      | age    | 31         |
    When User updates employee details using update api endpoint
    Then Verify status code is 200
#  Scenario: Verify User is able to update the employee details using PUT end point
#    Given User sets the below headers for the api request
#      | content-type | application/json |
#    And User sets the create employee request body with below data
#      | name   | kavitha123 |
#      | salary | 10000000   |
#      | age    | 31         |
#    When User updates employee details using update api endpoint
#    Then Verify status code is 200
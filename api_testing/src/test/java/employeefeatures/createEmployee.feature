Feature: Create Employee scenario

#  Background: Retrieve jwt token
#    Given User 'USER_1' is authorized

  Scenario: Verify that User is able to create a new employee using create api endpoint;
    Given User sets the below headers for the api request
      | content-type | application/json |
    And User sets the create employee request body with below data
      | name   | kavitha |
      | salary | 1000000 |
      | age    | 30      |
    When User creates new employee using create api endpoint
    Then Verify status code is 200
#    And Verify the response
#


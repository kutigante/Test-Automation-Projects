Feature:
Feature: GET all employees or single employee details

#  Background: Retrieve jwt token
#    Given User 'USER_1' is authorized

  Scenario: Verify user is able to delete employee details using delete endpoint
    Given User sets the below headers for the api request
      | content-type | application/json |
    When User sends DELETE request to delete employee details
    Then Verify status code is 200
#    Given User sets the below headers for the api request
#      | content-type | application/json |
#    When User sends DELETE request to delete employee details
#    Then Verify status code is 200
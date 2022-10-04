
  Feature: User should see 404 not found message when entering invalid zipcode
@wip
    Scenario: User should see 404 not found message when entering invalid zipcode
      When user enters invalid postcode to /us endpoint
      Then status code must be 404, content type must be application/json



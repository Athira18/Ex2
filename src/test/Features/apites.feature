Feature: Test API. Test GET and POST request
  Scenario: Test GET Request
    When server sends a GET Request
    Then clients sends request data

  Scenario: Test POST Request
    When server sends a POST Request
    Then clients creates and returns success status
@Login
Feature: Login module API documentation

  Scenario: Get User Log-token from login endpoint
    Given User add header
    When User add basic authentication for login
    And User send "POST" request for login endpoint
    Then User should verify the status code is 200
    And User should verify the login response body First_name present as "Vaitheeswari" and get the log-token saved
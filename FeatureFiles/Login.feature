Feature: User should be able to login

  @Smoke
  Scenario: User should login with valid credentials
    Given Application is up and running and validated
    When user enter username as "Admin"
    And user enter password as "admin123"
    And user click on login button
    Then user should be able to see dashboard

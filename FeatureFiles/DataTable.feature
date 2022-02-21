Feature: Datatable demo

  @Sample
  Scenario: Datatable as List
    Given the following animals:
      | cow   |
      | horse |
      | sheep |
    Then user should be able to login

  @Sample
  Scenario: Datatable as Map
    Given the following login:
      | Username   | Password |
      | testuser_1 | Test@153 |
      | testuser_2 | Test@154 |
      | testuser_3 | Test@155 |
    Then user should be able to login and see dashboard

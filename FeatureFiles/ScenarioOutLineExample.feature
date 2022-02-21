Feature: Datatable demo

  @OutLineDemo
  Scenario Outline: Running Test Mutiple time
    Given Start application
    When user enter username as "<username>" and password  as "<password>"
    Then login to application

    Examples: 
      | username | password |
      | Mukesh   | Otwani   |
      | Sanjay   | Naveen   |
      | Chandani | Gaurav   |

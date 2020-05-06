Feature: Validate El Tiempo website

  Scenario: Go to El Tiempo and validate Colombia section
    Given that "Alejandro" visits El Tiempo website
    When he clicks on the Colombia option
    Then he should be redirected to the Colombia page
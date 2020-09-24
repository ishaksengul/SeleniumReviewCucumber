@googleArama
Feature: Google arama

  Background: user goes to google page
    Given user goes to google page

  @techproeducationArama
  Scenario: TC01_user searchs techproeducation at google
    And write techproeducation at the search box
    Then check to title of the result page

  @seleniumArama
  Scenario: TC02_user searchs selenium at google
    And write selenium at the search box
    Then user check number of results of search
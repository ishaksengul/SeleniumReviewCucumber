@examples
Feature: Birden cok veri
  Scenario Outline: TC04_google arama testi
    Given user goes to google page
    And user searches "<words>"
    Then user checks the "<words>" in page title

    Examples: Test verileri
    |words           |
    |techproeducation|
    |selenium        |
    |webdriver       |
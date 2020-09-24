Feature: Parametreli arama
  @webdriverArama
  Scenario: TC03_user search at google
    Given user goes to google page
    And user searches for "webdriver"
    Then user checks "webdriver" in page title
@explicit
Feature: Explicit wait ornek
  Scenario: TC05_kullanici add element button'una tiklayarak yeni bir web element olusturur.
    Given Kullanici "https://the-internet.herokuapp.com/add_remove_elements/" bu sayfaya gider
    And kullanici add element button'una tiklar
    Then kullanici delete web elementini gorur
Feature: Amazon urun arama
  @amazonurunarama
 Scenario Outline: TC06_Kullanici amazon da urun aramasi yapar
    Given Kullanici "http://amazon.com" bu sayfaya gider
    And Kullanici arama kutusuna "<kelime>" yazar
    Then Kullanici sonuc sayisini ekrana yazdirir

    Examples:
      |kelime     |
      |headphones |
      |tv         |
      |sponge     |
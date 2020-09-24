@fhctrip
Feature: FhcTrip Kayit
  Scenario Outline: fhctrip web sitesine kayit
    Given kullanici fhctip kayit sayfasia gider
    And kullanici username "<username>" girer
    And kullanici email "<email>" girer
    And kullanici fullname "<fullname>" girer

    Examples: Test verileri
    |username   |email      |fullname    |
    |ishak      |i@gmail.c  |ishak sengul|
    |hamzay     |h@gmail.c  |hamza yilmaz|
    |hakki      |hak@gmail.c|hakki bey   |
    |yusuf      |y@gmail.c  |yusuf sengul|
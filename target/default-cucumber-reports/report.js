$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/amazonarama.feature");
formatter.feature({
  "name": "Amazon urun arama",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "TC06_Kullanici amazon da urun aramasi yapar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@amazonurunarama"
    }
  ]
});
formatter.step({
  "name": "Kullanici \"http://amazon.com\" bu sayfaya gider",
  "keyword": "Given "
});
formatter.step({
  "name": "Kullanici arama kutusuna \"\u003ckelime\u003e\" yazar",
  "keyword": "And "
});
formatter.step({
  "name": "Kullanici sonuc sayisini ekrana yazdirir",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "kelime"
      ]
    },
    {
      "cells": [
        "headphones"
      ]
    },
    {
      "cells": [
        "tv"
      ]
    },
    {
      "cells": [
        "sponge"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC06_Kullanici amazon da urun aramasi yapar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@amazonurunarama"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici \"http://amazon.com\" bu sayfaya gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.ExplicitStepDefinitions.kullanici_bu_sayfaya_gider(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici arama kutusuna \"headphones\" yazar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.kullanici_arama_kutusuna_yazar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici sonuc sayisini ekrana yazdirir",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.kullanici_sonuc_sayisini_ekrana_yazdirir()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC06_Kullanici amazon da urun aramasi yapar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@amazonurunarama"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici \"http://amazon.com\" bu sayfaya gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.ExplicitStepDefinitions.kullanici_bu_sayfaya_gider(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici arama kutusuna \"tv\" yazar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.kullanici_arama_kutusuna_yazar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici sonuc sayisini ekrana yazdirir",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.kullanici_sonuc_sayisini_ekrana_yazdirir()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC06_Kullanici amazon da urun aramasi yapar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@amazonurunarama"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici \"http://amazon.com\" bu sayfaya gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.ExplicitStepDefinitions.kullanici_bu_sayfaya_gider(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici arama kutusuna \"sponge\" yazar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.kullanici_arama_kutusuna_yazar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici sonuc sayisini ekrana yazdirir",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.kullanici_sonuc_sayisini_ekrana_yazdirir()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanici arama kutusuna {string} yazar")
    public void kullanici_arama_kutusuna_yazar(String string) {
        amazonPage.searchBox.sendKeys(string+ Keys.ENTER);
    }

    @Then("Kullanici sonuc sayisini ekrana yazdirir")
    public void kullanici_sonuc_sayisini_ekrana_yazdirir() {
        System.out.println(amazonPage.result.getText());
    }

}

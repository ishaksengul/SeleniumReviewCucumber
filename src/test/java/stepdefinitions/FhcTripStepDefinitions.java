package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.FhcTripKayitPage;
import pages.GooglePage;
import utilities.Driver;

public class FhcTripStepDefinitions {

    FhcTripKayitPage fhcTripKayitPage = new FhcTripKayitPage();

    @Given("kullanici fhctip kayit sayfasia gider")
    public void kullanici_fhctip_kayit_sayfasia_gider() {
        Driver.getDriver().get("http://fhctrip-qa.com/Account/Register");
    }

    @Given("kullanici username {string} girer")
    public void kullanici_username_girer(String string) {
        fhcTripKayitPage.userName.sendKeys(string);
    }

    @Given("kullanici email {string} girer")
    public void kullanici_email_girer(String string) {
        fhcTripKayitPage.email.sendKeys(string);
    }

    @Given("kullanici fullname {string} girer")
    public void kullanici_fullname_girer(String string) {
        fhcTripKayitPage.fullName.sendKeys(string);
    }
}

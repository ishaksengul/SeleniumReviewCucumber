package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.GooglePage;
import utilities.Driver;

public class GoogleAramaStepDefinitios {
    GooglePage googlePage = new GooglePage();

    @Given("user goes to google page")
    public void user_goes_to_google_page() {
        System.out.println("Kullanici google'a gitti");
        Driver.getDriver().get("http://google.com");
    }

    @Given("write techproeducation at the search box")
    public void write_techproeducation_at_the_search_box() {
        System.out.println("Kullanici techproeducation yazdi");
        googlePage.searchBox.sendKeys("techproeducation"+ Keys.ENTER);
    }

    @Then("check to title of the result page")
    public void check_to_title_of_the_result_page() throws InterruptedException {
        System.out.println("Kullanici sayfa basligini kontrol etti");
        Thread.sleep(2000);
        String baslik = Driver.getDriver().getTitle();
        boolean iceriyorMu = baslik.contains("techproeducation");
        Assert.assertTrue(iceriyorMu);

    }

    @Given("write selenium at the search box")
    public void write_selenium_at_the_search_box() {
        System.out.println("Kullanici selenium yazdi");
        googlePage.searchBox.sendKeys("Selenium"+ Keys.ENTER);
    }

    @Then("user check number of results of search")
    public void user_check_number_of_results_of_search() {
        System.out.println("Kullanici cikan sonuc sayisini kontrol etti");
        String result = googlePage.result.getText();
        System.out.println(result);
    }

    @Given("user searches for {string}")
    public void user_searches_for(String string) {
       googlePage.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("user checks {string} in page title")
    public void user_checks_in_page_title(String string) throws InterruptedException {
        Thread.sleep(2000);
        String baslik = Driver.getDriver().getTitle();
        boolean iceriyorMu = baslik.contains(string);
        Assert.assertTrue(iceriyorMu);
    }


    @Given("user searches {string}")
    public void user_searches(String string) {
        googlePage.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("user checks the {string} in page title")
    public void user_checks_the_in_page_title(String string) throws InterruptedException {
       Thread.sleep(2000);
        String baslik = Driver.getDriver().getTitle();
        boolean iceriyorMu = baslik.contains(string);
        Assert.assertTrue(iceriyorMu);
    }



}
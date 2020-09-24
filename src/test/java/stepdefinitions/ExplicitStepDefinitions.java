package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ExplicitPage;
import sun.java2d.pipe.DrawImage;
import utilities.Driver;

public class ExplicitStepDefinitions {

    ExplicitPage explicitPage = new ExplicitPage();

    @Given("Kullanici {string} bu sayfaya gider")
    public void kullanici_bu_sayfaya_gider(String string) {
        Driver.getDriver().get(string);
    }

    @Given("kullanici add element button'una tiklar")
    public void kullanici_add_element_button_una_tiklar() {
        explicitPage.addElementButton.click();
    }

    @Then("kullanici delete web elementini gorur")
    public void kullanici_delete_web_elementini_gorur() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        WebElement yeniElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@onclick='deleteElement()']")));

        System.out.println(yeniElement.getText());
        String icerisindekiYazi = yeniElement.getText();
        boolean iceriyorMu = icerisindekiYazi.contains("Delete");
        Assert.assertTrue(iceriyorMu);
    }

}

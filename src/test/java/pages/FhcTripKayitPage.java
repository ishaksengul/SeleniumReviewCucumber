package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FhcTripKayitPage {
    public FhcTripKayitPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "UserName")
    public WebElement userName;

    @FindBy (id = "Email")
    public WebElement email;

    @FindBy (id = "NameSurname")
    public WebElement fullName;



}

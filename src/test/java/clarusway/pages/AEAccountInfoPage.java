package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AEAccountInfoPage {

    public AEAccountInfoPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//div[@id='uniform-id_gender1']")
    public WebElement genderSelection;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;
    @FindBy(xpath = "//select[@id='days']")
    public WebElement dobDaySelection;
    @FindBy(xpath = "//select[@id='months']")
    public WebElement dobMonthSelection;
    @FindBy(xpath = "//select[@id='years']")
    public WebElement dobYearSelection;
    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement newsletterOpt;
    @FindBy(xpath = "//input[@id='optin']")
    public WebElement specialOfferOpt;
    @FindBy(id = "first_name")
    public WebElement firstname;
    @FindBy(id = "last_name")
    public WebElement lastname;
    @FindBy(id = "address1")
    public WebElement addressInput;
    @FindBy(xpath = "//select[@name='country']")
    public WebElement country;
    @FindBy(id = "state")
    public WebElement state;
    @FindBy(id = "city")
    public WebElement city;
    @FindBy(id = "zipcode")
    public WebElement zipcode;
    @FindBy(id = "mobile_number")
    public WebElement phonenumber;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccount;






}

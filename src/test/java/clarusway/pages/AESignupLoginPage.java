package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AESignupLoginPage {

    public AESignupLoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement name;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement email;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signupButton;


}

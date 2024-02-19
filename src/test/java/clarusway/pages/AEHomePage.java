package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AEHomePage {

    public AEHomePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement signupLoginButton;
    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement accountDeleteButton;
    @FindBy(xpath = "//i[@class='fa fa-home']")
    public WebElement homePageButton;



}

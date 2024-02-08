package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XyzBankManagerPage {
    public XyzBankManagerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//button[@ng-click='manager()']")
    public WebElement addCustomer;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement inputFirstName;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement inputLastName;
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    public WebElement inputPostCode;
}

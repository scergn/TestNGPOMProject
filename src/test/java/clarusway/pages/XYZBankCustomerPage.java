package clarusway.pages;



import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class XYZBankCustomerPage {

    public XYZBankCustomerPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "userSelect")
    public WebElement customerSelectDropDown;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    public WebElement depositButton;

    @FindBy(xpath = "//input[@placeholder='amount']")
    public WebElement amountDepositInput;

    @FindBy(xpath = "//button[.='Deposit']")
    public WebElement depositSubmitButton;

    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    public WebElement withdrawalButton;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement amountToBeWithdrawnInput;

    @FindBy(xpath = "//button[.='Withdraw']")
    public WebElement withdrawSubmitButton;

    @FindBy(xpath = "//button[@class='btn home']")
    public WebElement homeButton;
}

package clarusway.tasks;

import clarusway.pages.XYZBankCustomerPage;
import clarusway.pages.XYZBankHomePage;
import clarusway.pages.XYZBankManagerPage;
import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Task_33 {
    //Open 5 new  Accounts, deposit 100 USD and withdraw 100 USD from any account you created and delete all accounts you created.
    //App: https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
    private Faker faker = new Faker();

    @Test
    public void XYZTest() {

        Driver.getDriver().get(ConfigReader.getProperty("xyz_bank_url"));

        XYZBankHomePage xyzBankHomePage = new XYZBankHomePage();
        xyzBankHomePage.bankManagerLoginButton.click();
        XYZBankManagerPage xyzBankManagerPage = new XYZBankManagerPage();
        xyzBankManagerPage.addCustomerButton.click();
        for (int i = 0; i < 5; i++) {
            xyzBankManagerPage.firstnameInput.sendKeys(faker.name().firstName());
            xyzBankManagerPage.lastnameInput.sendKeys(faker.name().lastName());
            xyzBankManagerPage.postCodeInput.sendKeys(faker.address().zipCode());
            xyzBankManagerPage.addCustomerSubmitButton.click();
            try {
                Alert alert = Driver.getDriver().switchTo().alert();
                alert.accept();
            } catch (Exception ignored) {
            }
        }
        xyzBankManagerPage.openAccountButton.click();

        Select select1 = new Select(xyzBankManagerPage.customerDropDown);
        Select select2 = new Select(xyzBankManagerPage.currencyDropDown);

        for (int i = 6; i < 11; i++) {
            select1.selectByIndex(i);
            select2.selectByIndex(1);
            xyzBankManagerPage.processSubmitButton.click();

            try {
                Driver.getDriver().switchTo().alert().accept();
            } catch (Exception ignored) {
            }
        }
        xyzBankManagerPage.homeButton.click();
        xyzBankHomePage.customerLoginButton.click();
        XYZBankCustomerPage xyzBankCustomerPage = new XYZBankCustomerPage();
        Select select3 = new Select(xyzBankCustomerPage.customerSelectDropDown);
        select3.selectByIndex(6);
        xyzBankCustomerPage.loginButton.click();
        xyzBankCustomerPage.depositButton.click();
        xyzBankCustomerPage.amountDepositInput.sendKeys("100");
        xyzBankCustomerPage.depositSubmitButton.click();
        xyzBankCustomerPage.withdrawalButton.click();
        xyzBankCustomerPage.withdrawSubmitButton.click();
        xyzBankCustomerPage.amountToBeWithdrawnInput.sendKeys("100");
        xyzBankCustomerPage.withdrawSubmitButton.click();
        xyzBankCustomerPage.homeButton.click();
        xyzBankHomePage.bankManagerLoginButton.click();
        xyzBankManagerPage.customersButton.click();
        for (WebElement w : xyzBankManagerPage.deleteButton) {
            w.click();
        }
    }
}
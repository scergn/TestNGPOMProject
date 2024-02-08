package clarusway.tasks;

import clarusway.pages.XyzBankHomePage;
import clarusway.pages.XyzBankManagerPage;
import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import org.testng.annotations.Test;

public class Task_33 {
    //Open 5 new  Accounts, deposit 100 USD and withdraw 100 USD from any account you created and delete all accounts you created.

    //App: https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
@Test
    public void xyzBankTest(){
    Driver.getDriver().get(ConfigReader.getProperty("xyzbank_url"));
    XyzBankHomePage xyzBankHomePage =new XyzBankHomePage();
    XyzBankManagerPage xyzBankManagerPage = new XyzBankManagerPage();

    xyzBankHomePage.managerAccess.click();
    xyzBankManagerPage.addCustomer.click();
    xyzBankManagerPage.inputFirstName.sendKeys(ConfigReader.getProperty("xyzbank_firstname"));
    xyzBankManagerPage.inputLastName.sendKeys(ConfigReader.getProperty("xyzbank_lastname"));
    xyzBankManagerPage.inputPostCode.sendKeys(ConfigReader.getProperty("xyzbank_postcode"));







}








}

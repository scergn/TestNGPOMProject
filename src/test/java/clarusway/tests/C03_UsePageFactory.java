package clarusway.tests;

import clarusway.pages.ContactListContactPage;
import clarusway.pages.ContactListHomePage;
import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class C03_UsePageFactory {

    @Test
    public void test1() {

        Driver.getDriver().get(ConfigReader.getProperty("contact_list_app"));

        ContactListHomePage contactListHomePage = new ContactListHomePage();
        contactListHomePage.username.sendKeys(ConfigReader.getProperty("contact_list_username"));
        contactListHomePage.password.sendKeys(ConfigReader.getProperty("contact_list_password"));
        contactListHomePage.submit.click();

        //Giris yapildigini dogrula(assert)

        ContactListContactPage contactListContactPage = new ContactListContactPage();
        assertTrue(contactListContactPage.logout.isDisplayed());
        assertTrue(contactListContactPage.header.isDisplayed());
        assertTrue(contactListContactPage.addContact.isDisplayed());

        //Driver'i kapa
        Driver.closeDriver();
    }


}

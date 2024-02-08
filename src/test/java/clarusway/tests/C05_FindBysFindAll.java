package clarusway.tests;

import clarusway.pages.InputValidationPage;
import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import org.testng.annotations.Test;

public class C05_FindBysFindAll {


    @Test
    public void test1() {

        InputValidationPage inputValidationPage = new InputValidationPage();

        Driver.getDriver().get(ConfigReader.getProperty("input_validation_url"));
        inputValidationPage.firstname.sendKeys("John");
        inputValidationPage.lastname.sendKeys("Doe");
        inputValidationPage.notes.sendKeys("Note1");

        Driver.closeDriver();
    }


}

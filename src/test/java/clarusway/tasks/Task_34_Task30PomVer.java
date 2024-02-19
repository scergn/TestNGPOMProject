package clarusway.tasks;

import clarusway.pages.AEAccountInfoPage;
import clarusway.pages.AEHomePage;
import clarusway.pages.AESignupLoginPage;
import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import clarusway.utilities.ExtentReportUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Task_34_Task30PomVer {
    /*
Go to https://automationexercise.com/
Create an account and delete it.
Create HTML report for each step with screenshots
 */
    Faker faker = new Faker();
    AEAccountInfoPage aeAccountInfoPage = new AEAccountInfoPage();
    AEHomePage aeHomePage = new AEHomePage();
    AESignupLoginPage aeSignupLoginPage = new AESignupLoginPage();

    @Test
    public void test() throws InterruptedException {
        ExtentReportUtils.createTestReport("Test: Task_34", "Task_34");

        Driver.getDriver().get(ConfigReader.getProperty("automation_exercise"));
        Thread.sleep(500);
        aeHomePage.signupLoginButton.click();
        ExtentReportUtils.passAndCaptureScreenshot("");
        aeSignupLoginPage.name.sendKeys(faker.name().firstName());
        aeSignupLoginPage.email.sendKeys(faker.internet().emailAddress());
        ExtentReportUtils.passAndCaptureScreenshot("");
        Thread.sleep(500);
        aeSignupLoginPage.signupButton.click();
        aeAccountInfoPage.genderSelection.click();
        aeAccountInfoPage.passwordInput.sendKeys(faker.internet().password());
        Select select1 = new Select(aeAccountInfoPage.dobDaySelection);
        select1.selectByIndex(5);
        Select select2 = new Select(aeAccountInfoPage.dobMonthSelection);
        select2.selectByVisibleText("May");
        Select select3 = new Select(aeAccountInfoPage.dobYearSelection);
        select3.selectByIndex(22);
        JavascriptExecutor jse1 = (JavascriptExecutor) Driver.getDriver();
        jse1.executeScript("arguments[0].scrollIntoView()", aeAccountInfoPage.newsletterOpt);
        aeAccountInfoPage.newsletterOpt.click();
        aeAccountInfoPage.specialOfferOpt.click();
        aeAccountInfoPage.addressInput.sendKeys(faker.address().streetAddress());
        aeAccountInfoPage.firstname.sendKeys(faker.name().firstName());
        aeAccountInfoPage.lastname.sendKeys(faker.name().lastName());
        ExtentReportUtils.passAndCaptureScreenshot("");
        Select select4 = new Select(aeAccountInfoPage.country);
        select4.selectByIndex(1);
        aeAccountInfoPage.state.sendKeys(faker.address().state());
        aeAccountInfoPage.city.sendKeys(faker.address().city());
        aeAccountInfoPage.zipcode.sendKeys(faker.address().zipCode());
        aeAccountInfoPage.phonenumber.sendKeys(faker.phoneNumber().cellPhone());
        ExtentReportUtils.passAndCaptureScreenshot("");
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView()", aeAccountInfoPage.createAccount);
        aeAccountInfoPage.createAccount.click();
        ExtentReportUtils.passAndCaptureScreenshot("");
        Thread.sleep(2000);
        Driver.getDriver().navigate().refresh();
        Thread.sleep(1000);

        aeHomePage.homePageButton.click();
        Thread.sleep(1000);

        Driver.getDriver().navigate().refresh();

        aeHomePage.accountDeleteButton.click();
        Driver.getDriver().navigate().refresh();
        ExtentReportUtils.passAndCaptureScreenshot("");

        Driver.closeDriver();

    }

}
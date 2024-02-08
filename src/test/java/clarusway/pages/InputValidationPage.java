package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class InputValidationPage {
    public InputValidationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "firstname")
    public WebElement firstname;

    @FindBys({//AND operator gibi alttaki tum locator'larin bulunmasi gerekiyor
            @FindBy(id = "surname"),
            @FindBy(xpath = "//input[@name='surname']")
    })
    public WebElement lastname;

    @FindAll({//OR operator gibi seceneklerden birinin locate edilebilmesi web elemntin bulunmasi yeterlidir.
            @FindBy(id = "notes"),
            @FindBy(xpath = "//textarea[@maxlenght='2000']"),
            @FindBy(name = "notes")
    })
    public WebElement notes;
}

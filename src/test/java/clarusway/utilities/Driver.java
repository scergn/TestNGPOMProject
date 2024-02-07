package clarusway.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;

    private Driver() {
    }// new keyword'u ile baska class'lardan bu class'in bir objesinin olusturulmasinin onune gecer

    public static WebDriver getDriver() {
        if (driver == null) {

            String browser = ConfigReader.getProperty("browser");

            switch (browser) {//
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "firfox":
                    driver = new FirefoxDriver();
                    break;
                case "headless":
                    driver = new ChromeDriver(new ChromeOptions().addArguments("--headless=new"));
                    break;
                default:
                    driver = new ChromeDriver();
            }


        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    public static void closeDriver() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (driver != null) {
            driver.quit();
            driver = null;//quit islmei sonrasi get driver metodu tekrardan olusturabilsin
        }
    }
}
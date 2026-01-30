package stepdefinitions;
import driver.DriverFactory;
import config.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void launchBrowser() {
        DriverFactory.initDriver(ConfigReader.get("browser"));
        WebDriver driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get(ConfigReader.get("url"));
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}

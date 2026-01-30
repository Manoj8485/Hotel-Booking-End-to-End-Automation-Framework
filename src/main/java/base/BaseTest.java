package base;
import config.ConfigReader;
import driver.DriverFactory;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver;

    public void setup() {
        DriverFactory.initDriver(ConfigReader.get("browser"));
        driver = DriverFactory.getDriver();
        driver.get(ConfigReader.get("url"));
    }

    public void tearDown() {
        DriverFactory.quitDriver();
    }
}

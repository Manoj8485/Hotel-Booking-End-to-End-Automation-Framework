package stepdefinitions;
import driver.DriverFactory;
import pages.LoginPage;
import pages.SearchHotelPage;
import pages.SelectHotelPage;
import pages.BookHotelPage;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;

public class HotelBookingSteps {

    private WebDriver driver;

    public HotelBookingSteps() {
        this.driver = DriverFactory.getDriver();
    }

    @Given("user is on login page")
    public void loginPage() {
        new LoginPage(driver).login(
                config.ConfigReader.get("username"),
                config.ConfigReader.get("password")
        );
    }

    @When("user searches hotel")
    public void searchHotel() {
        new SearchHotelPage(driver).searchHotel();
    }

    @And("user selects hotel")
    public void selectHotel() {
        new SelectHotelPage(driver).selectHotel();
    }

    @Then("user books hotel successfully")
    public void bookHotel() {
        new BookHotelPage(driver).bookHotel();
    }
}

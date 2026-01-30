package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectHotelPage {

    WebDriver driver;

    By radioBtn = By.id("radiobutton_0");
    By continueBtn = By.id("continue");

    public SelectHotelPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectHotel() {
        driver.findElement(radioBtn).click();
        driver.findElement(continueBtn).click();
    }
}

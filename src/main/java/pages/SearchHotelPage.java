package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SearchHotelPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public SearchHotelPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void searchHotel() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("location")));

        driver.findElement(By.id("location")).sendKeys("Sydney");
        driver.findElement(By.id("hotels")).sendKeys("Hotel Creek");
        driver.findElement(By.id("room_type")).sendKeys("Standard");
        driver.findElement(By.id("Submit")).click();
    }
}

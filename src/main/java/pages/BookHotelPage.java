package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookHotelPage {

    WebDriver driver;

    By firstName = By.id("first_name");
    By lastName = By.id("last_name");
    By address = By.id("address");
    By ccNum = By.id("cc_num");
    By bookNow = By.id("book_now");

    public BookHotelPage(WebDriver driver) {
        this.driver = driver;
    }

    public void bookHotel() {
        driver.findElement(firstName).sendKeys("Manoj");
        driver.findElement(lastName).sendKeys("Mane");
        driver.findElement(address).sendKeys("Pune");
        driver.findElement(ccNum).sendKeys("1234567812345678");
        driver.findElement(bookNow).click();
    }
}

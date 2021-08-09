package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DonePage {
    private WebDriver driver;
    private By statusAlert = By.id("bookings");

    public DonePage(WebDriver driver){ this.driver = driver; }

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }



}

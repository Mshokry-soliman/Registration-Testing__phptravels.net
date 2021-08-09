package base;

import Pages.RegisterPage;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import utils.EventReporter;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    private EventFiringWebDriver driver;
    protected RegisterPage homePage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventReporter());
        goHome();

        homePage = new RegisterPage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.manage().deleteAllCookies();

        driver.get("https://www.phptravels.net/register");

    }

    @AfterClass

    public void tearDown() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.close(); }

    @AfterMethod
    public void recordFailures(ITestResult result) {
        if(ITestResult.FAILURE== result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenShot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenShot, new File("resources/Screenshooots/" + result.getName()+ ".png"));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

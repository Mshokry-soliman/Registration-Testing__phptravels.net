package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
    private WebDriver driver;
   //    private By uploadedFile = By.id("uploaded-files");
    private By firstNameField = By.name("firstname");
    private By lastNameField = By.name("lastname");
    private By phoneNumberField = By.name("phone");
    private By emailAddressField = By.name("email");
    private By PasswordField = By.name("password");
    private By confirmPasswordField = By.name("confirmpassword");
    private By SignUp = By.xpath("//*[@id=\"headersignupform\"]/div[8]/button");
  //  private By newOne= By.cssSelector("section>div>div>div>div>img[src=\"https://www.phptravels.net/themes/default/assets/img/sign-bg.png\"]");
  //  private By button= By.cssSelector("button[class=\"signupbtn btn_full btn btn-success btn-block btn-lg\"]");
   // private By AlertText = By.id("login");
 public RegisterPage(WebDriver driver){ this.driver = driver; }
    public void setFirstName(String firstName)             {driver.findElement(firstNameField).sendKeys(firstName);}
    public void setLastName(String lastName)               {driver.findElement(lastNameField).sendKeys(lastName);}
    public void setPhoneNumber(String phoneNumber)         {driver.findElement(phoneNumberField).sendKeys(phoneNumber);}
    public void setEmailAddress(String emailAddress)       {driver.findElement(emailAddressField).sendKeys(emailAddress);}
    public void setPassword(String Password)               {driver.findElement(PasswordField).sendKeys(Password);}
    public void setConfirmPassword(String confirmPassword) {driver.findElement(confirmPasswordField).sendKeys(confirmPassword);}

    public DonePage clickSignUpButton() {
        driver.findElement(SignUp).click();

    WebDriverWait wait=new WebDriverWait(driver,7);
    wait.until(ExpectedConditions.invisibilityOf(driver.findElement(SignUp)));
    return new DonePage(driver); }

 public String getAlert(){ return driver.findElement(firstNameField).getText(); }

}
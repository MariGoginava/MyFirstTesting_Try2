//Page URL1 https://the-internet.herokuapp.com/
//Page URL2 https://the-internet.herokuapp.com/forgot_password

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForms extends PageObject{

   // private final String FORGOT_PASSWORD = "Forgot Password";
    private static final String EMAIL = "Email";
    // private final String RETRIEVE_PASSWORD = "Retrieve Password";

    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[20],'Forgot Password')]")
    private final WebElement ForgotPassword_button;

    //Xpath--for--forgot Password--  //*[@id="content"]/ul/li[20]

    @FindBy(id = "email")
    private final WebElement Email;

    @FindBy(xpath = "//*[@id=\"form_submit\"],'RetrievePassword')]")
    private final WebElement RetrievePassword_button;
    //*[@id="form_submit"]
    //Xpath--for retrieve password--

    /*@FindBy(xpath = "//*[@id=\"content\"],'Your e-mail's been sent!')]")
    private final WebElement alertSuccess;*/

    public WebForms(WebDriver driver, WebElement forgotPassword_button, WebElement email, WebElement retrievePassword_button) {
        super(driver);
        ForgotPassword_button = forgotPassword_button;
        Email = email;
        RetrievePassword_button = retrievePassword_button;
    }
    
    public void pressForgotPasswordButton(){
        this.ForgotPassword_button.click();
    }

    public void enterEmail(){
        this.Email.sendKeys(EMAIL);
    }

    public void pressRetrievePasswordButton(){
        this.RetrievePassword_button.click();
    }

    public void verifyAlertSuccess() {
    }
}
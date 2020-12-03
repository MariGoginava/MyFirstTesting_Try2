import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPlan {

    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("WebDriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Submit a WebForms")
    public static void submitForm(){
        driver.get(Utils.BASE_URL);
        WebForms w = new WebForms(driver, null, null, null);
        w.pressForgotPasswordButton();
        w.enterEmail();
        w.pressRetrievePasswordButton();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        w.verifyAlertSuccess();

    }

    @AfterSuite
    public void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
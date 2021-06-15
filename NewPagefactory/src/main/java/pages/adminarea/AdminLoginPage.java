package pages.adminarea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import utilities.Browser;

import java.util.concurrent.TimeUnit;

public class AdminLoginPage {

    private static String url = "http://shop.pragmatic.bg/admin";

    private static final By USER_NAME_FIELD = By.id("input-username");
    private static final By PASSWORD_FIELD = By.id("input-password");
    private static final By LOGIN_BUTTON = By.cssSelector(".btn.btn-primary");
    private static final By LOGIN_VALIDATION_ERROR = By.cssSelector(".alert-danger");




    public static void goToAdminLoginPage() {
        Browser.driver.get(url);
    }

    public static void login(String userName, String password){
        Browser.driver.findElement(USER_NAME_FIELD).sendKeys(userName);
        Browser.driver.findElement(PASSWORD_FIELD).sendKeys(password);
        Browser.driver.findElement(LOGIN_BUTTON).click();
    }


    public static void verifyValidationMessage(String expectedValidationMessage, String messageOnFailure){
        String actualValidationMessage = Browser.driver.findElement(LOGIN_VALIDATION_ERROR).getText();
        Assert.assertTrue(actualValidationMessage.contains(expectedValidationMessage), messageOnFailure);
    }
}

package pages.adminarea;


import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Browser;

public class AdminDashboardPage extends BasePage {

    @FindBy(css = "div#content h1")
    private static WebElement dashboardHeading;

    static {
        PageFactory.initElements(Browser.driver, AdminDashboardPage.class);
    }

    public static void verifyDashboardTitle(String expectedDashboardTitle) {
        Assert.assertEquals(Browser.driver.getTitle(), expectedDashboardTitle);
    }

    public static void verifyDashboardHeadingText(String expectedDashboardHeadingText, String messageOnTestFailure){
        String actualDashboardHeadingText = dashboardHeading.getText();
        Assert.assertEquals(actualDashboardHeadingText, expectedDashboardHeadingText, messageOnTestFailure);
    }
}

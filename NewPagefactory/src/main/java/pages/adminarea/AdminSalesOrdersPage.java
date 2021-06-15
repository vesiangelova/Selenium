package pages.adminarea;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Browser;

public class AdminSalesOrdersPage extends BasePage {
    private static final By SALES_LINK = By.id("menu-sale");
    private static final By ORDERS_LINK = By.xpath("//a[contains(text(),'Orders')]");

    @FindBy(css = "div#content h1")
    private static WebElement salesOrdersHeading;

    static {
        PageFactory.initElements(Browser.driver, AdminSalesOrdersPage.class);
    }

    public static void verifySalesOrdersExpectedTitle(String expectedSalesOrdersTitle) {
        Browser.driver.findElement(SALES_LINK).click();
        Browser.driver.findElement(ORDERS_LINK).click();
        Assert.assertEquals(Browser.driver.getTitle(), expectedSalesOrdersTitle);
    }

    public static void verifySalesOrdersHeadingText(String expectedSalesOrdersHeadingText, String messageOnTestFailure){
        String actualSalesOrdersHeadingText = salesOrdersHeading.getText();
        Assert.assertEquals(actualSalesOrdersHeadingText, expectedSalesOrdersHeadingText, messageOnTestFailure);
    }
}

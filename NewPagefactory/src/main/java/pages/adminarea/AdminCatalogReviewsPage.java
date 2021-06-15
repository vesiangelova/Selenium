package pages.adminarea;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Browser;

public class AdminCatalogReviewsPage extends BasePage {
    private static final By CATALOG_LINK = By.id("menu-catalog");
    private static final By REVIEWS_LINK = By.xpath("//a[contains(text(),'Reviews')]");

    @FindBy(css = "div#content h1")
    private static WebElement catalogReviewsHeading;

    static {
        PageFactory.initElements(Browser.driver, AdminCatalogReviewsPage.class);
    }

    public static void verifyCatalogReviewsExpectedTitle(String expectedCatalogReviewsTitle) {
        Browser.driver.findElement(CATALOG_LINK).click();
        Browser.driver.findElement(REVIEWS_LINK).click();
        Assert.assertEquals(Browser.driver.getTitle(), expectedCatalogReviewsTitle);
    }

    public static void verifyCatalogReviewsHeadingText(String expectedCatalogReviewssHeadingText, String messageOnTestFailure){
        String actualCatalogReviewsHeadingText = catalogReviewsHeading.getText();
        Assert.assertEquals(actualCatalogReviewsHeadingText, expectedCatalogReviewssHeadingText, messageOnTestFailure);
    }
}

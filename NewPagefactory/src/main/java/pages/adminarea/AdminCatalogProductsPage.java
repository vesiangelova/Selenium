package pages.adminarea;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Browser;

public class AdminCatalogProductsPage extends BasePage {
    private static final By CATALOG_LINK = By.id("menu-catalog");
    private static final By PRODUCTS_LINK = By.xpath("//a[contains(text(),'Products')]");

    @FindBy(css = "div#content h1")
    private static WebElement catalogProductsHeading;

    static {
        PageFactory.initElements(Browser.driver, AdminCatalogProductsPage.class);
    }

    public static void verifyCatalogProductsExpectedTitle(String expectedCatalogProductsTitle) {
        Browser.driver.findElement(CATALOG_LINK).click();
        Browser.driver.findElement(PRODUCTS_LINK).click();
        Assert.assertEquals(Browser.driver.getTitle(), expectedCatalogProductsTitle);
    }

    public static void verifyCatalogProductsHeadingText(String expectedCatalogProductsHeadingText, String messageOnTestFailure){
        String actualCatalogProductsHeadingText = catalogProductsHeading.getText();
        Assert.assertEquals(actualCatalogProductsHeadingText, expectedCatalogProductsHeadingText, messageOnTestFailure);
    }
}

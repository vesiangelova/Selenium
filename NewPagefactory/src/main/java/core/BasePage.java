package core;

import org.openqa.selenium.By;
import utilities.Browser;

public class BasePage {
    protected void click(By locator){
        Browser.driver.findElement(locator).click();
    }

    protected static void type(By locator, String textToType) {
        Browser.driver.findElement(locator).sendKeys(textToType);
    }

    protected static boolean isDisplayed(By locator){
        return !Browser.driver.findElements(locator).isEmpty();
}
    protected  static String getElementText(By locator){
        return Browser.driver.findElement(locator).getText();
    }
}

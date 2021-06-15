package core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.Browser;

public class BaseTest {

    @BeforeMethod
    protected static void setupBrowser(){
        Browser.setup();
    }

    @AfterMethod
    protected  static void quitBrowser(){
        Browser.quit();
    }
}

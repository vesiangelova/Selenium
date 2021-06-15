package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {
    public static WebDriver driver;

    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vesi\\Documents\\Progmatic downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //driver.get("http://shop.pragmatic.bg/admin");
    }

    public static void quit(){
        driver.quit();
    }

}

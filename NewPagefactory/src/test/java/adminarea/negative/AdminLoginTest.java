package adminarea.negative;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.adminarea.AdminLoginPage;

public class AdminLoginTest extends BaseTest {

    @Test
    public static void loginByUsingWrongUsernameAndWrongPassword(){
        AdminLoginPage.goToAdminLoginPage();
        AdminLoginPage.login("blabla", "blablabla");
        AdminLoginPage.verifyValidationMessage("No match for Username and/or Password.", "wrong error message");
    }
}

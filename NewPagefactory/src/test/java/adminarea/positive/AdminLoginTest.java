package adminarea.positive;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.adminarea.*;

public class AdminLoginTest extends BaseTest {

    @Test
    public static void loginByUsingCorrectUsernameAndCorrectPassword(){
        AdminLoginPage.goToAdminLoginPage();
        AdminLoginPage.login("admin", "parola123!");
        AdminDashboardPage.verifyDashboardTitle("Dashboard");
        AdminDashboardPage.verifyDashboardHeadingText("Dashboard",
                "The heading of the dashboard is different from the expected one.");
    }

    @Test
    public static void loginAndGoToSalesLink(){
        AdminLoginPage.goToAdminLoginPage();
        AdminLoginPage.login("admin", "parola123!");
        AdminSalesOrdersPage.verifySalesOrdersExpectedTitle("Orders");
        AdminSalesOrdersPage.verifySalesOrdersHeadingText("Orders",
                "The heading of the sales orders is different from the expected one.");
    }

    @Test
    public static void loginAndGoToProductsLink(){
        AdminLoginPage.goToAdminLoginPage();
        AdminLoginPage.login("admin", "parola123!");
        AdminCatalogProductsPage.verifyCatalogProductsExpectedTitle("Products");
        AdminCatalogProductsPage.verifyCatalogProductsHeadingText("Products",
                "The heading of the catalog products is different from the expected one.");
    }

    @Test
    public static void loginAndGoToReviewsLink(){
        AdminLoginPage.goToAdminLoginPage();
        AdminLoginPage.login("admin", "parola123!");
        AdminCatalogReviewsPage.verifyCatalogReviewsExpectedTitle("Reviews");
        AdminCatalogReviewsPage.verifyCatalogReviewsHeadingText("Reviews",
                "The heading of the catalog reviews is different from the expected one.");
    }
}

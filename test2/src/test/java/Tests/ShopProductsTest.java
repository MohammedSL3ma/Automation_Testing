package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ShopProductsPage;
import org.testng.annotations.Test;

public class ShopProductsTest extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    ShopProductsPage shopProductsPage;

    @Test
    public void ShopProduct() throws InterruptedException {
        homePage=new HomePage(driver);
        homePage.Open_login_page();
        Thread.sleep(3000);
        loginPage=new LoginPage(driver);
        loginPage.LogIn("amourakora2001@spacehotline.com","ycm8gdr7NUY8cjb@bcb");
        Thread.sleep(3000);
        shopProductsPage=new ShopProductsPage(driver);
        shopProductsPage.get_silver_watches();
        Thread.sleep(6000);
    }
}
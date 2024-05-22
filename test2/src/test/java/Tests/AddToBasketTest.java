package Tests;

import Pages.*;
import org.testng.annotations.Test;

public class AddToBasketTest extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    AddToBasketPage addToBasketPage;

    @Test
    public void addToBasket() throws InterruptedException {
        homePage=new HomePage(driver);
        homePage.Open_login_page();
        Thread.sleep(3000);
        loginPage=new LoginPage(driver);
        loginPage.LogIn("amourakora2001@spacehotline.com","ycm8gdr7NUY8cjb@bcb");
        Thread.sleep(3000);
        homePage.Open_accessory_list();
        Thread.sleep(5000);
        addToBasketPage=new AddToBasketPage(driver);
        addToBasketPage.select_product();
        Thread.sleep(5000);
        addToBasketPage.AddToBasket();
        Thread.sleep(3000);
        addToBasketPage.openBasket();
        Thread.sleep(3000);
    }
}
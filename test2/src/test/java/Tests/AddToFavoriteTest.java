package Tests;

import Pages.*;
import org.testng.annotations.Test;

public class AddToFavoriteTest extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    AddToFavoritePage addToFavoritePage;
    ProfilePage profilePage;

    @Test
    public void addToFavorite() throws InterruptedException {
        homePage=new HomePage(driver);
        homePage.Open_login_page();
        Thread.sleep(3000);
        loginPage=new LoginPage(driver);
        loginPage.LogIn("amourakora2001@spacehotline.com","ycm8gdr7NUY8cjb@bcb");
        Thread.sleep(3000);
        homePage.Open_accessory_list();
        Thread.sleep(3000);
        addToFavoritePage=new AddToFavoritePage(driver);
        addToFavoritePage.AddToFavorite();
        Thread.sleep(3000);
        homePage.Open_profile();
        Thread.sleep(3000);
        profilePage=new ProfilePage(driver);
        profilePage.open_my_favorite_list();
        Thread.sleep(3000);
    }
}
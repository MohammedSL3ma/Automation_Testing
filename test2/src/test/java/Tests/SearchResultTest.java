package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SearchResultPage;
import org.testng.annotations.Test;

public class SearchResultTest extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    SearchResultPage searchResultPage;

    @Test
    public void TestSearch() throws InterruptedException {
        homePage=new HomePage(driver);
        homePage.Open_login_page();
        Thread.sleep(3000);
        loginPage=new LoginPage(driver);
        loginPage.LogIn("amourakora2001@spacehotline.com","ycm8gdr7NUY8cjb@bcb");
        Thread.sleep(3000);
        homePage.search("bags");
        Thread.sleep(3000);
        searchResultPage=new SearchResultPage(driver);
        searchResultPage.open_first_product();
        Thread.sleep(3000);
    }
}
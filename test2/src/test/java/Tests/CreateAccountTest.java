package Tests;

import Pages.CreateAccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    CreateAccountPage createAccountPage;

    @Test
    public void TestCreateAccount() throws InterruptedException {
        homePage=new HomePage(driver);
        homePage.Open_login_page();
        Thread.sleep(3000);
        loginPage=new LoginPage(driver);
        loginPage.Open_Create_Account_Page();
        Thread.sleep(3000);
        createAccountPage=new CreateAccountPage(driver);
        createAccountPage.add_data("Yazan Mohamed Salama", "ms58379+4@gmail.com", "01100889567", "zrXak?2GRM.6Z~Y");
        Thread.sleep(3000);
        createAccountPage.submit_data();
        Thread.sleep(3000);
        createAccountPage.add_code("2","2","2","2");
        Thread.sleep(3000);
    }
}
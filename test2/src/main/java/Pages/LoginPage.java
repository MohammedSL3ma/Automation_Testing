package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(linkText = "CREATE AN ACCOUNT")
    WebElement createAccount;
    @FindBy(id="username")
    WebElement email;
    @FindBy(id="password")
    WebElement password;

    // can't use class name because create account button also has the same class name
    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section/div/div[2]/form/button")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/button")
    WebElement closeSignInPopup;

    public void LogIn(String mail, String pass) {
        email.sendKeys(mail);
        password.sendKeys(pass);
        loginBtn.submit();
        closeSignInPopup.click();
    }

    public void Open_Create_Account_Page()
    {
        createAccount.click();
    }
}
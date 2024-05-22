package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateAccountPage extends PageBase{
    public CreateAccountPage(WebDriver driver)
    {
        super(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(id = "full-name")
    WebElement full_name;
    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "phone")
    WebElement phone;
    @FindBy(id = "password")
    WebElement password;

    // can't use class name because create account button also has the same class name
    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section/form/button")
    WebElement registerBtn;

    @FindBy(className = "dialog__body")
    WebElement dialog_body;

    @FindBy(xpath = "/html/body/div[1]/div/div/span[2]/div/div/div/div/div/div[2]/form/input[1]")
    WebElement code1;
    @FindBy(xpath = "/html/body/div[1]/div/div/span[2]/div/div/div/div/div/div[2]/form/input[2]")
    WebElement code2;
    @FindBy(xpath = "/html/body/div[1]/div/div/span[2]/div/div/div/div/div/div[2]/form/input[3]")
    WebElement code3;
    @FindBy(xpath = "/html/body/div[1]/div/div/span[2]/div/div/div/div/div/div[2]/form/input[4]")
    WebElement code4;

    public void add_data(String fullName, String mail, String phon, String pass)
    {
        full_name.sendKeys(fullName);
        email.sendKeys(mail);
        phone.sendKeys(phon);
        password.sendKeys(pass);
    }

    public void add_code(String c1, String c2, String c3, String c4)
    {
        wait.until(ExpectedConditions.visibilityOf(dialog_body));
        code1.sendKeys(c1);
        code2.sendKeys(c2);
        code3.sendKeys(c3);
        code4.sendKeys(c4);
    }
    public void submit_data()
    {
        registerBtn.submit();
    }
}

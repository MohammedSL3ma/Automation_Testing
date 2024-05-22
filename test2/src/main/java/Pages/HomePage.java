package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver)
    {
        super(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        act=new Actions(driver);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/header/div/div[2]/div[1]/div[3]/div/form/div/input")
    WebElement search;

    @FindBy(css = "svg.h-4.w-4.icon.sprite-icons")
    WebElement profile;

    @FindBy(css = "[data-attr = 'megaMenu__categories__accessories']")
    WebElement accessory_list;

    
    public void Open_login_page()
    {
        profile.click();
    }
    
    public void search(String value)
    {
        search.clear();
        search.sendKeys(value);
        search.submit();
    }

    public void Open_profile()
    {
        profile.click();
    }

    public void Open_accessory_list()
    {
        accessory_list.click();
    }
}
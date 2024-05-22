package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends PageBase{
    public ProfilePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/main/div/div[1]/nav/ul/li[2]/a")
    WebElement my_favorite_list;

    public void open_my_favorite_list()
    {
        my_favorite_list.click();
    }
}
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToFavoritePage extends PageBase{
    public AddToFavoritePage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/section/div[2]/div[2]/article[1]/div[2]/div[1]/button")
    WebElement favorite;

    public void AddToFavorite()
    {
        favorite.click();
    }
}

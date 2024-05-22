package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopProductsPage extends PageBase{
    public ShopProductsPage(WebDriver driver)
    {
        super(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        act=new Actions(driver);
    }
    @FindBy(css = "li[data-attr='megaMenu__categories__watches'] a")
    WebElement watches;

    @FindBy(linkText = "Silver Watches")
    WebElement silver_watches;

    public void get_silver_watches()
    {
        act.moveToElement(watches).perform();
        wait.until(ExpectedConditions.visibilityOf(silver_watches));
        silver_watches.click();
    }
}
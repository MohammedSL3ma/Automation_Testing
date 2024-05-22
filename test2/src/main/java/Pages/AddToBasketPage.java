package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToBasketPage extends PageBase{
    JavascriptExecutor js;

    public AddToBasketPage(WebDriver driver)
    {
        super(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        act=new Actions(driver);
        js = (JavascriptExecutor) driver;
    }
    @FindBy(xpath = "/html/body/div[1]/div/div/main/div/div/div/section/div[2]/div[2]/article[3]/div[1]/div/div/div/div/div[1]/a")
    WebElement product;

    @FindBy(xpath = "/html/body/div[1]/div/div/main/div/div/div[2]/div[2]/div[5]/div/div/div/div")
    WebElement add_to_basket;

    @FindBy(xpath = "//*[@id=\"app\"]/header/div/div[2]/div[1]/div[3]/a[2]")
    WebElement basketBtn;

    public void select_product()
    {
        product.click();
    }
    public void AddToBasket()
    {
        wait.until(ExpectedConditions.visibilityOf(add_to_basket));
        act.moveToElement(add_to_basket).perform();
        add_to_basket.click();
    }
    public void openBasket() throws InterruptedException {
        // top bar gets hidden when scrolling down, so we scroll up first
        js.executeScript("window.scrollTo(0, 0)");
        Thread.sleep(2000);
        basketBtn.click();
    }
}
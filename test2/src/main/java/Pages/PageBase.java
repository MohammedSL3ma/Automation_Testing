package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageBase {
    public Actions act;
    WebDriverWait wait;
    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
}

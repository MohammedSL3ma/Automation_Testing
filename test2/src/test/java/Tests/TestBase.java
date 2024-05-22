package Tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class TestBase {
    public static WebDriver driver;
    public static int counter = 0;
    @BeforeClass
    public void openUrl()
    {
//        // check if it's the first time to open the browser
//        if (counter == 0) {
//            driver = new ChromeDriver();
//        } else {
//            driver.switchTo().newWindow(WindowType.TAB);
//        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.parfoisegypt.com/en/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @AfterClass
    public void closeUrl()
    {
        driver.quit();
//        // increment the counter after each test
//        counter++;
    }
    @AfterMethod
    public void take_screenShot(ITestResult result) throws IOException {
        if(ITestResult.FAILURE == result.getStatus())
        {
            System.out.println("Failed!");
            System.out.println("Taking Screenshot...");
            TakesScreenshot sc=(TakesScreenshot) driver;
            File photo=sc.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(photo,new File("./screenshots/"+result.getName()+".png"));
        }
    }
}
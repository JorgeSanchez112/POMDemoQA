package TestComponents;

import org.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public WebDriver driver;
    public BasePage basePage;

    public WebDriver initializeDriver(){
            ChromeOptions options = new ChromeOptions();
            return driver = new ChromeDriver(options);
    }


    @BeforeTest
    public BasePage basePage(){
        driver = initializeDriver();
        basePage = new BasePage(driver);
        basePage.goTo();
        return basePage;
    }

    @AfterTest
    public void close(){
        driver.close();
    }

}

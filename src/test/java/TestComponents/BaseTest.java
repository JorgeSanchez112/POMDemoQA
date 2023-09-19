package TestComponents;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;
    protected ElementsPage elementsPage;
    protected FormsPage formsPage;
    protected AlertsFrameWindowsPage alertsFrameWindowsPage;
    protected WidgetsPage widgetsPage;
    protected InteractionsPage interactionsPage;
    protected BookStorePage bookStorePage;

    public WebDriver initializeDriver(){
        ChromeOptions options = new ChromeOptions();
        return driver = new ChromeDriver(options);
    }

    @BeforeTest
    public HomePage homePage(){
        driver = initializeDriver();
        homePage = new HomePage(driver);
        homePage.goTo();
        return homePage;
    }

    @AfterTest
    public void close(){
        driver.close();
    }

}

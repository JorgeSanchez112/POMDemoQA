package TestComponents;

import Pages.*;
import org.apache.hc.client5.http.utils.Base64;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    private ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();
    protected WebDriver driver;
    protected Properties prop;
    protected HomePage homePage;
    protected ElementsPage elementsPage;
    protected FormsPage formsPage;
    protected AlertsFrameWindowsPage alertsFrameWindowsPage;
    protected WidgetsPage widgetsPage;
    protected InteractionsPage interactionsPage;
    protected BookStorePage bookStorePage;
    protected TextBoxPage textBoxPage;
    protected CheckBoxPage checkBoxPage;
    protected RadioButtonPage radioButtonPage;
    protected WebTablesPage webTablesPage;
    protected ButtonsPage buttonsPage;
    protected LinksPage linksPage;
    protected BrokenLinksPage brokenLinksPage;
    protected UploadDownloadPage uploadDownloadPage;
    protected DynamicProperties dynamicProperties;
    protected PracticeFormPage practiceFormPage;
    protected BrowserWindows browserWindows;
    protected AlertsPage alertsPage;
    protected FramesPage framesPage;
    protected NestedFramesPage nestedFramesPage;
    protected ModalDialogsPage modalDialogsPage;
    protected AccordianPage accordianPage;
    protected AutoCompletePage autoCompletePage;
    protected DatePickerPage datePickerPage;
    protected SliderPage sliderPage;
    protected ProgressBarPage progressBarPage;
    protected TabsPage tabsPage;
    protected ToolTipsPage toolTipsPage;
    protected MenuPage menuPage;
    protected SelectMenuPage selectMenuPage;
    protected SortablePage sortablePage;
    protected SelectablePage selectablePage;
    protected ResizablePage resizablePage;
    protected DroppablePage droppablePage;
    protected DraggablePage draggablePage;
    protected BSLoginPage bsLoginPage;
    protected BSRegisterPage bsRegisterPage;
    protected BSProfilePage bsProfilePage;
    protected BSIBookPage bsiBookPage;
    protected BSAPIPage bsapiPage;

    public BaseTest() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\config\\config.properties");
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getScreenShot(WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] screenshotBytes = ts.getScreenshotAs(OutputType.BYTES);

        // Convert the byte array to Base64
        byte[] base64Bytes = Base64.encodeBase64(screenshotBytes);

        // Return the Base64 encoded string
        return "data:image/png;base64," + new String(base64Bytes);
    }

    public WebDriver initialization() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        options.merge(desiredCapabilities);

        WebDriver driver = new RemoteWebDriver(new URL(prop.getProperty("urlServer")), options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.get(prop.getProperty("url"));
        driver.manage().deleteAllCookies();

        webDriverThreadLocal.set(driver); // Set the driver in ThreadLocal

        return driver;
    }


    @BeforeMethod
    public void setUp() throws MalformedURLException {
        WebDriver driver = webDriverThreadLocal.get();
        if (driver == null) {
            webDriverThreadLocal.set(initialization());
        }
        driver = webDriverThreadLocal.get();
        System.out.println(driver);

        homePage = new HomePage(driver);

        System.out.println("Thread ID: " + Thread.currentThread().getId() + " Session ID: " + ((RemoteWebDriver) driver).getSessionId());
        try {
            homePage.waitForVisibleElement(driver.findElement(By.cssSelector(prop.getProperty("publicityLocator"))));
            homePage.hidePublicity(driver.findElement(By.cssSelector(prop.getProperty("publicityLocator"))));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown(){
        try {
            driver = webDriverThreadLocal.get();
            if (driver != null) {
                driver.quit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriverThreadLocal.remove();
        }
    }
}
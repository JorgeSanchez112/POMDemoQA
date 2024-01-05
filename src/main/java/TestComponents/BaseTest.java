package TestComponents;

import Pages.*;
import org.apache.hc.client5.http.utils.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

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
    protected UploadDownload uploadDownload;
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


    public WebDriver initializeDriver(){
        ChromeOptions options = new ChromeOptions();
        return driver = new ChromeDriver(options);
    }

    @BeforeMethod
    public void homePage(){
        driver = initializeDriver();
        homePage = new HomePage(driver);
        homePage.goTo();
        homePage.hidePublicity(driver.findElement(By.cssSelector("#adplus-anchor > div")));
    }

    @AfterMethod
    public void close(){
        driver.quit();
    }

}

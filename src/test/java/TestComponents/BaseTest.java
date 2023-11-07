package TestComponents;

import Pages.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

public class BaseTest {

    protected WebDriver driver;
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
    protected BrokenLinks brokenLinks;
    protected UploadDownload uploadDownload;
    protected DynamicProperties dynamicProperties;
    protected PracticeFormPage practiceFormPage;
    protected BrowserWindows browserWindows;
    protected Alerts alerts;
    protected FramesPage framesPage;
    protected NestedFramesPage nestedFramesPage;
    protected ModalDialogsPage modalDialogsPage;


    public WebDriver initializeDriver(){
        ChromeOptions options = new ChromeOptions();
        return driver = new ChromeDriver(options);
    }

    public String getScreenShot(String testCaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = (ts.getScreenshotAs(OutputType.FILE));

        String reportsDirectory = System.getProperty("user.dir") + "\\reports\\" ;
        File file = new File(reportsDirectory + testCaseName + ".png");
        FileUtils.copyFile(source, file);

        return reportsDirectory + testCaseName + ".png";
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

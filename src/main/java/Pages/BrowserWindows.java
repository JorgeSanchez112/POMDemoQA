package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserWindows extends BasePages {
    @FindBy(id = "tabButton")
    private WebElement newTabButton;
    @FindBy(id = "windowButton")
    private WebElement newWindowButton;
    @FindBy(id = "messageWindowButton")
    private WebElement newWindowMessageButton;
    @FindBy(id = "sampleHeading")
    private WebElement textTab;
    @FindBy(tagName = "body")
    private WebElement newMessageText;

    public BrowserWindows(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    final String URLOFNEWTAB = "https://demoqa.com/sample";


    public void clickOnNewTabButton(){
        waitForClick(newTabButton);
        newTabButton.click();
    }

    public void clickOnNewWindowButton(){
        newWindowButton.click();
    }

    public void clickOnNewWindowMessageButton(){
        scroll(newWindowMessageButton);
        newWindowMessageButton.click();
    }

    public void switchToTab(){
        String mainWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public boolean newTabTextIsVisible(){
       return textTab.isDisplayed();
    }

    public String getMessageOfNewWindow(){
        try {
            waitForVisibleElement(newMessageText);
            return newMessageText.getText();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public String getBrowserWindowsUrlText(){
        return driver.getCurrentUrl();
    }

    public String getUrlOfNewTabAndWindow(){
        return URLOFNEWTAB;
    }

}

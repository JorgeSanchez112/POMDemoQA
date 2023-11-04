package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;

public class BrowserWindows extends BasePages {
    @FindBy(id = "tabButton")
    WebElement newTabButton;
    @FindBy(id = "windowButton")
    WebElement newWindowButton;
    @FindBy(id = "messageWindowButton")
    WebElement newWindowMessageButton;

    @FindBy(id = "sampleHeading")
    WebElement textTab;

    @FindBy(tagName = "body")
    WebElement newMessageText;

    public BrowserWindows(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    final String urlOfNewTab = "https://demoqa.com/sample";
    final String textOfNewWindowMessage = "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.";

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

    public void switchToBasePage(){
        ArrayList<String> handle = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(handle.get(0));
    }

    public boolean newTabTextIsVisible(){
       return textTab.isDisplayed();
    }

    public void validateMessageOfNewWindow(){
        try {
            waitForElementMinute(newMessageText, 3);
            Assert.assertEquals(newMessageText.getText(),textOfNewWindowMessage);
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public String getUrlOfNewTabAndWindow(){
        return urlOfNewTab;
    }

}

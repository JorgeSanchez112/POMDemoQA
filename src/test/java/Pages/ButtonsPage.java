package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ButtonsPage extends BasePages {

    @FindBy (id = "doubleClickBtn")
    WebElement doubleClickBtn;

    @FindBy (id = "rightClickBtn")
    WebElement rightClickBtn;

    @FindBy (css = "div.mt-4:nth-child(3) > button")
    WebElement clickMe;

    @FindBy (id = "doubleClickMessage")
    WebElement doubleClickMessage;

    @FindBy (id = "rightClickMessage")
    WebElement rightClickMessage;

    @FindBy (id = "dynamicClickMessage")
    WebElement clickMeMessage;


    public ButtonsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnDoubleBtn(){
        doubleClick(doubleClickBtn);
    }

    public void clickOnRightBtn(){
        rightClick(rightClickBtn);
    }

    public void clickOnClickMe(){
        clickMe.click();
    }

    public String getDoubleClickMessage(){
        return doubleClickMessage.getText();
    }

    public String getRightClickMessage(){
        return rightClickMessage.getText();
    }

    public String getClickMeMessage(){
        return clickMeMessage.getText();
    }
}

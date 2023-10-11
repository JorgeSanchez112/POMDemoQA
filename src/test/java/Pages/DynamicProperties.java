package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class DynamicProperties extends BasePages {
    @FindBy (css = "div.col-md-6 > div > p")
    WebElement randomIdText;

    @FindBy(id = "enableAfter")
    WebElement willEnableButton;

    @FindBy(id = "colorChange")
    WebElement colorChangeButton;

    @FindBy(id = "visibleAfter")
    WebElement visibleAfterButton;

    public DynamicProperties(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public String getRandomIdText(){
        return randomIdText.getText();
    }

    public boolean buttonIsEnable(){
        waitForEnableElement(willEnableButton);
        return willEnableButton.isEnabled();
    }

    public String getButtonTextColor(){
        return colorChangeButton.getCssValue("color");
    }

    public boolean buttonIsVisible(){
        waitForVisibleElement(visibleAfterButton);
        return visibleAfterButton.isDisplayed();
    }
}

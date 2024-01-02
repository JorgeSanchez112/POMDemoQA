package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicProperties extends BasePages {
    @FindBy (css = "div.col-md-6 > div > p")
    private WebElement randomIdText;
    @FindBy(id = "enableAfter")
    private WebElement willEnableButton;
    @FindBy(id = "colorChange")
    private WebElement colorChangeButton;
    @FindBy(id = "visibleAfter")
    private WebElement visibleAfterButton;

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

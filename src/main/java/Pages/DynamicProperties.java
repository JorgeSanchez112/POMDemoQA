package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicProperties extends BasePages {
    @FindBy(className = "main-header")
    private WebElement pageTitle;
    @FindBy(css = "div.col-md-6 > div > p")
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

    public boolean isRandomIdVisible(){
        return randomIdText.isDisplayed();
    }

    public boolean isButtonEnable(){
        waitForEnableElement(willEnableButton);
        return willEnableButton.isEnabled();
    }

    public String getPageTitleText(){
        return pageTitle.getText();
    }

    public String getButtonTextColor(){
        waitForCSSRedElementRGBAColor(colorChangeButton);
        return colorChangeButton.getCssValue("color");
    }

    public boolean buttonIsVisible(){
        waitForVisibleElement(visibleAfterButton);
        return visibleAfterButton.isDisplayed();
    }

}

package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage extends BasePages {
    @FindBy (css = "label[for='yesRadio']")
    WebElement yesRadioButton;

    @FindBy (css = "label[for='impressiveRadio']")
    WebElement impressiveRadioButton;

    @FindBy (id = "noRadio")
    WebElement disabledRadioButton;

    @FindBy (css = "p.mt-3 >span")
    WebElement responseText;

    public RadioButtonPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnYesRB(){
        waitForClick(yesRadioButton);
        yesRadioButton.click();
    }

    public void clickOnImpressiveRB(){
        waitForClick(impressiveRadioButton);
        impressiveRadioButton.click();
    }

    public boolean radioButtonIsEnabled(){
        return disabledRadioButton.isEnabled();
    }

    public String response(){
        return responseText.getText();
    }
}

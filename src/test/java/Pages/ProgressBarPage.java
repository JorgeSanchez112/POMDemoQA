package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgressBarPage extends BasePages {

    @FindBy(id = "progressBar")
    WebElement progressBar;
    @FindBy(id = "startStopButton")
    WebElement startButton;
    @FindBy(id = "resetButton")
    WebElement resetButton;

    public ProgressBarPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnStartButton(){
        startButton.click();
    }

    public void clickOnResetButton(){
        resetButton.click();
    }

    public void waitForResetButton(){
        waitForVisibleElement(resetButton);
    }

    public String getPercentText(){
        return progressBar.getText();
    }
}

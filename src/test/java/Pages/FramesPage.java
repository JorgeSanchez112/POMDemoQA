package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage extends BasePages {
    @FindBy(id = "frame1")
    private WebElement bigFrame;
    @FindBy(id = "frame2")
    private WebElement shortFrame;
    @FindBy(id = "sampleHeading")
    private WebElement text;

    public FramesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    private final String textFrame = "This is a sample page";

    public void switchToDefaultContent(){
        driver.switchTo().defaultContent();
    }

    public void switchToBigFrame(){
        driver.switchTo().frame(bigFrame);
    }

    public void switchToShortFrame(){
        driver.switchTo().frame(shortFrame);
    }

    public boolean validateTextFrames(){
        return text.getText().contains(textFrame);
    }

}

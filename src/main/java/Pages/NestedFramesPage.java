package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NestedFramesPage extends BasePages {
    @FindBy(id = "frame1")
    private WebElement parentFrame;
    @FindBy(tagName = "body")
    private WebElement textParent;
    @FindBy(tagName = "p")
    private WebElement textChild;

    public NestedFramesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    private final String textParentFrame = "Parent frame";
    private final String textChildFrame = "Child Iframe";

    public void switchToDefaultContent(){
        driver.switchTo().defaultContent();
    }

    public void switchToParentFrame(){
        driver.switchTo().frame(parentFrame);
    }

    public void switchToChildFrame(){
        driver.switchTo().frame(0);
    }

    public boolean validateParentText(){
        return textParent.getText().contains(textParentFrame);
    }

    public boolean validateChildText(){
        return textChild.getText().equals(textChildFrame);
    }

}

package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BSProfilePage extends BasePages {
    @FindBy(className = "main-header")
    WebElement title;
    @FindBy(id = "notLoggin-label")
    WebElement doNotLoginMessage;

    public BSProfilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public boolean isTitleVisible(){
        return title.isDisplayed();
    }

    public boolean isMessageDoNotLoginShowed(){
        return doNotLoginMessage.isDisplayed();
    }

}

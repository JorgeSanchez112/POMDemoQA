package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MenuPage extends BasePages {
    @FindBy(className = "main-header")
    private WebElement pageTitle;
    @FindBy(css = "#nav > li > a")
    private List<WebElement> mainMenus;
    @FindBy(css = "a ~ ul > li > a")
    private List<WebElement> subMenus;

    public MenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void moveClickerToMainItem2(){
        moveClickerToElement(mainMenus.get(1));
    }

    public void moveClickerToSubSubList(){
        moveClickerToElement(subMenus.get(2));
    }

    public String getPageTitleText(){
        return pageTitle.getText();
    }

    public boolean isMainItem1Displayed(){
        return mainMenus.get(0).isDisplayed();
    }

    public boolean isMainItem2Displayed(){
        return mainMenus.get(1).isDisplayed();
    }

    public boolean isMainItem3Displayed(){
        return mainMenus.get(2).isDisplayed();
    }

    public boolean isSubItem1Displayed(){
        return subMenus.get(0).isDisplayed();
    }

    public boolean isSubItem2Displayed(){
        return subMenus.get(1).isDisplayed();
    }

    public boolean isSubSubListDisplayed(){
        return subMenus.get(2).isDisplayed();
    }

    public boolean isSubSubItem1Displayed(){
        return subMenus.get(3).isDisplayed();
    }

    public boolean isSubSubItem2Displayed(){
        return subMenus.get(4).isDisplayed();
    }

}

package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TabsPage extends BasePages {

    @FindBy(className = "mb-3")
    WebElement subTitle;
    @FindBy(id = "demo-tab-what")
    WebElement tabWhat;
    @FindBy(id = "demo-tabpane-what")
    WebElement paragraphOfWhat;
    @FindBy(id = "demo-tab-origin")
    WebElement tabOrigin;
    @FindBy(css = "#demo-tabpane-origin > p")
    List<WebElement> paragraphsOfOrigin;
    @FindBy(id = "demo-tab-use")
    WebElement tabUse;
    @FindBy(id = "demo-tabpane-use")
    WebElement paragraphOfUse;
    @FindBy(id = "demo-tab-more")
    WebElement tabMore;

    public TabsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public boolean isSubTitleDisplayed(){
        return subTitle.isDisplayed();
    }

    public void clickOnTabWhat(){
        tabWhat.click();
    }

    public void clickOnTabOrigin(){
        tabOrigin.click();
    }

    public void clickOnTabUse(){
        tabUse.click();
    }

    public String getParagraphOfWhatText(){
        return paragraphOfWhat.getText();
    }

    public String getFirstParagraphsOfOriginText(){
        return paragraphsOfOrigin.get(0).getText();
    }

    public String getSecondParagraphsOfOriginText(){
        return paragraphsOfOrigin.get(1).getText();
    }

    public String getParagraphOfUseText(){
        return paragraphOfUse.getText();
    }

    public boolean isMoreTabEnabled(){
        return tabMore.isEnabled();
    }
}

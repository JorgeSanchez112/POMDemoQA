package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TabsPage extends BasePages {
    @FindBy(className = "mb-3")
    private WebElement subTitle;
    @FindBy(id = "demo-tab-what")
    private WebElement tabWhat;
    @FindBy(id = "demo-tabpane-what")
    private WebElement paragraphOfWhat;
    @FindBy(id = "demo-tab-origin")
    private WebElement tabOrigin;
    @FindBy(css = "#demo-tabpane-origin > p")
    private List<WebElement> paragraphsOfOrigin;
    @FindBy(id = "demo-tab-use")
    private WebElement tabUse;
    @FindBy(id = "demo-tabpane-use")
    private WebElement paragraphOfUse;
    @FindBy(id = "demo-tab-more")
    private WebElement tabMore;

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

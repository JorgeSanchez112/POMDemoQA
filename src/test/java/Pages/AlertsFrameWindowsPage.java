package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AlertsFrameWindowsPage extends BasePages {
    @FindBy(css = ".collapse.show > .menu-list > *")
    List<WebElement> deployed_form_exercise;

    public AlertsFrameWindowsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public int getSizeSections(){
        return deployed_form_exercise.size();
    }
    public BrowserWindows clickOnBrowserWindows(){
        scroll(deployed_form_exercise.get(0));
        deployed_form_exercise.get(0).click();
        return new BrowserWindows(driver);
    }
    public Alerts clickOnAlerts(){
        scroll(deployed_form_exercise.get(1));
        deployed_form_exercise.get(1).click();
        return new Alerts(driver);
    }
    public void clickOnFrames(){
        deployed_form_exercise.get(2).click();
    }
    public void clickOnNestedFrames(){
        deployed_form_exercise.get(3).click();
    }
    public void clickOnModalDialogs(){
        deployed_form_exercise.get(4).click();
    }

}

package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePages {
    @FindBy (className = "top-card")
    private List<WebElement> sections;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getHomePageUrlText(){
        return driver.getCurrentUrl();
    }

    public ElementsPage clickOnSectionElements(){
        scroll(sections.get(0));
        clickWithWait(sections.get(0));
        return new ElementsPage(driver);
    }

    public FormsPage clickOnSectionForms(){
        scroll(sections.get(1));
        clickWithWait(sections.get(1));
        return new FormsPage(driver);
    }
    public AlertsFrameWindowsPage clickOnSectionAlerts_Frame_Windows(){
        scroll(sections.get(2));
        clickWithWait(sections.get(2));
        return new AlertsFrameWindowsPage(driver);
    }

    public WidgetsPage clickOnSectionWidgets(){
        scroll(sections.get(3));
        clickWithWait(sections.get(3));
        return new WidgetsPage(driver);
    }

    public InteractionsPage clickOnSectionInteractions(){
        try {
            scroll(sections.get(4));
            clickWithWait(sections.get(4));
            return new InteractionsPage(driver);
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return new InteractionsPage(driver);
    }

    public BookStorePage clickOnSectionBookStoreApplication(){
        scroll(sections.get(5));
        clickWithWait(sections.get(5));
        return new BookStorePage(driver);
    }

}

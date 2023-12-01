package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePages {
    @FindBy (className = "top-card")
    private List<WebElement> sections;

    public HomePage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        driver.get("https://demoqa.com/");
    }

    public ElementsPage clickOnSectionElements(){
        scroll(sections.get(0));
        sections.get(0).click();
        return new ElementsPage(driver);
    }

    public FormsPage clickOnSectionForms(){
        scroll(sections.get(1));
        sections.get(1).click();
        return new FormsPage(driver);
    }
    public AlertsFrameWindowsPage clickOnSectionAlerts_Frame_Windows(){
        scroll(sections.get(2));
        sections.get(2).click();
        return new AlertsFrameWindowsPage(driver);
    }

    public WidgetsPage clickOnSectionWidgets(){
        scroll(sections.get(3));
        sections.get(3).click();
        return new WidgetsPage(driver);
    }

    public InteractionsPage clickOnSectionInteractions(){
        scroll(sections.get(4));
        sections.get(4).click();
        return new InteractionsPage(driver);
    }

    public BookStorePage clickOnSectionBookStoreApplication(){
        scroll(sections.get(5));
        sections.get(5).click();
        return new BookStorePage(driver);
    }

}

package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WidgetsPage extends BasePages {
    @FindBy(css = ".collapse.show > .menu-list > *")
    List<WebElement> deployed_form_exercise;

    public WidgetsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public int getSizeSections(){
        return deployed_form_exercise.size();
    }

    public AccordianPage clickOnAccordian(){
        scroll(deployed_form_exercise.get(0));
        deployed_form_exercise.get(0).click();
        return new AccordianPage(driver);
    }

    public AutoCompletePage clickOnAutoComplete(){
        scroll(deployed_form_exercise.get(1));
        deployed_form_exercise.get(1).click();
        return new AutoCompletePage(driver);
    }

    public DatePickerPage clickOnDatePicker(){
        scroll(deployed_form_exercise.get(2));
        deployed_form_exercise.get(2).click();
        return new DatePickerPage(driver);
    }

    public SliderPage clickOnSlider(){
        scroll(deployed_form_exercise.get(3));
        deployed_form_exercise.get(3).click();
        return new SliderPage(driver);
    }

    public ProgressBarPage clickOnProgressBar(){
        scroll(deployed_form_exercise.get(4));
        deployed_form_exercise.get(4).click();
        return new ProgressBarPage(driver);
    }

    public TabsPage clickOnTabs(){
        scroll(deployed_form_exercise.get(5));
        deployed_form_exercise.get(5).click();
        return new TabsPage(driver);
    }

    public ToolTipsPage clickOnToolTips(){
        scroll(deployed_form_exercise.get(6));
        deployed_form_exercise.get(6).click();
        return new ToolTipsPage(driver);
    }

    public MenuPage clickOnMenu(){
        scroll(deployed_form_exercise.get(7));
        deployed_form_exercise.get(7).click();
        return new MenuPage(driver);
    }

    public SelectMenuPage clickOnSelectMenu(){
        scroll(deployed_form_exercise.get(8));
        deployed_form_exercise.get(8).click();
        return new SelectMenuPage(driver);
    }

}

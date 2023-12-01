package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FormsPage extends BasePages {
    @FindBy(css = ".collapse.show > .menu-list > *")
    private List<WebElement> deployed_form_exercise;

    public FormsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public int getSizeSections(){
        return deployed_form_exercise.size();
    }

    public PracticeFormPage clickOnPracticeFormSection(){
        deployed_form_exercise.get(0).click();
        return new PracticeFormPage(driver);
    }

}

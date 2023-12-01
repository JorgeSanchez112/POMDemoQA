package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BookStorePage extends BasePages {
    @FindBy(css = ".collapse.show > .menu-list > *")
    private List<WebElement> deployed_form_exercise;

    public BookStorePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public int getSizeSections(){
        return deployed_form_exercise.size();
    }

    public void clickOnLoginTab(){
        deployed_form_exercise.get(0).click();
    }

    public void clickOnBookstoreTab(){
        deployed_form_exercise.get(1).click();
    }

    public void clickOnProfile(){
        deployed_form_exercise.get(2).click();
    }

    public void clickOnBookstoreApi(){
        deployed_form_exercise.get(3).click();
    }

}

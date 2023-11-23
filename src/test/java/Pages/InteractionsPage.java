package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InteractionsPage extends BasePages {
    @FindBy(css = ".collapse.show > .menu-list > *")
    List<WebElement> deployed_form_exercise;

    public InteractionsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public int getSizeSections(){
        return deployed_form_exercise.size();
    }

    public SortablePage clickOnSortable(){
        scroll(deployed_form_exercise.get(0));
        deployed_form_exercise.get(0).click();
        return new SortablePage(driver);
    }

    public SelectablePage clickOnSelectable(){
        scroll(deployed_form_exercise.get(1));
        deployed_form_exercise.get(1).click();
        return new SelectablePage(driver);
    }

    public ResizablePage clickOnResizable(){
        scroll(deployed_form_exercise.get(2));
        deployed_form_exercise.get(2).click();
        return new ResizablePage(driver);
    }

    public void clickOnDroppable(){
        scroll(deployed_form_exercise.get(3));
    }

    public void clickOnDragabble(){
        scroll(deployed_form_exercise.get(4));
    }
}

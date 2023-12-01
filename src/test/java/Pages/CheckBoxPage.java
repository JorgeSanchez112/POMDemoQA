package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBoxPage extends BasePages {
    @FindBy(css = ".rct-option-expand-all")
    private WebElement expandTree;
    @FindBy(css = ".rct-node-expanded > ol > li > span > label")
    private List<WebElement> listOfCheckboxes;
    @FindBy(css = ".rct-node-expanded > ol > li > span > label > input")
    private List<WebElement> listMainCheckbox;

    public CheckBoxPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnExpandButton(){
        expandTree.click();
    }

    public void clickOnNotes(){
        waitForClick(listOfCheckboxes.get(1));
        listOfCheckboxes.get(1).click();
    }

    public void clickOnCommand(){
        waitForClick(listOfCheckboxes.get(2));
        listOfCheckboxes.get(2).click();
    }

    public void clickOnReact(){
        scroll(listOfCheckboxes.get(5));
        waitForClick(listOfCheckboxes.get(5));
        listOfCheckboxes.get(5).click();
    }

    public void clickOnAngular(){
        scroll(listOfCheckboxes.get(6));
        waitForClick(listOfCheckboxes.get(6));
        listOfCheckboxes.get(6).click();
    }

    public void clickOnVeu(){
        scroll(listOfCheckboxes.get(7));
        waitForClick(listOfCheckboxes.get(7));
        listOfCheckboxes.get(7).click();
    }

    public void clickOnPublic(){
        scroll(listOfCheckboxes.get(9));
        waitForClick(listOfCheckboxes.get(9));
        listOfCheckboxes.get(9).click();
    }

    public void clickOnPrivate(){
        scroll(listOfCheckboxes.get(10));
        waitForClick(listOfCheckboxes.get(10));
        listOfCheckboxes.get(10).click();
    }

    public void clickOnClassified(){
        scroll(listOfCheckboxes.get(11));
        waitForClick(listOfCheckboxes.get(11));
        listOfCheckboxes.get(11).click();
    }

    public void clickOnGeneral(){
        scroll(listOfCheckboxes.get(12));
        listOfCheckboxes.get(12).click();
    }

    public void clickOnWordFile(){
        scroll(listOfCheckboxes.get(14));
        waitForClick(listOfCheckboxes.get(14));
        listOfCheckboxes.get(14).click();
    }

    public void clickOnExcelFile(){
        scroll(listOfCheckboxes.get(15));
        waitForClick(listOfCheckboxes.get(15));
        listOfCheckboxes.get(15).click();
    }

    public boolean checkBoxDesktopIsClicked(){
       return listMainCheckbox.get(0).isSelected();
    }

    public boolean checkDocumentsClicked(){
        return listMainCheckbox.get(3).isSelected();
    }

    public boolean checkDownloadsClicked(){
        return listMainCheckbox.get(13).isSelected();
    }

}

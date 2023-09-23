package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBoxPage extends BasePages {

    @FindBy(css = ".rct-option-expand-all")
    WebElement expandTree;

    @FindBy(css = ".rct-node-expanded > ol > li")
    List<WebElement> listOfCheckboxes;

    @FindBy(css = ".rct-node-expanded > ol > li > span > label > input")
    List<WebElement> listMainCheckbox;

    @FindBy(css = "#tree-node > ol > li > ol > li:nth-child(1) > ol > li:nth-child(1) > span > label")
    WebElement notes;

    @FindBy(css = "#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > ol > li:nth-child(1) > span > label")
    WebElement react;

    @FindBy(css = "#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > ol > li:nth-child(3) > span > label")
    WebElement vue;

    public CheckBoxPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnExpandButton(){
        expandTree.click();
    }

    public void clickOnNotes(){
        waited(notes);
        notes.click();
    }

    public void clickOnCommand(){
        waited(listOfCheckboxes.get(2));
        listOfCheckboxes.get(2).click();
    }

    public void clickOnReact(){
        waited(react);
        react.click();
    }

    public void clickOnAngular(){
        waited(listOfCheckboxes.get(6));
        listOfCheckboxes.get(6).click();
    }

    public void clickOnVeu(){
        waited(vue);
        vue.click();
    }

    public void clickOnPublic(){
        scroll(listOfCheckboxes.get(9));
        waited(listOfCheckboxes.get(9));
        listOfCheckboxes.get(9).click();
    }

    public void clickOnPrivate(){
        scroll(listOfCheckboxes.get(10));
        waited(listOfCheckboxes.get(10));
        listOfCheckboxes.get(10).click();
    }

    public void clickOnClassified(){
        scroll(listOfCheckboxes.get(11));
        waited(listOfCheckboxes.get(11));
        listOfCheckboxes.get(11).click();
    }

    public void clickOnGeneral(){
        scroll(listOfCheckboxes.get(12));
        listOfCheckboxes.get(12).click();
    }

    public void clickOnWordFile(){
        scroll(listOfCheckboxes.get(14));
        waited(listOfCheckboxes.get(14));
        listOfCheckboxes.get(14).click();
    }

    public void clickOnExcelFile(){
        scroll(listOfCheckboxes.get(15));
        waited(listOfCheckboxes.get(15));
        listOfCheckboxes.get(15).click();
    }

    public boolean checkBoxDesktopIsClicked(){
       return listMainCheckbox.get(0).isSelected();
    }

    public boolean checkDocumentsClicked(){
        return listMainCheckbox.get(3).isSelected();
    }

    public boolean checkDownloadsClicked(){
        scroll(listMainCheckbox.get(13));
        return listMainCheckbox.get(13).isSelected();
    }


}

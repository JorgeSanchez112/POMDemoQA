package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBoxPage extends BasePages {
    @FindBy(className = "main-header")
    private WebElement pageTitle;
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
        clickWithWait(expandTree);
    }

    public void clickOnNotes(){
        scroll(listOfCheckboxes.get(1));
        clickWithWait(listOfCheckboxes.get(1));
    }

    public void clickOnCommand(){
        scroll(listOfCheckboxes.get(2));
        clickWithWait(listOfCheckboxes.get(2));
    }

    public void clickInDesktopElements(){
        clickOnNotes();
        clickOnCommand();
    }

    public void clickOnReact(){
        scroll(listOfCheckboxes.get(5));
        clickWithWait(listOfCheckboxes.get(5));
    }

    public void clickOnAngular(){
        scroll(listOfCheckboxes.get(6));
        clickWithWait(listOfCheckboxes.get(6));
    }

    public void clickOnVeu(){
        scroll(listOfCheckboxes.get(7));
        clickWithWait(listOfCheckboxes.get(7));
    }

    public void clickInWorkspaceElements(){
        clickOnReact();
        clickOnAngular();
        clickOnVeu();
    }

    public void clickOnPublic(){
        scroll(listOfCheckboxes.get(9));
        clickWithWait(listOfCheckboxes.get(9));
    }

    public void clickOnPrivate(){
        scroll(listOfCheckboxes.get(10));
        clickWithWait(listOfCheckboxes.get(10));
    }

    public void clickOnClassified(){
        scroll(listOfCheckboxes.get(11));
        clickWithWait(listOfCheckboxes.get(11));
    }

    public void clickOnGeneral(){
        scroll(listOfCheckboxes.get(12));
        clickWithWait(listOfCheckboxes.get(12));
    }

    public void clickInOfficeElements(){
        clickOnPublic();
        clickOnPrivate();
        clickOnClassified();
        clickOnGeneral();
    }

    public void clickOnWordFile(){
        scroll(listOfCheckboxes.get(14));
        clickWithWait(listOfCheckboxes.get(14));
    }

    public void clickOnExcelFile(){
        scroll(listOfCheckboxes.get(15));
        clickWithWait(listOfCheckboxes.get(15));
    }

    public void clickInDownloadElements(){
        clickOnWordFile();
        clickOnExcelFile();
    }

    public String getPageTitleText(){
        return pageTitle.getText();
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

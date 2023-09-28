package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ElementsPage extends BasePages {
    @FindBy (css = ".collapse.show > .menu-list > *")
    List<WebElement> deployed_element_exercises;

    public ElementsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public int deployedElementsSize(){
        return deployed_element_exercises.size();
    }

    public TextBoxPage clickOnTextBoxSection(){
        deployed_element_exercises.get(0).click();
        return new TextBoxPage(driver);
    }

    public CheckBoxPage clickOnCheckBoxSection(){
        deployed_element_exercises.get(1).click();
        return new CheckBoxPage(driver);
    }

    public RadioButtonPage clickOnRadioButtonSection(){
        deployed_element_exercises.get(2).click();
        return new RadioButtonPage(driver);
    }

    public WebTablesPage clickOnWebTablesSection(){
        scroll(deployed_element_exercises.get(3));
        deployed_element_exercises.get(3).click();
        return new WebTablesPage(driver);
    }

    public ButtonsPage clickOnButtonsSection(){
        scroll(deployed_element_exercises.get(4));
        deployed_element_exercises.get(4).click();
        return new ButtonsPage(driver);
    }

    public void clickOnLinksSection(){
        deployed_element_exercises.get(5).click();
    }

    public void clickOnBrokenLinksImageSection(){
        deployed_element_exercises.get(6).click();
    }

    public void clickOnUploadDownloadSection(){
        deployed_element_exercises.get(7).click();
    }

    public void clickOnDynamicPropertiesSection(){
        deployed_element_exercises.get(8).click();
    }

}

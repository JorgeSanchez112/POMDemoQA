package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectMenuPage extends BasePages {

    @FindBy(id = "withOptGroup")
    WebElement selectValueContainer;
    @FindBy(id = "react-select-2-input")
    WebElement selectValueInput;
    @FindBy(id = "selectOne")
    WebElement selectOneContainer;
    @FindBy(id = "react-select-3-input")
    WebElement selectOneInput;
    @FindBy(id = "oldSelectMenu")
    WebElement oldStyleSelectMenu;
    @FindBy(css = "#selectMenuContainer > .row:nth-child(7) > .col-sm-12 > .css-2b097c-container")
    WebElement multiSelectDropDownContainer;
    @FindBy(css = "#react-select-4-input")
    WebElement multiSelectDropDownInput;
    @FindBy(css = ".css-1rhbuit-multiValue > .css-12jo7m5")
    List<WebElement> multiSelectDropDownValues;
    @FindBy(id = "cars")
    WebElement standardMultiSelect;
    @FindBy(css = "#cars > option")
    List<WebElement> standardMultiSelectValues;

    public SelectMenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnSelectValueContainer(){
        selectValueContainer.click();
    }
    public void clickOnSelectOneContainer(){
        scroll(selectOneContainer);
        waitForClick(selectOneContainer);
        selectOneContainer.click();
    }

    public void clickOnMultiSelectDropdownContainer(){
        scroll(multiSelectDropDownContainer);
        waitForClick(multiSelectDropDownContainer);
        multiSelectDropDownContainer.click();
    }

    public void downOneOptionInSelectValueDropDown(){
       selectValueInput.sendKeys(Keys.DOWN);
    }

    public void downOneOptionInSelectOneDropDown(){
        selectOneInput.sendKeys(Keys.DOWN);
    }

    public void downOneOptionInMultiSelectDropDown(){
        multiSelectDropDownInput.sendKeys("Green");
    }

    public void enterActionInSelectValueDropDown(){
        selectValueInput.sendKeys(Keys.ENTER);
    }

    public void enterActionInSelectOneDropDown(){
        selectOneInput.sendKeys(Keys.ENTER);
    }

    public void enterActionInMultiSelectDropDown(){
        multiSelectDropDownInput.sendKeys(Keys.ENTER);
    }

    public void selectValueOnOldStyleSelectMenu(){
        Select select = new Select(oldStyleSelectMenu);
        select.selectByVisibleText("White");
    }

    public void scrollAndSelectValueOnStandardMultiSelect(String value){
        scroll(standardMultiSelect);
        Select select = new Select(standardMultiSelect);
        select.selectByVisibleText(value);
    }

    public String getSelectValueContainerText(){
        return selectValueContainer.getText();
    }

    public String getSelectOneContainerText() {
        return selectOneContainer.getText();
    }

    public String getSelectValueOnOldStyleSelectMenuText(){
        return oldStyleSelectMenu.getAttribute("value");
    }

    public String getGreenValueTextOfMultiplyDropdown(){
        return multiSelectDropDownValues.get(0).getText();
    }

    public String getBlueValueTextOfMultiplyDropdown(){
        return multiSelectDropDownValues.get(1).getText();
    }

    public String getBlackValueTextOfMultiplyDropdown(){
        return multiSelectDropDownValues.get(2).getText();
    }

    public String getRedValueTextOfMultiplyDropdown(){
        return multiSelectDropDownValues.get(3).getText();
    }

    public boolean isVolvoSelectedOfStandardMultiSelect(){
        return standardMultiSelectValues.get(0).isSelected();
    }

    public boolean isSaabSelectedOfStandardMultiSelect(){
        return standardMultiSelectValues.get(1).isSelected();
    }

    public boolean isOpelSelectedOfStandardMultiSelect(){
        return standardMultiSelectValues.get(2).isSelected();
    }

    public boolean isAudiSelectedOfStandardMultiSelect(){
        return standardMultiSelectValues.get(3).isSelected();
    }

}

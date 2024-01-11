package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SortablePage extends BasePages {
    @FindBy(className = "main-header")
    private WebElement pageTitle;
    @FindBy(id = "demo-tab-grid")
    private WebElement tabGrid;
    @FindBy(css = "#demo-tabpane-list >* .list-group-item-action")
    private List<WebElement> elementsList;
    @FindBy(css = "#demo-tabpane-grid >* .list-group-item-action")
    private List<WebElement> elementsGrid;

    public SortablePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnTabGrid(){
        clickWithWait(tabGrid);
    }

    public void moveFirstElementListToLastElement(){
        dragDropMoveElementToTarget(elementsList.get(0), elementsList.get(5));
    }

    public void moveSecondElementListToPenultimateElement(){
        dragDropMoveElementToTarget(elementsList.get(1), elementsList.get(4));
    }

    public void moveTheThirdElementListToTheSecondToLastElement(){
        dragDropMoveElementToTarget(elementsList.get(2), elementsList.get(3));
    }

    public void moveFirstElementGridToLastElement(){
        dragDropMoveElementToTarget(elementsGrid.get(0), elementsGrid.get(8));
    }

    public void moveFirstElementGridToFourthElement(){
        dragDropMoveElementToTarget(elementsGrid.get(0), elementsGrid.get(3));
    }

    public void moveFirstElementGridToFifthElement(){
        dragDropMoveElementToTarget(elementsGrid.get(0), elementsGrid.get(4));
    }

    public void moveFirstElementGridToSixthElement(){
        dragDropMoveElementToTarget(elementsGrid.get(0), elementsGrid.get(5));
    }

    public void moveSecondElementGridToPenultimateElement(){
        dragDropMoveElementToTarget(elementsGrid.get(1), elementsGrid.get(7));
    }

    public void moveTheThirdElementGridToTheSecondToLastElement(){
        dragDropMoveElementToTarget(elementsGrid.get(2), elementsGrid.get(6));
    }

    public void scrollToLastElementList(){
        scroll(elementsList.get(5));
    }

    public void scrollToLastElementGrid(){
        scroll(elementsGrid.get(8));
    }

    public String getPageTitleText(){
        return pageTitle.getText();
    }

    public String getTextOfFirstElementValueOfElementsList(){
        return elementsList.get(0).getText();
    }

    public String getTextOfSecondElementValueOfElementsList(){
        return elementsList.get(1).getText();
    }

    public String getTextOfThirdElementValueOfElementsList(){
        return elementsList.get(2).getText();
    }

    public String getTextOfFourthElementValueOfElementsList(){
        return elementsList.get(3).getText();
    }

    public String getTextOfFifthElementValueOfElementsList(){
        return elementsList.get(4).getText();
    }

    public String getTextOfSixthElementValueOfElementsList(){
        return elementsList.get(5).getText();
    }

    public String getTextOfFirstElementValueOfElementsGrid(){
        return elementsGrid.get(0).getText();
    }

    public String getTextOfSecondElementValueOfElementsGrid(){
        return elementsGrid.get(1).getText();
    }

    public String getTextOfThirdElementValueOfElementsGrid(){
        return elementsGrid.get(2).getText();
    }

    public String getTextOfFourthElementValueOfElementsGrid(){
        return elementsGrid.get(3).getText();
    }

    public String getTextOfFifthElementValueOfElementsGrid(){
        return elementsGrid.get(4).getText();
    }

    public String getTextOfSixthElementValueOfElementsGrid(){
        return elementsGrid.get(5).getText();
    }

    public String getTextOfSeventhElementValueOfElementsGrid(){
        return elementsGrid.get(6).getText();
    }

    public String getTextOfEighthElementValueOfElementsGrid(){
        return elementsGrid.get(7).getText();
    }

    public String getTextOfNinethElementValueOfElementsGrid(){
        return elementsGrid.get(8).getText();
    }

}

package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SortablePage extends BasePages {

    @FindBy(id = "demo-tab-list")
    WebElement tabList;
    @FindBy(id = "demo-tab-grid")
    WebElement tabGrid;
    @FindBy(css = "#demo-tabpane-list >* .list-group-item-action")
    List<WebElement> elementsList;
    @FindBy(css = "#demo-tabpane-grid >* .list-group-item-action")
    List<WebElement> elementsGrid;

    public SortablePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnTabGrid(){
        tabGrid.click();
    }
    public void clickOnTabList(){
        tabList.click();
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

    public void moveLastElementListToFirstElement(){
        dragDropMoveElementToTarget(elementsList.get(5), elementsList.get(0));
    }

    public void movePenultimateElementListToSecondElement(){
        dragDropMoveElementToTarget(elementsList.get(4), elementsList.get(1));
    }

    public void moveTheSecondToLastElementListToTheThirdElement(){
        dragDropMoveElementToTarget(elementsList.get(3), elementsList.get(2));
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

    public void moveLastElementGridToFirstElement(){
        dragDropMoveElementToTarget(elementsGrid.get(8), elementsGrid.get(0));
    }

    public void moveFourthElementGridToFirstElement(){
        dragDropMoveElementToTarget(elementsGrid.get(3), elementsGrid.get(0));
    }

    public void moveFifthElementGridToFirstElement(){
        dragDropMoveElementToTarget(elementsGrid.get(4), elementsGrid.get(0));
    }

    public void moveSixthElementGridToFirstElement(){
        dragDropMoveElementToTarget(elementsGrid.get(5), elementsGrid.get(0));
    }

    public void movePenultimateElementGridToSecondElement(){
        dragDropMoveElementToTarget(elementsGrid.get(7), elementsGrid.get(1));
    }

    public void moveTheSecondToLastElementGridToTheThirdElement(){
        dragDropMoveElementToTarget(elementsGrid.get(6), elementsGrid.get(2));
    }

    public void scrollToLastElementList(){
        scroll(elementsList.get(5));
    }

    public void scrollToLastElementGrid(){
        scroll(elementsGrid.get(8));
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

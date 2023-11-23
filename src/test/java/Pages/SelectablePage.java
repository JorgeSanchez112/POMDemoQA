package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SelectablePage extends BasePages {
    @FindBy(id = "demo-tab-list")
    WebElement tabList;
    @FindBy(id = "demo-tab-grid")
    WebElement tabGrid;
    @FindBy(css = ".mt-2.list-group-item")
    List<WebElement> elementsList;
    @FindBy(css = "#gridContainer >* li.list-group-item")
    List<WebElement> elementsGrid;

    public SelectablePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnTabList(){
        tabList.click();
    }

    public void clickOnTabGrid(){
        tabGrid.click();
    }

    public void clickOnCrasJustoOdioListElement(){
        scroll(elementsList.get(0));
        elementsList.get(0).click();
    }

    public void clickOnDapibusAcFacilisisInListElement(){
        scroll(elementsList.get(1));
        elementsList.get(1).click();
    }

    public void clickOnMorbiLeoRisusListElement(){
        scroll(elementsList.get(2));
        elementsList.get(2).click();
    }

    public void clickOnPortaAcConsecteturAcListElement(){
        scroll(elementsList.get(3));
        elementsList.get(3).click();
    }

    public void clickOnOneGridElement(){
        elementsGrid.get(0).click();
    }

    public void clickOnTwoGridElement(){
        elementsGrid.get(1).click();
    }

    public void clickOnThreeGridElement(){
        elementsGrid.get(2).click();
    }

    public void clickOnFourGridElement(){
        elementsGrid.get(3).click();
    }

    public void clickOnFiveGridElement(){
        elementsGrid.get(4).click();
    }

    public void clickOnSixGridElement(){
        elementsGrid.get(5).click();
    }

    public void clickOnSevenGridElement(){
        elementsGrid.get(6).click();
    }

    public void clickOnEightGridElement(){
        elementsGrid.get(7).click();
    }

    public void clickOnNineGridElement(){
        elementsGrid.get(8).click();
    }

    public boolean isCrasJustoOdioListElementSelected(){
        return isListItemSelected(elementsList.get(0));
    }

    public boolean isDapibusAcFacilisisInListElementSelected(){
        return isListItemSelected(elementsList.get(1));
    }

    public boolean isMorbiLeoRisusListElementSelected(){
        return isListItemSelected(elementsList.get(2));
    }

    public boolean isPortaAcConsecteturAcListElementSelected(){
        return isListItemSelected(elementsList.get(3));
    }

    public boolean isOneGridElementSelected(){
        return isListItemSelected(elementsGrid.get(0));
    }

    public boolean isTwoGridElementSelected(){
        return isListItemSelected(elementsGrid.get(1));
    }

    public boolean isThreeGridElementSelected(){
        return isListItemSelected(elementsGrid.get(2));
    }

    public boolean isFourGridElementSelected(){
        return isListItemSelected(elementsGrid.get(3));
    }

    public boolean isFiveGridElementSelected(){
        return isListItemSelected(elementsGrid.get(4));
    }

    public boolean isSixGridElementSelected(){
        return isListItemSelected(elementsGrid.get(5));
    }

    public boolean isSevenGridElementSelected(){
        return isListItemSelected(elementsGrid.get(6));
    }

    public boolean isEightGridElementSelected(){
        return isListItemSelected(elementsGrid.get(7));
    }

    public boolean isNineGridElementSelected(){
        return isListItemSelected(elementsGrid.get(8));
    }

}

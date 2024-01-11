package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SelectablePage extends BasePages {
    @FindBy(className = "main-header")
    private WebElement pageTitle;
    @FindBy(id = "demo-tab-grid")
    private WebElement tabGrid;
    @FindBy(css = ".mt-2.list-group-item")
    private List<WebElement> elementsList;
    @FindBy(css = "#gridContainer >* li.list-group-item")
    private List<WebElement> elementsGrid;

    public SelectablePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnTabGrid(){
        clickWithWait(tabGrid);
    }

    public void clickOnCrasJustoOdioListElement(){
        scroll(elementsList.get(0));
        clickWithWait(elementsList.get(0));
    }

    public void clickOnDapibusAcFacilisisInListElement(){
        scroll(elementsList.get(1));
        clickWithWait(elementsList.get(1));
    }

    public void clickOnMorbiLeoRisusListElement(){
        scroll(elementsList.get(2));
        clickWithWait(elementsList.get(2));
    }

    public void clickOnPortaAcConsecteturAcListElement(){
        scroll(elementsList.get(3));
        clickWithWait(elementsList.get(3));
    }

    public void clickOnOneGridElement(){
        scroll(elementsGrid.get(0));
        clickWithWait(elementsGrid.get(0));
    }

    public void clickOnTwoGridElement(){
        scroll(elementsGrid.get(1));
        clickWithWait(elementsGrid.get(1));
    }

    public void clickOnThreeGridElement(){
        scroll(elementsGrid.get(2));
        clickWithWait(elementsGrid.get(2));
    }

    public void clickOnFourGridElement(){
        scroll(elementsGrid.get(3));
        clickWithWait(elementsGrid.get(3));
    }

    public void clickOnFiveGridElement(){
        scroll(elementsGrid.get(4));
        clickWithWait(elementsGrid.get(4));
    }

    public void clickOnSixGridElement(){
        scroll(elementsGrid.get(5));
        clickWithWait(elementsGrid.get(5));
    }

    public void clickOnSevenGridElement(){
        scroll(elementsGrid.get(6));
        clickWithWait(elementsGrid.get(6));
    }

    public void clickOnEightGridElement(){
        scroll(elementsGrid.get(7));
        clickWithWait(elementsGrid.get(7));
    }

    public void clickOnNineGridElement(){
        scroll(elementsGrid.get(8));
        clickWithWait(elementsGrid.get(8));
    }

    public String getPageTitleText(){
        return pageTitle.getText();
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

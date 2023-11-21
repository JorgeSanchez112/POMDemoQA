package org.Tests;

import TestComponents.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SortableTest extends BaseTest {
    @BeforeClass
    public void initializeClassAndHidePublicity(){
        sortablePage = homePage.clickOnSectionInteractions().clickOnSortable();
        sortablePage.hidePublicity(driver.findElement(By.cssSelector("#adplus-anchor > div")));
    }

    @Test
    public void dragFirstElementAndDropItInLastElementOfElementLists() {
        sortablePage.scrollToLastElementList();
        sortablePage.moveFirstElementListToLastElement();
        Assert.assertEquals(sortablePage.getTextOfFirstElementValueOfElementsList(), "Two");
        Assert.assertEquals(sortablePage.getTextOfSixthElementValueOfElementsList(), "One");
        sortablePage.moveLastElementListToFirstElement();
    }

    @Test
    public void dragSecondElementAndDropItInPenultimateElementOfElementLists() {
        sortablePage.clickOnTabList();
        sortablePage.scrollToLastElementList();
        sortablePage.moveSecondElementListToPenultimateElement();
        Assert.assertEquals(sortablePage.getTextOfSecondElementValueOfElementsList(), "Three");
        Assert.assertEquals(sortablePage.getTextOfFifthElementValueOfElementsList(), "Two");
        sortablePage.movePenultimateElementListToSecondElement();
    }

    @Test
    public void dragThirdElementAndDropItInTheSecondToLastElementOfElementLists() {
        sortablePage.clickOnTabList();
        sortablePage.scrollToLastElementList();
        sortablePage.moveTheThirdElementListToTheSecondToLastElement();
        Assert.assertEquals(sortablePage.getTextOfThirdElementValueOfElementsList(), "Four");
        Assert.assertEquals(sortablePage.getTextOfFourthElementValueOfElementsList(), "Three");
        sortablePage.moveTheSecondToLastElementListToTheThirdElement();
    }

    @Test
    public void dragFirstElementAndDropItInLastElementOfElementsGrid() {
        sortablePage.clickOnTabGrid();
        sortablePage.scrollToLastElementGrid();
        sortablePage.moveFirstElementGridToLastElement();
        Assert.assertEquals(sortablePage.getTextOfFirstElementValueOfElementsGrid(), "Two");
        Assert.assertEquals(sortablePage.getTextOfNinethElementValueOfElementsGrid(), "One");
        sortablePage.moveLastElementGridToFirstElement();
    }

    @Test
    public void dragSecondElementAndDropItInPenultimateElementOfElementsGrid() {
        sortablePage.clickOnTabGrid();
        sortablePage.scrollToLastElementGrid();
        sortablePage.moveSecondElementGridToPenultimateElement();
        Assert.assertEquals(sortablePage.getTextOfSecondElementValueOfElementsGrid(), "Three");
        Assert.assertEquals(sortablePage.getTextOfEighthElementValueOfElementsGrid(), "Two");
        sortablePage.movePenultimateElementGridToSecondElement();
    }

    @Test
    public void dragThirdElementAndDropItInTheSecondToLastElementOfElementsGrid() {
        sortablePage.clickOnTabGrid();
        sortablePage.scrollToLastElementGrid();
        sortablePage.moveTheThirdElementGridToTheSecondToLastElement();
        Assert.assertEquals(sortablePage.getTextOfThirdElementValueOfElementsGrid(), "Four");
        Assert.assertEquals(sortablePage.getTextOfSeventhElementValueOfElementsGrid(), "Three");
        sortablePage.moveTheSecondToLastElementGridToTheThirdElement();
    }
}

package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SortablePageTest extends TestBase {
    @BeforeMethod
    public void initializeClassAndHidePublicity(){
        sortablePage = homePage.clickOnSectionInteractions().clickOnSortable();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(sortablePage.getPageTitleText(),"Sortable");
    }

    @Test
    public void dragFirstElementAndDropItInLastElementOfElementLists() {
        sortablePage.scrollToLastElementList();
        sortablePage.moveFirstElementListToLastElement();
        Assert.assertEquals(sortablePage.getTextOfFirstElementValueOfElementsList(), "Two");
        Assert.assertEquals(sortablePage.getTextOfSixthElementValueOfElementsList(), "One");
    }

    @Test
    public void dragSecondElementAndDropItInPenultimateElementOfElementLists() {
        sortablePage.scrollToLastElementList();
        sortablePage.moveSecondElementListToPenultimateElement();
        Assert.assertEquals(sortablePage.getTextOfSecondElementValueOfElementsList(), "Three");
        Assert.assertEquals(sortablePage.getTextOfFifthElementValueOfElementsList(), "Two");
    }

    @Test
    public void dragThirdElementAndDropItInTheSecondToLastElementOfElementLists() {
        sortablePage.scrollToLastElementList();
        sortablePage.moveTheThirdElementListToTheSecondToLastElement();
        Assert.assertEquals(sortablePage.getTextOfThirdElementValueOfElementsList(), "Four");
        Assert.assertEquals(sortablePage.getTextOfFourthElementValueOfElementsList(), "Three");
    }

    @Test
    public void dragFirstElementAndDropItInLastElementOfElementsGrid() {
        sortablePage.clickOnTabGrid();
        sortablePage.scrollToLastElementGrid();
        sortablePage.moveFirstElementGridToLastElement();
        Assert.assertEquals(sortablePage.getTextOfFirstElementValueOfElementsGrid(), "Two");
        Assert.assertEquals(sortablePage.getTextOfNinethElementValueOfElementsGrid(), "One");
    }

    @Test
    public void dragSecondElementAndDropItInPenultimateElementOfElementsGrid() {
        sortablePage.clickOnTabGrid();
        sortablePage.scrollToLastElementGrid();
        sortablePage.moveSecondElementGridToPenultimateElement();
        Assert.assertEquals(sortablePage.getTextOfSecondElementValueOfElementsGrid(), "Three");
        Assert.assertEquals(sortablePage.getTextOfEighthElementValueOfElementsGrid(), "Two");
    }

    @Test
    public void dragThirdElementAndDropItInTheSecondToLastElementOfElementsGrid() {
        sortablePage.clickOnTabGrid();
        sortablePage.scrollToLastElementGrid();
        sortablePage.moveTheThirdElementGridToTheSecondToLastElement();
        Assert.assertEquals(sortablePage.getTextOfThirdElementValueOfElementsGrid(), "Four");
        Assert.assertEquals(sortablePage.getTextOfSeventhElementValueOfElementsGrid(), "Three");
    }

    @Test
    public void dragFirstElementAndDropItInFourthElementOfElementsGrid() {
        sortablePage.clickOnTabGrid();
        sortablePage.scrollToLastElementGrid();
        sortablePage.moveFirstElementGridToFourthElement();
        Assert.assertEquals(sortablePage.getTextOfFirstElementValueOfElementsGrid(), "Two");
        Assert.assertEquals(sortablePage.getTextOfFourthElementValueOfElementsGrid(), "One");
    }

    @Test
    public void dragFirstElementAndDropItInFifthElementOfElementsGrid() {
        sortablePage.clickOnTabGrid();
        sortablePage.scrollToLastElementGrid();
        sortablePage.moveFirstElementGridToFifthElement();
        Assert.assertEquals(sortablePage.getTextOfFirstElementValueOfElementsGrid(), "Two");
        Assert.assertEquals(sortablePage.getTextOfFifthElementValueOfElementsGrid(), "One");
    }

    @Test
    public void dragFirstElementAndDropItInSixthElementOfElementsGrid() {
        sortablePage.clickOnTabGrid();
        sortablePage.scrollToLastElementGrid();
        sortablePage.moveFirstElementGridToSixthElement();
        Assert.assertEquals(sortablePage.getTextOfFirstElementValueOfElementsGrid(), "Two");
        Assert.assertEquals(sortablePage.getTextOfSixthElementValueOfElementsGrid(), "One");
    }
}

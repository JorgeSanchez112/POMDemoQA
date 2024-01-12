package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DraggablePageTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        draggablePage = homePage.clickOnSectionInteractions().clickOnDragabble();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(draggablePage.getPageTitleText(),"Dragabble");
    }

    @Test
    public void validateSimpleTabIsVisible(){
        Assert.assertTrue(draggablePage.isSimpleTabVisible());
    }

    @Test
    public void validateAxisTabIsVisible(){
        Assert.assertTrue(draggablePage.isAxisTabVisible());
    }

    @Test
    public void validateContainerIsVisible(){
        Assert.assertTrue(draggablePage.isContainerTabVisible());
    }

    @Test
    public void validateCursorTabIsVisible(){
        Assert.assertTrue(draggablePage.isCursorTabVisible());
    }

    @Test
    public void isElementOfTabSimpleDroppedToCoordinates(){
        draggablePage.moveSimpleElement();
        Assert.assertEquals(draggablePage.getSimpleBoxXPosition(), "10" + prop.getProperty("pxMeasurer"));
        Assert.assertEquals(draggablePage.getSimpleBoxYPosition(), "10" + prop.getProperty("pxMeasurer"));
    }

    @Test
    public void isElementXOfTabAxisDroppedToCoordinates(){
        draggablePage.clickOnTabAxisRestricted();
        draggablePage.moveXElement();
        Assert.assertEquals(draggablePage.getRestrictedXBoxPosition(), "50" + prop.getProperty("pxMeasurer"));
    }

    @Test
    public void isElementYOfTabAxisDroppedToCoordinates(){
        draggablePage.clickOnTabAxisRestricted();
        draggablePage.moveYElement();
        Assert.assertEquals(draggablePage.getRestrictedYBoxPosition(), "50" + prop.getProperty("pxMeasurer"));
    }

    @Test
    public void isElementContainedInBoxDroppedToCoordinates(){
        draggablePage.clickOnTabContainerRestricted();
        draggablePage.moveContainedBox();
        Assert.assertEquals(draggablePage.getContainedBoxXPosition(), "100" + prop.getProperty("pxMeasurer"));
        Assert.assertEquals(draggablePage.getContainedBoxYPosition(), "50" + prop.getProperty("pxMeasurer"));
    }

    @Test
    public void isTextContainedInBoxDroppedToCoordinates(){
        draggablePage.clickOnTabContainerRestricted();
        draggablePage.moveContainedText();
        Assert.assertEquals(draggablePage.getContainedTextXPosition(), "2" + prop.getProperty("pxMeasurer"));
        Assert.assertEquals(draggablePage.getContainedTextYPosition(), "10" + prop.getProperty("pxMeasurer"));
    }

    @Test
    public void isCenterCursorElementDroppedToCoordinates(){
        draggablePage.clickOnTabCursorStyle();
        draggablePage.moveCenterCursorOfCursorStyle();
        Assert.assertEquals(draggablePage.getElementOfCenterCursorXPosition(), "43.0156" + prop.getProperty("pxMeasurer"));
        Assert.assertEquals(draggablePage.getElementOfCenterCursorYPosition(), "44" + prop.getProperty("pxMeasurer"));
    }

    @Test
    public void isTopCursorElementDroppedToCoordinates(){
        draggablePage.clickOnTabCursorStyle();
        draggablePage.moveTopCursorOfCursorStyle();
        Assert.assertEquals(draggablePage.getElementOfTopCursorXPosition(), "154.016" + prop.getProperty("pxMeasurer"));
        Assert.assertEquals(draggablePage.getElementOfTopCursorYPosition(), "105" + prop.getProperty("pxMeasurer"));
    }

    @Test
    public void isBottomCursorElementDroppedToCoordinates(){
        draggablePage.clickOnTabCursorStyle();
        draggablePage.moveBottomCursorOfCursorStyle();
        Assert.assertEquals(draggablePage.getElementOfBottomCursorXPosition(), "150" + prop.getProperty("pxMeasurer"));
        Assert.assertEquals(draggablePage.getElementOfBottomCursorYPosition(), "0" + prop.getProperty("pxMeasurer"));
    }
}

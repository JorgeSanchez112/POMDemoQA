package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DraggableTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        draggablePage = homePage.clickOnSectionInteractions().clickOnDragabble();
    }

    final private String measurer = "px";

    @Test
    public void isElementOfTabSimpleDroppedToCoordinates(){
        draggablePage.clickOnTabSimple();
        draggablePage.moveSimpleElement();
        Assert.assertEquals(draggablePage.getSimpleBoxXPosition(), "10" + measurer);
        Assert.assertEquals(draggablePage.getSimpleBoxYPosition(), "10" + measurer);
    }

    @Test
    public void isElementXOfTabAxisDroppedToCoordinates(){
        draggablePage.clickOnTabAxisRestricted();
        draggablePage.moveXElement();
        Assert.assertEquals(draggablePage.getRestrictedXBoxPosition(), "50" + measurer);
    }

    @Test
    public void isElementYOfTabAxisDroppedToCoordinates(){
        draggablePage.clickOnTabAxisRestricted();
        draggablePage.moveYElement();
        Assert.assertEquals(draggablePage.getRestrictedYBoxPosition(), "50" + measurer);
    }

    @Test
    public void isElementContainedInBoxDroppedToCoordinates(){
        draggablePage.clickOnTabContainerRestricted();
        draggablePage.moveContainedBox();
        Assert.assertEquals(draggablePage.getContainedBoxXPosition(), "100" + measurer);
        Assert.assertEquals(draggablePage.getContainedBoxYPosition(), "50" + measurer);
    }

    @Test
    public void isTextContainedInBoxDroppedToCoordinates(){
        draggablePage.clickOnTabContainerRestricted();
        draggablePage.moveContainedText();
        Assert.assertEquals(draggablePage.getContainedTextXPosition(), "2" + measurer);
        Assert.assertEquals(draggablePage.getContainedTextYPosition(), "10" + measurer);
    }

    @Test
    public void isCenterCursorElementDroppedToCoordinates(){
        draggablePage.clickOnTabCursorStyle();
        draggablePage.moveCenterCursorOfCursorStyle();
        Assert.assertEquals(draggablePage.getElementOfCenterCursorXPosition(), "43.6719" + measurer);
        Assert.assertEquals(draggablePage.getElementOfCenterCursorYPosition(), "44" + measurer);
    }

    @Test
    public void isTopCursorElementDroppedToCoordinates(){
        draggablePage.clickOnTabCursorStyle();
        draggablePage.moveTopCursorOfCursorStyle();
        Assert.assertEquals(draggablePage.getElementOfTopCursorXPosition(), "154.672" + measurer);
        Assert.assertEquals(draggablePage.getElementOfTopCursorYPosition(), "105" + measurer);
    }

    @Test
    public void isBottomCursorElementDroppedToCoordinates(){
        draggablePage.clickOnTabCursorStyle();
        draggablePage.moveBottomCursorOfCursorStyle();
        Assert.assertEquals(draggablePage.getElementOfBottomCursorXPosition(), "150" + measurer);
        Assert.assertEquals(draggablePage.getElementOfBottomCursorYPosition(), "0" + measurer);
    }
}

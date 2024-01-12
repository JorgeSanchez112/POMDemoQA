package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DroppablePageTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        droppablePage = homePage.clickOnSectionInteractions().clickOnDroppable();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(droppablePage.getPageTitleText(),"Droppable");
    }

    @Test
    public void validateSimpleTabIsVisible(){
        Assert.assertTrue(droppablePage.isSimpleTabVisible());
    }

    @Test
    public void validateAcceptTabIsVisible(){
        Assert.assertTrue(droppablePage.isAcceptTabVisible());
    }

    @Test
    public void validatePreventTabIsVisible(){
        Assert.assertTrue(droppablePage.isPreventTabVisible());
    }

    @Test
    public void validateRevertTabIsVisible(){
        Assert.assertTrue(droppablePage.isRevertTabVisible());
    }

    @Test
    public void isSimpleDraggableDroppedToTarget(){
        droppablePage.moveSimpleDraggableToTarget();
        Assert.assertTrue(droppablePage.isSimpleDraggableDropped());
    }

    @Test
    public void isAcceptableDraggableDroppedToTarget(){
        droppablePage.clickOnTabAccept();
        droppablePage.moveDraggableAcceptableToTarget();
        Assert.assertTrue(droppablePage.isAcceptDraggableDropped());
    }

    @Test
    public void isNotAcceptableDraggableDroppedToTarget(){
        droppablePage.clickOnTabAccept();
        droppablePage.moveDraggableNotAcceptableToTarget();
        Assert.assertFalse(droppablePage.isNotAcceptDraggableDropped());
    }

    @Test
    public void isPreventDraggableDroppedToNotGreedyTarget(){
        droppablePage.clickOnTabPrevent();
        droppablePage.movePreventDraggableToNotGreedyTarget();
        Assert.assertTrue(droppablePage.isPreventDraggableToNotGreedyDropped());
    }

    @Test
    public void isPreventDraggableDroppedToNotGreedyInnerTarget(){
        droppablePage.clickOnTabPrevent();
        droppablePage.movePreventDraggableToNotGreedyInnerTarget();
        Assert.assertTrue(droppablePage.isPreventDraggableToNotGreedyInnerDropped());
    }

    @Test
    public void isPreventDraggableDroppedToGreedyTarget(){
        droppablePage.clickOnTabPrevent();
        droppablePage.movePreventDraggableToGreedyTarget();
        Assert.assertTrue(droppablePage.isPreventDraggableToGreedyDropped());
    }

    @Test
    public void isPreventDraggableDroppedToGreedyInnerTarget(){
        droppablePage.clickOnTabPrevent();
        droppablePage.movePreventDraggableToGreedyInnerTarget();
        Assert.assertTrue(droppablePage.isPreventDraggableToGreedyInnerDropped());
    }

    @Test
    public void isRevertDraggableDroppedToTarget(){
        droppablePage.clickOnTabRevert();
        droppablePage.moveRevertDraggableToTarget();
        Assert.assertTrue(droppablePage.isNotRevertDraggableDropped());
    }

    @Test
    public void isNoRevertDraggableDroppedToTarget(){
        droppablePage.clickOnTabRevert();
        droppablePage.moveNoRevertDraggableToTarget();
        Assert.assertTrue(droppablePage.isNotRevertDraggableDropped());
    }
}

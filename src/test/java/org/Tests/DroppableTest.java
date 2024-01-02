package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DroppableTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        droppablePage = homePage.clickOnSectionInteractions().clickOnDroppable();
    }

    @Test
    public void isSimpleDraggableDroppedToTarget(){
        droppablePage.clickOnTabSimple();
        droppablePage.moveSimpleDraggableToTarget();
        Assert.assertTrue(droppablePage.isSimpleDraggableDropped());
    }

    @Test
    public void isDraggableAcceptableDroppedToTarget(){
        droppablePage.clickOnTabAccept();
        droppablePage.moveDraggableAcceptableToTarget();
        Assert.assertTrue(droppablePage.isAcceptDraggableDropped());
    }

    @Test
    public void isDraggableNotAcceptableDroppedToTarget(){
        droppablePage.refreshPage();
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

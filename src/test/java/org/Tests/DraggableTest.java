package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DraggableTest extends BaseTest {
    @BeforeClass
    public void initializeClass(){
        draggablePage = homePage.clickOnSectionInteractions().clickOnDragabble();
    }

    @Test
    public void isElementOfTabSimpleDroppedToCoordinates(){
        draggablePage.moveSimpleElement();
        Assert.assertEquals(draggablePage.getSimpleBoxXPosition(), "10px");
        Assert.assertEquals(draggablePage.getSimpleBoxYPosition(), "10px");
    }
}

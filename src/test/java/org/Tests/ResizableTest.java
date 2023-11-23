package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ResizableTest extends BaseTest {
    @BeforeClass
    public void initializeClass(){
        resizablePage = homePage.clickOnSectionInteractions().clickOnResizable();
    }

    @Test
    public void isResizableRestrictedToMax() throws InterruptedException {
        resizablePage.resizeBoxRestrictedToMax();
        Assert.assertEquals(resizablePage.getWeightOfBoxRestricted(),"500px");
        Assert.assertEquals(resizablePage.getHeightOfBoxRestricted(),"300px");
    }

    @Test
    public void isResizableBoxTo500px() throws InterruptedException {
        resizablePage.resizeBoxTo500();
        Assert.assertEquals(resizablePage.getWeightOfResizeBox(),"500px");
        Assert.assertEquals(resizablePage.getHeightOfResizeBox(),"300px");
    }
}

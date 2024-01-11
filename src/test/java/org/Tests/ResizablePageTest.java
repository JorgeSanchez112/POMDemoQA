package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ResizablePageTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        resizablePage = homePage.clickOnSectionInteractions().clickOnResizable();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(resizablePage.getPageTitleText(),"Resizable");
    }

    @Test
    public void validateResizableRestrictedTextIsVisible(){
        Assert.assertTrue(resizablePage.isResizableRestrictedTextVisible());
    }

    @Test
    public void isResizableRestrictedToMax() throws InterruptedException {
        resizablePage.resizeBoxRestrictedToMax();
        Assert.assertEquals(resizablePage.getWeightOfBoxRestricted(),"500px");
        Assert.assertEquals(resizablePage.getHeightOfBoxRestricted(),"300px");
    }

    @Test
    public void validateResizableTextIsVisible(){
        Assert.assertTrue(resizablePage.isResizableTextVisible());
    }

    @Test
    public void isResizableBoxTo500px() throws InterruptedException {
        resizablePage.resizeBoxTo500();
        Assert.assertEquals(resizablePage.getWeightOfResizeBox(),"500px");
        Assert.assertEquals(resizablePage.getHeightOfResizeBox(),"300px");
    }
}

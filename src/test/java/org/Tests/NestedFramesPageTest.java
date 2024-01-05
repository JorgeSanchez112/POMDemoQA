package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NestedFramesPageTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        nestedFramesPage = homePage.clickOnSectionAlerts_Frame_Windows().clickOnNestedFrames();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(nestedFramesPage.getPageTitleText(),"Nested Frames");

    }

    @Test
    public void validateUsesAdviceIsVisible(){
        Assert.assertTrue(nestedFramesPage.isUseAdvicesVisible());
    }

    @Test
    public void validateSwitchToParentFrame(){
        nestedFramesPage.switchToParentFrame();
        Assert.assertEquals(nestedFramesPage.getParentText(),"Parent frame");
    }

    @Test
    public void validateSwitchToChildFrame(){
        nestedFramesPage.switchToParentFrame();
        nestedFramesPage.switchToChildFrame();
        Assert.assertEquals(nestedFramesPage.getChildText(),"Child Iframe");
    }

}

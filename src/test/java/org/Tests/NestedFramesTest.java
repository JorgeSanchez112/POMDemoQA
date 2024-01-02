package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NestedFramesTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        nestedFramesPage = homePage.clickOnSectionAlerts_Frame_Windows().clickOnNestedFrames();
    }

    @Test
    public void validateSwitchToParentFrame(){
        nestedFramesPage.switchToParentFrame();
        Assert.assertTrue(nestedFramesPage.validateParentText());

    }

    @Test
    public void validateSwitchToChildFrame(){
        nestedFramesPage.switchToParentFrame();
        nestedFramesPage.switchToChildFrame();
        Assert.assertTrue(nestedFramesPage.validateChildText());
    }

}

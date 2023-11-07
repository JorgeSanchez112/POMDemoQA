package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NestedFramesTest extends BaseTest {
    @BeforeClass
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
        nestedFramesPage.switchToDefaultContent();
    }

}

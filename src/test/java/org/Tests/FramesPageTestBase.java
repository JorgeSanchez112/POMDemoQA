package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesPageTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
        framesPage = homePage.clickOnSectionAlerts_Frame_Windows().clickOnFrames();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(framesPage.getPageTitleText(),"Frames");
    }

    @Test
    public void validateUseAdviceTextIsVisible(){
        Assert.assertTrue(framesPage.isUseAdvicesTextVisible());
    }

    @Test
    public void validateChangeToBigFrame(){
        framesPage.switchToBigFrame();
        Assert.assertTrue(framesPage.validateTextFrames());
    }

    @Test
    public void validateChangeToShortFrame(){
        framesPage.switchToShortFrame();
        Assert.assertTrue(framesPage.validateTextFrames());
    }
}

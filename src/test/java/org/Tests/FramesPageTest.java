package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesPageTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        framesPage = homePage.clickOnSectionAlerts_Frame_Windows().clickOnFrames();
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

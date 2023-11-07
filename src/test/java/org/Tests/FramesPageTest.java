package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FramesPageTest extends BaseTest {
    @BeforeClass
    public void initializeClass(){
        framesPage = homePage.clickOnSectionAlerts_Frame_Windows().clickOnFrames();
    }

    @Test
    public void validateChangeToBigFrame(){
        framesPage.switchToBigFrame();
        Assert.assertTrue(framesPage.validateTextFrames());
        framesPage.switchToDefaultContent();
    }

    @Test
    public void validateChangeToShortFrame(){
        framesPage.switchToShortFrame();
        Assert.assertTrue(framesPage.validateTextFrames());
        framesPage.switchToDefaultContent();
    }
}

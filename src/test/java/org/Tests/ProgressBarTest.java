package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        progressBarPage = homePage.clickOnSectionWidgets().clickOnProgressBar();
    }

    @Test
    public void validateProgressBar(){
        progressBarPage.clickOnStartButton();
        progressBarPage.waitForResetButton();
        Assert.assertEquals(progressBarPage.getPercentText(), "100%");
    }

    @Test
    public void validateReturnToBasePage(){
        progressBarPage.clickOnStartButton();
        progressBarPage.waitForResetButton();
        progressBarPage.clickOnResetButton();
        Assert.assertEquals(progressBarPage.getPercentText(), "0%");
    }
}

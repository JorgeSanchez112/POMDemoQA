package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest {
    @BeforeClass
    public void initializeClass(){
        progressBarPage = homePage.clickOnSectionWidgets().clickOnProgressBar();
    }

    @Test
    public void validateProgressBar(){
        progressBarPage.clickOnStartButton();
        progressBarPage.waitForResetButton();
        Assert.assertEquals(progressBarPage.getPercentText(), "100%");
        progressBarPage.clickOnResetButton();
    }

    @Test
    public void validateReturnToBasePage(){
        progressBarPage.clickOnStartButton();
        progressBarPage.waitForResetButton();
        progressBarPage.clickOnResetButton();
        Assert.assertEquals(progressBarPage.getPercentText(), "0%");
    }
}
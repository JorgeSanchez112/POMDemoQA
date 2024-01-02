package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToolTipsTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        toolTipsPage = homePage.clickOnSectionWidgets().clickOnToolTips();
    }

    @Test
    public void validateButtonHover(){
        toolTipsPage.moveClickerTOHoverButton();
        Assert.assertEquals(toolTipsPage.getTextFromButtonHoverAttribute(), "buttonToolTip");
    }

    @Test
    public void validateInputHover(){
        toolTipsPage.moveClickerTOHoverInput();
        Assert.assertEquals(toolTipsPage.getTextFromInputHoverAttribute(), "textFieldToolTip");
    }

    @Test
    public void validateContraryLinkHover(){
        toolTipsPage.moveClickerTOContraryLink();
        Assert.assertEquals(toolTipsPage.getTextFromHoverContraryLinkAttribute(), "contraryTexToolTip");
    }

    @Test
    public void validateVersionLinkHover()  {
        toolTipsPage.moveClickerTOVersionLink();
        Assert.assertEquals(toolTipsPage.getTextFromHoverVersionLinkAttribute(), "sectionToolTip");
    }
}

package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToolTipsPageTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
        toolTipsPage = homePage.clickOnSectionWidgets().clickOnToolTips();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(toolTipsPage.getPageTitleText(),"Tool Tips");
    }

    @Test
    public void validateCorrectLabel(){
        Assert.assertEquals(toolTipsPage.getLabelText(),"Practice Tool Tips");
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

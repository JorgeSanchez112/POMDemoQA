package org.Tests;

import TestComponents.BaseTest;
import org.testng.annotations.BeforeClass;
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
        toolTipsPage.isHoverButtonVisible();
    }

    @Test
    public void validateInputHover(){
        toolTipsPage.moveClickerTOHoverInput();
        toolTipsPage.isHoverInputVisible();
    }

    @Test
    public void validateContraryLinkHover(){
        toolTipsPage.moveClickerTOContraryLink();
        toolTipsPage.isHoverContraryLinkVisible();
    }

    @Test
    public void validateVersionLinkHover()  {
        toolTipsPage.moveClickerTOVersionLink();
        toolTipsPage.isHoverVersionLinkVisible();
    }
}

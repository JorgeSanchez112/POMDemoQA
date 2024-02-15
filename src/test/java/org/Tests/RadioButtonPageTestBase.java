package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonPageTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
        radioButtonPage = homePage.clickOnSectionElements().clickOnRadioButtonSection();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(radioButtonPage.getPageTitleText(), "Radio Button");
    }

    @Test
    public void validateSubtitleIsVisible(){
        Assert.assertTrue(radioButtonPage.isSubtitleVisible());
    }

    @Test
    public void validateYesRadioButton(){
        radioButtonPage.clickOnYesRB();
        Assert.assertEquals(radioButtonPage.response(),"Yes");
    }

    @Test
    public void validateImpressiveRadioButton(){
        radioButtonPage.clickOnImpressiveRB();
        Assert.assertEquals(radioButtonPage.response(),"Impressive");
    }

    @Test
    public void validateDisabledRadioButton(){
        Assert.assertFalse(radioButtonPage.isRadioButtonEnabled());
    }

}

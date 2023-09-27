package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RadioButtonPageTest extends BaseTest {
    @BeforeClass
    public void initializeClass(){
        radioButtonPage = homePage.clickOnSectionElements().clickOnRadioButtonSection();
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
        Assert.assertFalse(radioButtonPage.radioButtonIsEnabled());
    }

}

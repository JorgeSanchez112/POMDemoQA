package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoCompletePageTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        autoCompletePage = homePage.clickOnSectionWidgets().clickOnAutoComplete();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(autoCompletePage.getPageTitleText(),"Auto Complete");
    }

    @Test
    public void validateCorrectMultipleContainerLabel(){
        Assert.assertEquals(autoCompletePage.getMultipleContainerLabelText(),"Type multiple color names");
    }

    @Test
    public void validateCorrectSingleContainerLabel(){
        Assert.assertEquals(autoCompletePage.getSingleContainerLabelText(),"Type single color name");
    }

    @Test
    public void validateColorNamesInMultipleContainer(){
        autoCompletePage.typeInMultipleContainer("Bla");
        autoCompletePage.typeInMultipleContainer("Whit");
        Assert.assertTrue(autoCompletePage.isTheValueContained("Black"));
        Assert.assertTrue(autoCompletePage.isTheValueContained("White"));
    }

    @Test
    public void validateColorNameInSingleContainer(){
        autoCompletePage.typeInSingleContainer("Voil");
        Assert.assertEquals(autoCompletePage.getTextOfSingleContainerValue(), "Voilet");
    }
}

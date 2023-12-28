package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AutoCompleteTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        autoCompletePage = homePage.clickOnSectionWidgets().clickOnAutoComplete();
    }

    @Test
    public void validateColorNamesInMultipleContainer(){
        autoCompletePage.typeInMultipleContainer("Bla");
        Assert.assertEquals(autoCompletePage.getTextOfMultipleContainerValue(), "Black");
    }

    @Test
    public void validateColorNameInSingleContainer(){
        autoCompletePage.typeInSingleContainer("Voil");
        Assert.assertEquals(autoCompletePage.getTextOfSingleContainerValue(), "Voilet");
    }
}

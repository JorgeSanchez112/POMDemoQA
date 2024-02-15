package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsPageTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
        elementsPage = homePage.clickOnSectionElements();
    }

    @Test
    public void validateURL(){
        Assert.assertEquals(elementsPage.getElementUrlText(),"https://demoqa.com/elements");
    }

    @Test
    public void validatePageTitle(){
        Assert.assertEquals(elementsPage.getPageTitleText(),"Elements");
    }

    @Test
    public void validateSizeElements(){
        Assert.assertEquals(elementsPage.deployedElementsSize(),9);
    }
}

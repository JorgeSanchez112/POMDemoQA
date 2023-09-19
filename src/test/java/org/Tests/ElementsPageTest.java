package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ElementsPageTest extends BaseTest {
    @BeforeClass
    public void initializeClass(){
        elementsPage = homePage.clickOnSectionElements();
    }

    @Test
    public void validateURL(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/elements");
    }

    @Test
    public void validateSizeElements(){
        Assert.assertEquals(elementsPage.deployedElementsSize(),9);
    }
}

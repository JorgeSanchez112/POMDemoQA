package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InteractionsPageTest extends BaseTest {
    @BeforeClass
    public void initializeClass(){
        interactionsPage = homePage.clickOnSectionInteractions();
    }

    @Test
    public void validateURL(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/interaction");
    }

    @Test
    public void validateSectionsSize(){
        Assert.assertEquals(interactionsPage.getSizeSections(),5);
    }
}

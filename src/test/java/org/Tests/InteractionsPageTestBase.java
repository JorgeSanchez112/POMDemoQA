package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InteractionsPageTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
        interactionsPage = homePage.clickOnSectionInteractions();
    }

    @Test
    public void validateURL(){
        Assert.assertEquals(interactionsPage.getInteractionsUrlText(),"https://demoqa.com/interaction");
    }

    @Test
    public void validateSectionsSize(){
        Assert.assertEquals(interactionsPage.getSizeSections(),5);
    }
}

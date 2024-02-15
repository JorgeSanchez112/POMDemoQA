package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WidgetsPageTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
        widgetsPage = homePage.clickOnSectionWidgets();
    }

    @Test
    public void validateURL(){
        Assert.assertEquals(widgetsPage.getWidgetsUrlText(),"https://demoqa.com/widgets");
    }

    @Test
    public void validateSectionsSize(){
        Assert.assertEquals(widgetsPage.getSizeSections(),9);
    }
}

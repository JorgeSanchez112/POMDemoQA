package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WidgetsPageTest extends BaseTest {
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

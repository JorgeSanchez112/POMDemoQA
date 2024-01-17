package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormsPageTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        formsPage = homePage.clickOnSectionForms();
    }

    @Test
    public void validateURL(){
        Assert.assertEquals(formsPage.getFormsUrlText(),"https://demoqa.com/forms");
    }

    @Test
    public void validateCorrectMenuListVisible(){
        Assert.assertEquals(formsPage.getMenuListText(),"Practice Form");
    }

}

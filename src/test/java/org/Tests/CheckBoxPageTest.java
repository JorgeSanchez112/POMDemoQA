package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxPageTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
      checkBoxPage = homePage.clickOnSectionElements().clickOnCheckBoxSection();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(checkBoxPage.getPageTitleText(),"Check Box");
    }

    @Test
    public void ValidateDesktopIsClicked(){
        checkBoxPage.clickOnExpandButton();
        checkBoxPage.clickInDesktopElements();
        Assert.assertTrue(checkBoxPage.checkBoxDesktopIsClicked());

    }

    @Test
    public void validateDocumentsIsClicked(){
        checkBoxPage.clickOnExpandButton();
        checkBoxPage.clickInWorkspaceElements();
        checkBoxPage.clickInOfficeElements();
        Assert.assertTrue(checkBoxPage.checkDocumentsClicked());
    }

    @Test
    public void validateDownloadsIsClicked(){
        checkBoxPage.clickOnExpandButton();
        checkBoxPage.clickInDownloadElements();
        Assert.assertTrue(checkBoxPage.checkDownloadsClicked());
    }
}

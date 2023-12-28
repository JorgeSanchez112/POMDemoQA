package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxPageTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
      checkBoxPage = homePage.clickOnSectionElements().clickOnCheckBoxSection();
      checkBoxPage.clickOnExpandButton();
    }


    @Test
    public void ValidateDesktopIsClicked(){
        checkBoxPage.clickOnNotes();
        checkBoxPage.clickOnCommand();
        Assert.assertTrue(checkBoxPage.checkBoxDesktopIsClicked());

    }

    @Test
    public void validateDocumentsIsClicked(){
        checkBoxPage.clickOnReact();
        checkBoxPage.clickOnAngular();
        checkBoxPage.clickOnVeu();
        checkBoxPage.clickOnPublic();
        checkBoxPage.clickOnPrivate();
        checkBoxPage.clickOnClassified();
        checkBoxPage.clickOnGeneral();
        Assert.assertTrue(checkBoxPage.checkDocumentsClicked());
    }

    @Test
    public void validateDownloadsIsClicked(){
        checkBoxPage.clickOnWordFile();
        checkBoxPage.clickOnExcelFile();
        Assert.assertTrue(checkBoxPage.checkDownloadsClicked());
    }


}

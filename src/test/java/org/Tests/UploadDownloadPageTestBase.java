package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadDownloadPageTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
        uploadDownloadPage = homePage.clickOnSectionElements().clickOnUploadDownloadSection();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(uploadDownloadPage.getPageTitleText(),"Upload and Download");
    }

    @Test
    public void validateArchiveDownloaded(){
        uploadDownloadPage.clickOnDownloadButton();
        uploadDownloadPage.searchFileInSelectFile();

        Assert.assertEquals(uploadDownloadPage.getFilePathText(), uploadDownloadPage.getNameDownloadedFile());
    }
}

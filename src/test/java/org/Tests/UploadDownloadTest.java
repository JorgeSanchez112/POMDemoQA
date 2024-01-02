package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadDownloadTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        uploadDownload = homePage.clickOnSectionElements().clickOnUploadDownloadSection();
    }

    @Test
    public void validateArchiveDownloaded(){
        uploadDownload.clickOnDownloadButton();
        uploadDownload.searchFileInSelectFile();

        Assert.assertEquals(uploadDownload.getFilePathText(),uploadDownload.getNameDownloadedFile());
    }
}

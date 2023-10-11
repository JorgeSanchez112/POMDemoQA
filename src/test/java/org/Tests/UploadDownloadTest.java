package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UploadDownloadTest extends BaseTest {
    @BeforeClass
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

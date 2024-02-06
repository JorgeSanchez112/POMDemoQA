package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BSIBookPageTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        bsiBookPage = homePage.clickOnSectionBookStoreApplication().searchAndClickOnATitle("Git Pocket Guide");
    }

    @Test
    public void isIsbnLabelVisible(){
        Assert.assertTrue(bsiBookPage.isbnLabelIsVisible());
    }

    @Test
    public void isTitleLabelVisible(){
        Assert.assertTrue(bsiBookPage.titleLabelIsVisible());
    }

    @Test
    public void isSubTitleLabelVisible(){
        Assert.assertTrue(bsiBookPage.subtitleLabelIsVisible());
    }

    @Test
    public void isAuthorLabelVisible(){
        Assert.assertTrue(bsiBookPage.authorLabelIsVisible());
    }

    @Test
    public void isPublisherLabelVisible(){
        Assert.assertTrue(bsiBookPage.publisherLabelIsVisible());
    }

    @Test
    public void isTotalPagesLabelVisible(){
        Assert.assertTrue(bsiBookPage.pagesLabelIsVisible());
    }

    @Test
    public void isWebsiteLabelVisible(){
        Assert.assertTrue(bsiBookPage.websiteLabelIsVisible());
    }

}

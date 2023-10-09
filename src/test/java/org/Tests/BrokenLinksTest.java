package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class BrokenLinksTest extends BaseTest {

    @BeforeClass
    public void initializeClass(){
        brokenLinks = homePage.clickOnSectionElements().clickOnBrokenLinksImageSection();
    }

    @Test
    public void validateImage() throws IOException {
        Assert.assertTrue(brokenLinks.isDisplayedValidImage());
    }

    @Test
    public void validateBrokeImage() throws IOException {
        Assert.assertTrue(brokenLinks.isDisplayedBrokenImage());
    }

    @Test
    public void validateLink() throws IOException {
        Assert.assertFalse(brokenLinks.isAValidLink());
    }

    @Test
    public void validateBrokenLink() throws IOException {
        Assert.assertFalse(brokenLinks.isABrokenLink());
    }
}

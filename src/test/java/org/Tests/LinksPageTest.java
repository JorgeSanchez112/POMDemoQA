package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LinksPageTest extends BaseTest {
    @BeforeClass
    public void initializeClass(){
       linksPage = homePage.clickOnSectionElements().clickOnLinksSection();
    }

    @Test
    public void validateHomeLink() {
        Assert.assertEquals(linksPage.getHrefOfHomeLink(),"https://demoqa.com/");
    }

    @Test
    public void validateHomeETgEzLink() {
        Assert.assertEquals(linksPage.getHrefOfHomeETgEzLink(),"https://demoqa.com/");
    }

    @Test
    public void validateCreatedLink() throws InterruptedException {
        linksPage.clickOnCreatedLink();
        Thread.sleep(1000);
        Assert.assertEquals(linksPage.getHttpMessage(),"201");
        Assert.assertEquals(linksPage.getNameLinkMessage(),"Created");
    }

    @Test
    public void validateNoContentLink() throws InterruptedException {
        linksPage.clickOnNoContentLink();
        Thread.sleep(1000);
        Assert.assertEquals(linksPage.getHttpMessage(),"204");
        Assert.assertEquals(linksPage.getNameLinkMessage(),"No Content");
    }

    @Test
    public void validateMovedLink() throws InterruptedException {
        linksPage.clickOnMovedLink();
        Thread.sleep(1000);
        Assert.assertEquals(linksPage.getHttpMessage(),"301");
        Assert.assertEquals(linksPage.getNameLinkMessage(),"Moved Permanently");
    }

    @Test
    public void validateBadRequestLink() throws InterruptedException {
        linksPage.clickOnBadRequestLink();
        Thread.sleep(1000);
        Assert.assertEquals(linksPage.getHttpMessage(),"400");
        Assert.assertEquals(linksPage.getNameLinkMessage(),"Bad Request");
    }

    @Test
    public void validateUnauthorizedLink() throws InterruptedException {
        linksPage.clickOnUnauthorizedLink();
        Thread.sleep(1000);
        Assert.assertEquals(linksPage.getHttpMessage(),"401");
        Assert.assertEquals(linksPage.getNameLinkMessage(),"Unauthorized");
    }

    @Test
    public void validateForbiddenLink() throws InterruptedException {
        linksPage.clickOnForbiddenLink();
        Thread.sleep(1000);
        Assert.assertEquals(linksPage.getHttpMessage(),"403");
        Assert.assertEquals(linksPage.getNameLinkMessage(),"Forbidden");
    }

    @Test
    public void validateNotFoundLink() throws InterruptedException {
        linksPage.clickOnNotFoundLink();
        Thread.sleep(1000);
        Assert.assertEquals(linksPage.getHttpMessage(),"404");
        Assert.assertEquals(linksPage.getNameLinkMessage(),"Not Found");
    }
}
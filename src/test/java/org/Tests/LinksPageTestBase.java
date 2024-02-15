package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksPageTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
       linksPage = homePage.clickOnSectionElements().clickOnLinksSection();
    }

    @Test
    public void validateCorrectedTitle(){
        Assert.assertEquals(linksPage.getPageTitleText(),"Links");
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
    public void validateCreatedLink() {
        linksPage.clickOnCreatedLink();
        Assert.assertEquals(linksPage.getHttpMessage(),"201");
        Assert.assertEquals(linksPage.getNameLinkMessage(),"Created");
    }

    @Test
    public void validateNoContentLink() {
        linksPage.clickOnNoContentLink();
        Assert.assertEquals(linksPage.getHttpMessage(),"204");
        Assert.assertEquals(linksPage.getNameLinkMessage(),"No Content");
    }

    @Test
    public void validateMovedLink() {
        linksPage.clickOnMovedLink();
        Assert.assertEquals(linksPage.getHttpMessage(),"301");
        Assert.assertEquals(linksPage.getNameLinkMessage(),"Moved Permanently");
    }

    @Test
    public void validateBadRequestLink() {
        linksPage.clickOnBadRequestLink();
        Assert.assertEquals(linksPage.getHttpMessage(),"400");
        Assert.assertEquals(linksPage.getNameLinkMessage(),"Bad Request");
    }

    @Test
    public void validateUnauthorizedLink() {
        linksPage.clickOnUnauthorizedLink();
        Assert.assertEquals(linksPage.getHttpMessage(),"401");
        Assert.assertEquals(linksPage.getNameLinkMessage(),"Unauthorized");
    }

    @Test
    public void validateForbiddenLink() {
        linksPage.clickOnForbiddenLink();
        Assert.assertEquals(linksPage.getHttpMessage(),"403");
        Assert.assertEquals(linksPage.getNameLinkMessage(),"Forbidden");
    }

    @Test
    public void validateNotFoundLink() {
        linksPage.clickOnNotFoundLink();
        Assert.assertEquals(linksPage.getHttpMessage(),"404");
        Assert.assertEquals(linksPage.getNameLinkMessage(),"Not Found");
    }
}

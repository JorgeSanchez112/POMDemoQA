package org.Tests;

import TestComponents.BaseTest;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BSIBookPageTest extends BaseTest {

    String isbnValue = "9781449325862";
    String titleValue = "Git Pocket Guide";
    String subTitleValue = "A Working Introduction";
    String authorValue = "Richard E. Silverman";
    String publisherValue = "O'Reilly Media";
    String totalPages = "234";
    String descriptionValue = "This pocket guide is the perfect on-the-job companion to Git, the distributed version control system. It provides a compact, readable introduction to Git for new users, as well as a reference to common commands and procedures for those of you with Git exp";


    @BeforeMethod
    public void initializeClass(){
        try{
            bsiBookPage = homePage.clickOnSectionBookStoreApplication().searchAndClickOnATitle("Git Pocket Guide");
        }catch (WebDriverException e){
            e.printStackTrace();
        }

    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(bsiBookPage.getPageTitleText(),"Book Store");
    }

    @Test
    public void isUsernameLabelVisible(){
        Assert.assertFalse(bsiBookPage.usernameLabelIsVisible());
    }

    @Test
    public void validateLoginButton(){
        Assert.assertEquals(bsiBookPage.clickOnLogin().getCurrentUrl(),"https://demoqa.com/login");
    }

    @Test
    public void validateIsbnValueIsCorrect(){
        Assert.assertEquals(bsiBookPage.getIsbnValueText(),isbnValue);
    }

    @Test
    public void isIsbnLabelVisible(){
        Assert.assertTrue(bsiBookPage.isbnLabelIsVisible());
    }

    @Test
    public void validateTitleValueIsCorrect(){
        Assert.assertEquals(bsiBookPage.getTitleValueText(),titleValue);
    }

    @Test
    public void isTitleLabelVisible(){
        Assert.assertTrue(bsiBookPage.titleLabelIsVisible());
    }

    @Test
    public void validateSubtitleValueIsCorrect(){
        Assert.assertEquals(bsiBookPage.getSubTitleValueText(),subTitleValue);
    }

    @Test
    public void isSubTitleLabelVisible(){
        Assert.assertTrue(bsiBookPage.subtitleLabelIsVisible());
    }

    @Test
    public void ValidateAuthorValueIsCorrect(){
        Assert.assertEquals(bsiBookPage.getAuthorValueText(),authorValue);
    }

    @Test
    public void isAuthorLabelVisible(){
        Assert.assertTrue(bsiBookPage.authorLabelIsVisible());
    }

    @Test
    public void validatePublisherValueIsCorrect(){
        Assert.assertEquals(bsiBookPage.getPublisherValueText(),publisherValue);
    }

    @Test
    public void isPublisherLabelVisible(){
        Assert.assertTrue(bsiBookPage.publisherLabelIsVisible());
    }

    @Test
    public void validateTotalPageValueIsCorrect(){
        Assert.assertEquals(bsiBookPage.getTotalPagesValueText(),totalPages);
    }

    @Test
    public void isTotalPagesLabelVisible(){
        Assert.assertTrue(bsiBookPage.pagesLabelIsVisible());
    }

    @Test
    public void validateDescriptionValueIsCorrect(){
        Assert.assertEquals(bsiBookPage.getDescriptionValueText(),descriptionValue);
    }

    @Test
    public void isDescriptionLabelVisible(){
        Assert.assertTrue(bsiBookPage.descriptionLabelIsVisible());
    }

    @Test
    public void isWebsiteLabelVisible(){
        Assert.assertTrue(bsiBookPage.websiteLabelIsVisible());
    }

    @Test
    public void isWebsiteLinkVisible(){
        Assert.assertTrue(bsiBookPage.websiteValueLinkIsVisible());
    }

    @Test
    public void isRedirectHome(){
        Assert.assertEquals(bsiBookPage.clickOnBackToBookStoreBookButton().getBookStoreUrlText(),"https://demoqa.com/books");
    }

    @Test
    public void isNotLogOutButtonVisible(){
        Assert.assertFalse(bsiBookPage.logOutButtonIsVisible());
    }

    @Test
    public void validateUserNameValue() throws InterruptedException {
        bsiBookPage.clickOnLogin().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsiBookPage.getUsernameValueText(),prop.getProperty("BSUsername"));
    }

    @Test
    public void validateLogOutButtonIsFunctional() throws InterruptedException {
        bsiBookPage.clickOnLogin().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsiBookPage.clickOnLogOutButton().getCurrentUrl(),"https://demoqa.com/login");
    }

}

package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BSProfileTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        bsProfilePage = homePage.clickOnSectionBookStoreApplication().clickOnProfile();
    }

    @Test
    public void isProfileTitleVisible(){
        Assert.assertTrue(bsProfilePage.isTitleVisible());
    }

    @Test
    public void isMessageDoNotLoginShowed(){
        Assert.assertTrue(bsProfilePage.isMessageDoNotLoginShowed());
    }

    @Test
    public void isUserNameValueCorrect(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getUserNameValueText(),prop.getProperty("BSUsername"));
    }

    @Test
    public void validateCorrectBooksLabelText(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getBooksLabelText(),"Books :");
    }

    @Test
    public void validateCorrectPlaceHolderInSearchBook() {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"), prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getSearchBoxPlaceholderText(), "Type to search");
    }

    @Test
    public void validateCorrectUsernameLabelText(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getUserNameLabelText(),"User Name :");
    }

    @Test
    public void validateLogOutButtonRedirectToLogin(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.clickOnLogOutButton().getCurrentUrl(),"https://demoqa.com/login");
    }

    @Test
    public void validateCorrectImageTitleText(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getTableTitleImageText(),"Image");
    }

    @Test
    public void validateCorrectTitleOfTitleTableText(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getTableTitleTitleText(),"Title");
    }

    @Test
    public void validateCorrectAuthorTitleOfTableText(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getTableTitleAuthorText(),"Author");
    }

    @Test
    public void validateCorrectPublisherTitleOfTableText(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getTableTitlePublisherText(),"Publisher");
    }

    @Test
    public void validateCorrectActionTitleOfTableText(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getTableTitleActionText(),"Action");
    }

    @Test
    public void validateNoDataMessageIsVisible(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertTrue(bsProfilePage.isMessageNoDataVisible());
    }

    @Test
    public void validatePreviousButtonIsEnabled(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertTrue(bsProfilePage.isPreviousButtonEnabled());
    }

    @Test
    public void validateNextButtonIsEnabled(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertFalse(bsProfilePage.isNextButtonEnabled());
    }

    @Test
    public void isBookFoundBySearchBox(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        bsProfilePage.typeOnSearchBox("Speaking");
        Assert.assertTrue(bsProfilePage.isTitleInTableOfBooksCollection("Speaking JavaScript"));
    }

    @Test
    public void validateCorrectPageLabelText(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getPageText(),"Page of 1");
    }

    @Test
    public void validateCorrectTotalOfPages(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getTotalOfPagesText(),"1");
    }

    @Test
    public void wereAllBooksDeleted(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        bsProfilePage.clickOnDeleteAllBooksButton();
        bsProfilePage.acceptDeleteAccountOrBooks();
        bsProfilePage.acceptAlert();
        Assert.assertTrue(bsProfilePage.isMessageNoDataVisible());
    }

    @Test
    public void validateGoToBookStoreRedirectToBookStorePage(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.clickOnGoToBookStoreButton().getBookStoreUrlText(),"https://demoqa.com/books");
    }

    /*@Test
    public void IsAddedABookInTable(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
    }*/

    /*@Test
    public void validateAccountIsDeleted(){
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        bsProfilePage.deleteAccount().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertTrue(bsProfilePage.isTitleVisible());
    }*/

}

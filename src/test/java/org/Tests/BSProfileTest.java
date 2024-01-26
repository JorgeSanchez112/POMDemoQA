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


}

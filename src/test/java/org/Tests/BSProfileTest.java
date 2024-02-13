package org.Tests;

import TestComponents.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

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
    public void validateLinkRegisterIsFunctional(){
        Assert.assertEquals(bsProfilePage.clickOnRegisterLink().getCurrentUrl(),"https://demoqa.com/register");
    }

    @Test
    public void isMessageDoNotLoginShowed(){
        Assert.assertTrue(bsProfilePage.isMessageDoNotLoginShowed());
    }

    @Test
    public void isUserNameValueCorrect() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getUserNameValueText(),prop.getProperty("BSUsername"));
    }

    @Test
    public void validateCorrectBooksLabelText() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getBooksLabelText(),"Books :");
    }

    @Test
    public void validateCorrectPlaceHolderInSearchBook() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"), prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getSearchBoxPlaceholderText(), "Type to search");
    }

    @Test
    public void validateCorrectUsernameLabelText() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getUserNameLabelText(),"User Name :");
    }

    @Test
    public void validateLogOutButtonRedirectToLogin() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.clickOnLogOutButton().getCurrentUrl(),"https://demoqa.com/login");
    }

    @Test
    public void validateCorrectImageTitleText() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getTableTitleImageText(),"Image");
    }

    @Test
    public void validateCorrectTitleOfTitleTableText() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getTableTitleTitleText(),"Title");
    }

    @Test
    public void validateCorrectAuthorTitleOfTableText() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getTableTitleAuthorText(),"Author");
    }

    @Test
    public void validateCorrectPublisherTitleOfTableText() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getTableTitlePublisherText(),"Publisher");
    }

    @Test
    public void validateCorrectActionTitleOfTableText() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getTableTitleActionText(),"Action");
    }

    @Test
    public void validateNoDataMessageIsVisible() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertTrue(bsProfilePage.isMessageNoDataVisible());
    }

    @Test
    public void validatePreviousButtonIsEnabled() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertFalse(bsProfilePage.isPreviousButtonEnabled());
    }

    @Test
    public void validateNextButtonIsEnabled() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertFalse(bsProfilePage.isNextButtonEnabled());
    }

    @Test
    public void isBookFoundBySearchBox() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        bsProfilePage.typeOnSearchBox("Git Pocket Guide");
        Assert.assertTrue(bsProfilePage.isTitleInTableOfBooksCollection("Git Pocket Guide"));
    }

    @Test
    public void validateCorrectPageLabelText() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getPageText(),"Page of 1");
    }

    @Test
    public void validateCorrectTotalOfPages() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getTotalOfPagesText(),"1");
    }

    @Test
    public void wereAllBooksDeleted() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        bsProfilePage.clickOnDeleteAllBooksButton();
        bsProfilePage.acceptDeleteAccountOrBooks();
        bsProfilePage.acceptAlert();
        Assert.assertTrue(bsProfilePage.isMessageNoDataVisible());
    }

    @Test
    public void validateGoToBookStoreRedirectToBookStorePage() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.clickOnGoToBookStoreButton().getBookStoreUrlText(),"https://demoqa.com/books");
    }

    @Test
    public void validateCancelButtonOfDeleteAccountAlertIsFunctional() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        bsProfilePage.clickOnDeleteAccountButton();
        bsProfilePage.cancelDeleteAccountOrBooks();
        Assert.assertEquals(bsProfilePage.getUserNameValueText(),"lola12");
    }

    @Test
    public void validateCancelButtonOfDeleteBooksAlertIsFunctional() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        bsProfilePage.clickOnGoToBookStoreButton().searchAndClickOnATitle("Learning JavaScript Design Patterns")
                .addBookAndReturnToBookStore().clickOnProfile();
        bsProfilePage.clickOnDeleteAllBooksButton();
        bsProfilePage.cancelDeleteAccountOrBooks();
        Assert.assertTrue(bsProfilePage.isTitleInTableOfBooksCollection("Learning JavaScript Design Patterns"));
    }

    @Test
    public void IsAddedABookInTable() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        bsProfilePage.clickOnGoToBookStoreButton().searchAndClickOnATitle("Speaking JavaScript")
                .addBookAndReturnToBookStore()
                .clickOnProfile();
        bsProfilePage.isTitleInTableOfBooksCollection("Speaking JavaScript");
    }

    @Test
    public void pageNumber() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getPageNumber(),"");
    }

    @Test
    public void validateCorrectAuthorRegardToTitleBook() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getAuthorRegardToTitleBookText("Learning JavaScript Design Patterns"),"Addy Osmani");
    }

    @Test
    public void validateCorrectPublisherRegardToTitleBook() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertEquals(bsProfilePage.getPublisherRegardToTitleBookText("Learning JavaScript Design Patterns"),"O'Reilly Media");
    }

    @Test
    public void isNotImageWithBrokeLink() throws InterruptedException, IOException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertTrue(bsProfilePage.isLinkImageDoesNotBrokeInTableOfBooksCollection("Learning JavaScript Design Patterns"));
    }

    @Test
    public void isABookDeleted() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        bsProfilePage.deleteABook("Learning JavaScript Design Patterns");
        Assert.assertFalse(bsProfilePage.isTitleInTableOfBooksCollection("Learning JavaScript Design Patterns"));
    }

    @Test
    public void isShowedDataWithNextButton() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        bsProfilePage.clickOnGoToBookStoreButton()
                .searchAndClickOnATitle("Speaking JavaScript").addBookAndReturnToBookStore()
                .searchAndClickOnATitle("You Don't Know JS").addBookAndReturnToBookStore()
                .searchAndClickOnATitle("Programming JavaScript Applications").addBookAndReturnToBookStore()
                .searchAndClickOnATitle("Eloquent JavaScript, Second Edition").addBookAndReturnToBookStore()
                .searchAndClickOnATitle("Understanding ECMAScript 6").addBookAndReturnToBookStore()
                .searchAndClickOnATitle("Designing Evolvable Web APIs with ASP.NET").addBookAndReturnToBookStore()
                .clickOnProfile();
        bsProfilePage.clickOnNextButton();
        Assert.assertEquals(bsProfilePage.getPageNumber(),"2");
    }

    @Test
    public void isShowedDataWithPreviousButton() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        bsProfilePage.waitForVisibleElement(driver.findElement(By.cssSelector(prop.getProperty("publicityLocator"))));
        bsProfilePage.hidePublicity(driver.findElement(By.cssSelector(prop.getProperty("publicityLocator"))));
        bsProfilePage.clickOnGoToBookStoreButton()
                .searchAndClickOnATitle("Speaking JavaScript").addBookAndReturnToBookStore()
                .searchAndClickOnATitle("You Don't Know JS").addBookAndReturnToBookStore()
                .searchAndClickOnATitle("Programming JavaScript Applications").addBookAndReturnToBookStore()
                .searchAndClickOnATitle("Eloquent JavaScript, Second Edition").addBookAndReturnToBookStore()
                .searchAndClickOnATitle("Understanding ECMAScript 6").addBookAndReturnToBookStore()
                .searchAndClickOnATitle("Designing Evolvable Web APIs with ASP.NET").addBookAndReturnToBookStore()
                .clickOnProfile();
        bsProfilePage.clickOnNextButton();
        bsProfilePage.clickOnPreviousButton();
        Assert.assertEquals(bsProfilePage.getPageNumber(),"1");

    }


    /*@Test
    public void validateAccountIsDeleted() throws InterruptedException {
        bsProfilePage.clickOnLoginLink().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        bsProfilePage.deleteAccount().userLogin(prop.getProperty("BSUsername"),prop.getProperty("BSPassword"));
        Assert.assertTrue(bsProfilePage.isTitleVisible());
    }*/

}

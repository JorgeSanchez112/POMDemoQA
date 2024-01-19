package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookStorePageTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        bookStorePage = homePage.clickOnSectionBookStoreApplication();
    }

    @Test
    public void validateURL(){
        Assert.assertEquals(bookStorePage.getBookStoreUrlText(),"https://demoqa.com/books");
    }

    @Test
    public void isBookStoreTitleVisible(){
        Assert.assertTrue(bookStorePage.isTitleVisible());
    }

    @Test
    public void isFirstTitleOfTableCorrect() throws InterruptedException {
        Assert.assertEquals(bookStorePage.getFirstTitleTableText(), "Image");
    }

    @Test
    public void isSecondTitleOfTableCorrect() throws InterruptedException {
        Assert.assertEquals(bookStorePage.getSecondTitleTableText(),"Title");
    }

    @Test
    public void isThirdTitleOfTableCorrect() throws InterruptedException {
        Assert.assertEquals(bookStorePage.getThirdTitleTableText(),"Author");
    }

    @Test
    public void isFourthTitleOfTableCorrect() throws InterruptedException {
        Assert.assertEquals(bookStorePage.getFourthTitleTableText(),"Publisher");
    }

    @Test
    public void isFirstBookImageVisible() throws InterruptedException {
        bookStorePage.scrollToFirstRow();
        Assert.assertTrue(bookStorePage.isVisibleFirstImage());
    }

    @Test
    public void isFirstBookTitleCorrect() throws InterruptedException {
        bookStorePage.scrollToFirstRow();
        Assert.assertEquals(bookStorePage.getTitleOfFirstBookText(),"Git Pocket Guide");
    }

    @Test
    public void isFirstBookAuthorCorrect() throws InterruptedException {
        bookStorePage.scrollToFirstRow();
        Assert.assertEquals(bookStorePage.getAuthorOfFirstBookText(),"Richard E. Silverman");
    }

    @Test
    public void isFirstBookPublisherCorrect() throws InterruptedException {
        bookStorePage.scrollToFirstRow();
        Assert.assertEquals(bookStorePage.getPublisherOfFirstBookText(),"O'Reilly Media");
    }

    @Test
    public void isSecondBookImageVisible() throws InterruptedException {
        bookStorePage.scrollToSecondRow();
        Assert.assertTrue(bookStorePage.isVisibleSecondImage());
    }

    @Test
    public void isSecondBookTitleCorrect() throws InterruptedException {
        bookStorePage.scrollToSecondRow();
        Assert.assertEquals(bookStorePage.getTitleOfSecondBookText(),"Learning JavaScript Design Patterns");
    }

    @Test
    public void isSecondBookAuthorCorrect() throws InterruptedException {
        bookStorePage.scrollToSecondRow();
        Assert.assertEquals(bookStorePage.getAuthorOfSecondBookText(),"Addy Osmani");
    }

    @Test
    public void isSecondBookPublisherCorrect() throws InterruptedException {
        bookStorePage.scrollToSecondRow();
        Assert.assertEquals(bookStorePage.getPublisherOfSecondBookText(),"O'Reilly Media");
    }

    @Test
    public void isThirdBookImageVisible() throws InterruptedException {
        bookStorePage.scrollToThirdRow();
        Assert.assertTrue(bookStorePage.isVisibleThirdImage());
    }

    @Test
    public void isThirdBookTitleCorrect() throws InterruptedException {
        bookStorePage.scrollToThirdRow();
        Assert.assertEquals(bookStorePage.getTitleOfThirdBookText(),"Designing Evolvable Web APIs with ASP.NET");
    }

    @Test
    public void isThirdBookAuthorCorrect() throws InterruptedException {
        bookStorePage.scrollToThirdRow();
        Assert.assertEquals(bookStorePage.getAuthorOfThirdBookText(),"Glenn Block et al.");
    }

    @Test
    public void isThirdBookPublisherCorrect() throws InterruptedException {
        bookStorePage.scrollToThirdRow();
        Assert.assertEquals(bookStorePage.getPublisherOfThirdBookText(),"O'Reilly Media");
    }

    @Test
    public void isFourthBookImageVisible() throws InterruptedException {
        bookStorePage.scrollToFourthRow();
        Assert.assertTrue(bookStorePage.isVisibleFourthImage());
    }

    @Test
    public void isFourthBookTitleCorrect() throws InterruptedException {
        bookStorePage.scrollToFourthRow();
        Assert.assertEquals(bookStorePage.getTitleOfFourthBookText(),"Speaking JavaScript");
    }

    @Test
    public void isFourthBookAuthorCorrect() throws InterruptedException {
        bookStorePage.scrollToFourthRow();
        Assert.assertEquals(bookStorePage.getAuthorOfFourthBookText(),"Axel Rauschmayer");
    }

    @Test
    public void isFourthBookPublisherCorrect() throws InterruptedException {
        bookStorePage.scrollToFourthRow();
        Assert.assertEquals(bookStorePage.getPublisherOfFourthBookText(),"O'Reilly Media");
    }

    @Test
    public void isFifthBookImageVisible() throws InterruptedException {
        bookStorePage.scrollToFifthRow();
        Assert.assertTrue(bookStorePage.isVisibleFifthImage());
    }

    @Test
    public void isFifthBookTitleCorrect() throws InterruptedException {
        bookStorePage.scrollToFifthRow();
        Assert.assertEquals(bookStorePage.getTitleOfFifthBookText(),"You Don't Know JS");
    }

    @Test
    public void isFifthBookAuthorCorrect() throws InterruptedException {
        bookStorePage.scrollToFifthRow();
        Assert.assertEquals(bookStorePage.getAuthorOfFifthBookText(),"Kyle Simpson");
    }

    @Test
    public void isFifthBookPublisherCorrect() throws InterruptedException {
        bookStorePage.scrollToFifthRow();
        Assert.assertEquals(bookStorePage.getPublisherOfFifthBookText(),"O'Reilly Media");
    }

    @Test
    public void isSixthBookImageVisible() throws InterruptedException {
        bookStorePage.scrollToSixthRow();
        Assert.assertTrue(bookStorePage.isVisibleSixthImage());
    }

    @Test
    public void isSixthBookTitleCorrect() throws InterruptedException {
        bookStorePage.scrollToSixthRow();
        Assert.assertEquals(bookStorePage.getTitleOfSixthBookText(),"Programming JavaScript Applications");
    }

    @Test
    public void isSixthBookAuthorCorrect() throws InterruptedException {
        bookStorePage.scrollToSixthRow();
        Assert.assertEquals(bookStorePage.getAuthorOfSixthBookText(),"Eric Elliott");
    }

    @Test
    public void isSixthBookPublisherCorrect() throws InterruptedException {
        bookStorePage.scrollToSixthRow();
        Assert.assertEquals(bookStorePage.getPublisherOfSixthBookText(),"O'Reilly Media");
    }

    @Test
    public void isSeventhBookImageVisible() throws InterruptedException {
        bookStorePage.scrollToSeventhRow();
        Assert.assertTrue(bookStorePage.isVisibleSeventhImage());
    }

    @Test
    public void isSeventhBookTitleCorrect() throws InterruptedException {
        bookStorePage.scrollToSeventhRow();
        Assert.assertEquals(bookStorePage.getTitleOfSeventhBookText(),"Eloquent JavaScript, Second Edition");
    }

    @Test
    public void isSeventhBookAuthorCorrect() throws InterruptedException {
        bookStorePage.scrollToSeventhRow();
        Assert.assertEquals(bookStorePage.getAuthorOfSeventhBookText(),"Marijn Haverbeke");
    }

    @Test
    public void isSeventhBookPublisherCorrect() throws InterruptedException {
        bookStorePage.scrollToSeventhRow();
        Assert.assertEquals(bookStorePage.getPublisherOfSeventhBookText(),"No Starch Press");
    }

    @Test
    public void isEighthBookImageVisible() throws InterruptedException {
        bookStorePage.scrollToSeventhRow();
        Assert.assertTrue(bookStorePage.isVisibleEighthImage());
    }

    @Test
    public void isEighthBookTitleCorrect() throws InterruptedException {
        bookStorePage.scrollToSeventhRow();
        Assert.assertEquals(bookStorePage.getTitleOfEighthBookText(),"Understanding ECMAScript 6");
    }

    @Test
    public void isEighthBookAuthorCorrect() throws InterruptedException {
        bookStorePage.scrollToSeventhRow();
        Assert.assertEquals(bookStorePage.getAuthorOfEighthBookText(),"Nicholas C. Zakas");
    }

    @Test
    public void isEighthBookPublisherCorrect() throws InterruptedException {
        bookStorePage.scrollToSeventhRow();
        Assert.assertEquals(bookStorePage.getPublisherOfEighthBookText(),"No Starch Press");
    }

    @Test
    public void isSearchBarPlaceholderCorrect(){
        bookStorePage.scrollToSearchBar();
        Assert.assertEquals(bookStorePage.getSearchBarPlaceholder(),"Type to search");
    }

    @Test
    public void isBookSearchedBySearchBar() throws InterruptedException {
        bookStorePage.scrollToSearchBar();
        bookStorePage.typeOnSearchBar("GIT");
        Assert.assertTrue(bookStorePage.isBookTitleFound(bookStorePage.getTitleOfFirstBookText(),"Git"));
    }

    @Test
    public void validateSectionsSize(){
        Assert.assertEquals(bookStorePage.getSizeSections(),4);
    }
}

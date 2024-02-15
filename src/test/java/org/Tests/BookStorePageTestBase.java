package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookStorePageTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
        bookStorePage = homePage.clickOnSectionBookStoreApplication();
    }

    @Test
    public void validateURL(){
        Assert.assertEquals(bookStorePage.getBookStoreUrlText(),"https://demoqa.com/books");
    }

    @Test
    public void isFirstTitleOfTableCorrect() {
        Assert.assertEquals(bookStorePage.getFirstTitleTableText(), "Image");
    }

    @Test
    public void isSecondTitleOfTableCorrect() {
        Assert.assertEquals(bookStorePage.getSecondTitleTableText(),"Title");
    }

    @Test
    public void isThirdTitleOfTableCorrect() {
        Assert.assertEquals(bookStorePage.getThirdTitleTableText(),"Author");
    }

    @Test
    public void isFourthTitleOfTableCorrect() {
        Assert.assertEquals(bookStorePage.getFourthTitleTableText(),"Publisher");
    }

    @Test
    public void isFirstBookImageVisible() {
        Assert.assertTrue(bookStorePage.isVisibleFirstImage());
    }

    @Test
    public void isFirstBookTitleCorrect() {
        Assert.assertEquals(bookStorePage.getTitleOfFirstBookText(),"Git Pocket Guide");
    }

    @Test
    public void isFirstBookAuthorCorrect() {
        Assert.assertEquals(bookStorePage.getAuthorOfFirstBookText(),"Richard E. Silverman");
    }

    @Test
    public void isFirstBookPublisherCorrect() {
        Assert.assertEquals(bookStorePage.getPublisherOfFirstBookText(),"O'Reilly Media");
    }

    @Test
    public void isSecondBookImageVisible() {
        Assert.assertTrue(bookStorePage.isVisibleSecondImage());
    }

    @Test
    public void isSecondBookTitleCorrect() {
        Assert.assertEquals(bookStorePage.getTitleOfSecondBookText(),"Learning JavaScript Design Patterns");
    }

    @Test
    public void isSecondBookAuthorCorrect(){
        Assert.assertEquals(bookStorePage.getAuthorOfSecondBookText(),"Addy Osmani");
    }

    @Test
    public void isSecondBookPublisherCorrect() {
        Assert.assertEquals(bookStorePage.getPublisherOfSecondBookText(),"O'Reilly Media");
    }

    @Test
    public void isThirdBookImageVisible() {
        Assert.assertTrue(bookStorePage.isVisibleThirdImage());
    }

    @Test
    public void isThirdBookTitleCorrect() {
        Assert.assertEquals(bookStorePage.getTitleOfThirdBookText(),"Designing Evolvable Web APIs with ASP.NET");
    }

    @Test
    public void isThirdBookAuthorCorrect() {
        Assert.assertEquals(bookStorePage.getAuthorOfThirdBookText(),"Glenn Block et al.");
    }

    @Test
    public void isThirdBookPublisherCorrect() {
        Assert.assertEquals(bookStorePage.getPublisherOfThirdBookText(),"O'Reilly Media");
    }

    @Test
    public void isFourthBookImageVisible() {
        Assert.assertTrue(bookStorePage.isVisibleFourthImage());
    }

    @Test
    public void isFourthBookTitleCorrect() {
        Assert.assertEquals(bookStorePage.getTitleOfFourthBookText(),"Speaking JavaScript");
    }

    @Test
    public void isFourthBookAuthorCorrect() {
        Assert.assertEquals(bookStorePage.getAuthorOfFourthBookText(),"Axel Rauschmayer");
    }

    @Test
    public void isFourthBookPublisherCorrect() {
        Assert.assertEquals(bookStorePage.getPublisherOfFourthBookText(),"O'Reilly Media");
    }

    @Test
    public void isFifthBookImageVisible() {
        Assert.assertTrue(bookStorePage.isVisibleFifthImage());
    }

    @Test
    public void isFifthBookTitleCorrect() {
        Assert.assertEquals(bookStorePage.getTitleOfFifthBookText(),"You Don't Know JS");
    }

    @Test
    public void isFifthBookAuthorCorrect() {
        Assert.assertEquals(bookStorePage.getAuthorOfFifthBookText(),"Kyle Simpson");
    }

    @Test
    public void isFifthBookPublisherCorrect() {
        Assert.assertEquals(bookStorePage.getPublisherOfFifthBookText(),"O'Reilly Media");
    }

    @Test
    public void isSixthBookImageVisible() {
        Assert.assertTrue(bookStorePage.isVisibleSixthImage());
    }

    @Test
    public void isSixthBookTitleCorrect() {
        Assert.assertEquals(bookStorePage.getTitleOfSixthBookText(),"Programming JavaScript Applications");
    }

    @Test
    public void isSixthBookAuthorCorrect() {
        Assert.assertEquals(bookStorePage.getAuthorOfSixthBookText(),"Eric Elliott");
    }

    @Test
    public void isSixthBookPublisherCorrect() {
        Assert.assertEquals(bookStorePage.getPublisherOfSixthBookText(),"O'Reilly Media");
    }

    @Test
    public void isSeventhBookImageVisible() {
        Assert.assertTrue(bookStorePage.isVisibleSeventhImage());
    }

    @Test
    public void isSeventhBookTitleCorrect() {
        Assert.assertEquals(bookStorePage.getTitleOfSeventhBookText(),"Eloquent JavaScript, Second Edition");
    }

    @Test
    public void isSeventhBookAuthorCorrect() {
        Assert.assertEquals(bookStorePage.getAuthorOfSeventhBookText(),"Marijn Haverbeke");
    }

    @Test
    public void isSeventhBookPublisherCorrect() {
        Assert.assertEquals(bookStorePage.getPublisherOfSeventhBookText(),"No Starch Press");
    }

    @Test
    public void isEighthBookImageVisible() {
        bookStorePage.scrollToSeventhRow();
        Assert.assertTrue(bookStorePage.isVisibleEighthImage());
    }

    @Test
    public void isEighthBookTitleCorrect() {
        Assert.assertEquals(bookStorePage.getTitleOfEighthBookText(),"Understanding ECMAScript 6");
    }

    @Test
    public void isEighthBookAuthorCorrect() {
        Assert.assertEquals(bookStorePage.getAuthorOfEighthBookText(),"Nicholas C. Zakas");
    }

    @Test
    public void isEighthBookPublisherCorrect() {
        Assert.assertEquals(bookStorePage.getPublisherOfEighthBookText(),"No Starch Press");
    }

    @Test
    public void isSearchBarPlaceholderCorrect() {
        bookStorePage.scrollToSearchBar();
        Assert.assertEquals(bookStorePage.getSearchBarPlaceholder(),"Type to search");
    }

    @Test
    public void isBookSearchedBySearchBar() {
        bookStorePage.scrollToSearchBar();
        bookStorePage.typeOnSearchBar("GIT");
        Assert.assertTrue(bookStorePage.isBookTitleFound(bookStorePage.getTitleOfFirstBookText(),"Git"));
    }

    @Test
    public void validateSectionsSize(){
        Assert.assertEquals(bookStorePage.getSizeSections(),4);
    }
}

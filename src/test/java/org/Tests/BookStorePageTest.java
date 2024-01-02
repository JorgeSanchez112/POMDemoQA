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
    public void validateSectionsSize(){
        Assert.assertEquals(bookStorePage.getSizeSections(),4);
    }
}

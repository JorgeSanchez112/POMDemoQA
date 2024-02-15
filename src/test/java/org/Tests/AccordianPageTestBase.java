package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccordianPageTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
        accordianPage = homePage.clickOnSectionWidgets().clickOnAccordian();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(accordianPage.getPageTitleText(),"Accordian");
    }

    @Test
    public void isFirstTopicTitleCorrect(){
        Assert.assertEquals(accordianPage.getCard1TopicText(),"What is Lorem Ipsum?");
    }

    @Test
    public void isSecondTopicTitleCorrect(){
        Assert.assertEquals(accordianPage.getCard2TopicText(),"Where does it come from?");
    }

    @Test
    public void isThirdTopicTitleCorrect(){
        Assert.assertEquals(accordianPage.getCard3TopicText(),"Why do we use it?");
    }

    @Test
    public void validateFirstContentCardIsShown(){
        accordianPage.clickOnFirstCard();
        Assert.assertTrue(accordianPage.firstContentIsVisible());
    }

    @Test
    public void validateSecondContentCardIsShown(){
        accordianPage.clickOnSecondCard();
        Assert.assertTrue(accordianPage.secondContentIsVisible());
    }

    @Test
    public void validateThirdContentCardIsShown(){
        accordianPage.clickOnThirdCard();
        Assert.assertTrue(accordianPage.thirdContentIsVisible());
    }
}

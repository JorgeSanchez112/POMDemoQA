package org.Tests;

import TestComponents.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccordianTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        accordianPage = homePage.clickOnSectionWidgets().clickOnAccordian();
        accordianPage.hidePublicity(driver.findElement(By.cssSelector("#adplus-anchor > div")));
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

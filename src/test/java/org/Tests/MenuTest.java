package org.Tests;

import TestComponents.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MenuTest extends BaseTest {
    @BeforeClass
    public void initializeClassAndHideAdvertising(){
        menuPage = homePage.clickOnSectionWidgets().clickOnMenu();
        menuPage.hidePublicity(driver.findElement(By.cssSelector("#adplus-anchor > div")));
    }

    @Test
    public void validateMainItem1IsVisible(){
        Assert.assertTrue(menuPage.isMainItem1Displayed());
    }

    @Test
    public void validateMainItem2IsVisible(){
        Assert.assertTrue(menuPage.isMainItem2Displayed());
    }

    @Test
    public void validateMainItem3IsVisible(){
        Assert.assertTrue(menuPage.isMainItem3Displayed());
    }

    @Test
    public void validateSubItem1IsVisible(){
        menuPage.moveClickerToMainItem2();
        Assert.assertTrue(menuPage.isSubItem1Displayed());
    }

    @Test
    public void validateSubItem2IsVisible(){
        menuPage.moveClickerToMainItem2();
        Assert.assertTrue(menuPage.isSubItem2Displayed());
    }

    @Test
    public void validateSubSubListIsVisible(){
        menuPage.moveClickerToMainItem2();
        Assert.assertTrue(menuPage.isSubSubListDisplayed());
    }

    @Test
    public void validateSubSubItem1IsVisible(){
        menuPage.moveClickerToMainItem2();
        menuPage.moveClickerToSubSubList();
        Assert.assertTrue(menuPage.isSubSubItem1Displayed());
    }

    @Test
    public void validateSubSubItem2IsVisible(){
        menuPage.moveClickerToMainItem2();
        menuPage.moveClickerToSubSubList();
        Assert.assertTrue(menuPage.isSubSubItem2Displayed());
    }

}
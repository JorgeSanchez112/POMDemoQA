package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsPageTest extends BaseTest {

    @BeforeMethod
    public void initializeClass(){
       buttonsPage = homePage.clickOnSectionElements().clickOnButtonsSection();
    }

    @Test
    public void validateDoubleClickInABtn(){
        buttonsPage.clickOnDoubleBtn();
        Assert.assertEquals(buttonsPage.getDoubleClickMessage(),"You have done a double click");
    }

    @Test
    public void validateRightClickInABtn(){
        buttonsPage.clickOnRightBtn();
        Assert.assertEquals(buttonsPage.getRightClickMessage(),"You have done a right click");
    }

    @Test
    public void validateClickInABtn(){
        buttonsPage.clickOnClickMe();
        Assert.assertEquals(buttonsPage.getClickMeMessage(),"You have done a dynamic click");
    }

}

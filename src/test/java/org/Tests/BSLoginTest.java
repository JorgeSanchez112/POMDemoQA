package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BSLoginTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        bsLoginPage = homePage.clickOnSectionBookStoreApplication().clickOnLoginTab();
    }

    @Test
    public void isTitleLoginVisible(){
        Assert.assertTrue(bsLoginPage.isTitleVisible());
    }

    @Test
    public void isSubtitleCorrect(){
        Assert.assertEquals(bsLoginPage.getSubTitleText(), "Welcome,");
    }

    @Test
    public void isSubSubtitleCorrect(){
        Assert.assertEquals(bsLoginPage.getSubSubTitleText(), "Login in Book Store");
    }

    @Test
    public void isUsernameLabelCorrect(){
        Assert.assertEquals(bsLoginPage.getUsernameLabelText(), "UserName :");
    }

    @Test
    public void isPasswordLabelCorrect(){
        Assert.assertEquals(bsLoginPage.getPasswordLabelText(),"Password :");
    }

    @Test
    public void isTheUsernameInputContainingTheFilledValue(){
        bsLoginPage.refreshPage();
        bsLoginPage.typeOnUsernameInput("lolo");
        Assert.assertEquals(bsLoginPage.getUsernameInputValue(),"lolo");
    }

    @Test
    public void isThePasswordInputContainingTheFilledValue(){
        bsLoginPage.refreshPage();
        bsLoginPage.typeOnPasswordInput("1234");
        Assert.assertEquals(bsLoginPage.getPasswordInputValue(),"1234");
    }

    @Test
    public void isActiveRedBorderColorToNotFilledInputs() throws InterruptedException {
        bsLoginPage.refreshPage();
        bsLoginPage.clickOnLoginButton();
        Assert.assertEquals(bsLoginPage.getUsernameInputBorderColor(), "rgb(220, 53, 69)");
        Assert.assertEquals(bsLoginPage.getPasswordInputBorderColor(), "rgb(220, 53, 69)");
    }

    @Test
    public void isShowedCredentialsErrorMessage(){
        bsLoginPage.typeOnUsernameInput("lola");
        bsLoginPage.typeOnPasswordInput("123");
        bsLoginPage.clickOnLoginButton();
        Assert.assertTrue(bsLoginPage.isErrorMessageVisible());
    }

    @Test
    public void newUserButtonUsDirectedToRegister(){
        Assert.assertNotEquals(bsLoginPage.getCurrentUrl(), bsLoginPage.clickOnNewUserButton().getCurrentUrl());
        bsLoginPage.backToPage();
    }

}

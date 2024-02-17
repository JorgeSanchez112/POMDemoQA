package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BSLoginPageTest extends TestBase {
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
        bsLoginPage.typeOnUsernameInput("lolo");
        Assert.assertEquals(bsLoginPage.getUsernameInputValue(),"lolo");
    }

    @Test
    public void isThePasswordInputContainingTheFilledValue(){
        bsLoginPage.typeOnPasswordInput("1234");
        Assert.assertEquals(bsLoginPage.getPasswordInputValue(),"1234");
    }

    @Test
    public void isActiveRedBorderColorToNotFilledInputs(){
        bsLoginPage.clickOnLoginButton();
        Assert.assertEquals(bsLoginPage.getUsernameInputBorderColor(), prop.getProperty("RGBRedColor"));
        Assert.assertEquals(bsLoginPage.getPasswordInputBorderColor(), prop.getProperty("RGBRedColor"));
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
    }

}

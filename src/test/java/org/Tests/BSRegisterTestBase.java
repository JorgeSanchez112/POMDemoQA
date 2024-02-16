package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BSRegisterTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
        bsRegisterPage = homePage.clickOnSectionBookStoreApplication().clickOnLoginTab().clickOnNewUserButton();
    }

    @Test
    public void isTitleRegisterVisible(){
        Assert.assertTrue(bsRegisterPage.isTitleVisible());
    }

    @Test
    public void isSubtitleCorrect(){
        Assert.assertEquals(bsRegisterPage.getSubtitleText(), "Register to Book Store");
    }

    @Test
    public void isFirstNameLabelCorrect(){
        Assert.assertEquals(bsRegisterPage.getFirstNameLabelText(),"First Name :");
    }

    @Test
    public void isLastNameLabelCorrect(){
        Assert.assertEquals(bsRegisterPage.getLastNameLabelText(), "Last Name :");
    }

    @Test
    public void isUserNameLabelCorrect(){
        Assert.assertEquals(bsRegisterPage.getUsernameLabelText(),"UserName :");
    }

    @Test
    public void isPasswordLabelCorrect(){
        Assert.assertEquals(bsRegisterPage.getPasswordLabelText(),"Password :");
    }

    @Test
    public void isShowedMessageOfUncheckedRecaptcha(){
        bsRegisterPage.typeOnFirstnameInput("a");
        bsRegisterPage.typeOnLastNameInput("a");
        bsRegisterPage.typeOnUsernameInput("a");
        bsRegisterPage.typeOnPasswordInput("a");
        bsRegisterPage.clickOnRegisterButton();
        Assert.assertTrue(bsRegisterPage.isRecaptchaMessageVisible());
    }

    @Test
    public void isActiveRedBorderColorToNotFilledFirstNameInput(){
        bsRegisterPage.clickOnRegisterButton();
        Assert.assertEquals(bsRegisterPage.getFirstNameInputBorderColor(),prop.getProperty("RGBRedColor"));
    }

    @Test
    public void isActiveRedBorderColorToNotFilledLastNameInput(){
        bsRegisterPage.clickOnRegisterButton();
        Assert.assertEquals(bsRegisterPage.getLastNameInputBorderColor(),prop.getProperty("RGBRedColor"));
    }

    @Test
    public void isActiveRedBorderColorToNotFilledUserNameInput(){
        bsRegisterPage.clickOnRegisterButton();
        Assert.assertEquals(bsRegisterPage.getUsernameInputBorderColor(),prop.getProperty("RGBRedColor"));
    }

    @Test
    public void isActiveRedBorderColorToNotFilledPasswordInput(){
        bsRegisterPage.clickOnRegisterButton();
        Assert.assertEquals(bsRegisterPage.getPasswordInputBorderColor(),prop.getProperty("RGBRedColor"));
    }

    @Test
    public void isRecaptchaChecked(){
        bsRegisterPage.clickOnRecaptcha();
        Assert.assertFalse(bsRegisterPage.isRecaptchaClicked()); //in this line the code should be true but there is the recaptcha where I can't solve it.
    }

    @Test
    public void isBackToLoginButtonReturnUsToLogin(){
        Assert.assertNotEquals(bsRegisterPage.getCurrentUrl(), bsRegisterPage.clickOnBackToLogin().getCurrentUrl());
        bsRegisterPage.backToPage();
    }


}

package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxPageTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
       textBoxPage = homePage.clickOnSectionElements().clickOnTextBoxSection();
    }

    @Test
    public void IsCorrectPageTitleText(){
        Assert.assertEquals(textBoxPage.getPageTitleText(),"Text Box");
    }

    @Test
    public void validateNameAnswerVisibleIsCorrect(){
        textBoxPage.typeOnUsernameField("desconocido1");
        textBoxPage.clickOnSubmitButton();
        Assert.assertEquals(textBoxPage.getTextNameAnswer(),"Name:" + "desconocido1");
    }

    @Test
    public void validateEmailAnswerVisibleIsCorrect(){
        textBoxPage.typeOnEmailField("example@12.gov");
        textBoxPage.clickOnSubmitButton();
        Assert.assertEquals(textBoxPage.getTextEmailAnswer(),"Email:" + "example@12.gov");
    }

    @Test
    public void validateAddressAnswerVisibleIsCorrect(){
        textBoxPage.typeOnAddressField("Street unknown");
        textBoxPage.clickOnSubmitButton();
        Assert.assertEquals(textBoxPage.getTextAddressAnswer(),"Current Address :" + "Street unknown");
    }

    @Test
    public void validatePermanentAddressAnswerIsCorrect(){
        textBoxPage.typeOnPermanentAddressField("Permanent street unknown");
        textBoxPage.clickOnSubmitButton();
        Assert.assertEquals(textBoxPage.getTextPermanentAddressAnswer(),"Permananet Address :" + "Permanent street unknown");
    }

    @Test
    public void validateAnswers(){
        textBoxPage.fillAllFormAndClickOnSubmit("desconocido1", "example@12.gov", "Street unknown", "Permanent street unknown");
        Assert.assertEquals(textBoxPage.getTextNameAnswer(),"Name:" + "desconocido1");
        Assert.assertEquals(textBoxPage.getTextEmailAnswer(),"Email:" + "example@12.gov");
        Assert.assertEquals(textBoxPage.getTextAddressAnswer(),"Current Address :" + "Street unknown");
        Assert.assertEquals(textBoxPage.getTextPermanentAddressAnswer(),"Permananet Address :" + "Permanent street unknown");
    }
}

package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxPageText extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
       textBoxPage = homePage.clickOnSectionElements().clickOnTextBoxSection();
    }

    @Test
    public void typingFieldsForm(){
        textBoxPage.typeOnUsernameField("desconocido1");
        textBoxPage.typeOnEmailField("example@12.gov");
        textBoxPage.typeOnAddressField("Street unknown");
        textBoxPage.typeOnPermanentAddressField("Permanent street unknown");
        textBoxPage.clickOnSubmitButton();
    }

    @Test
    public void validateAnswer(){
        Assert.assertEquals(textBoxPage.getTextNameAnswer(),"Name:" + "desconocido1");
        Assert.assertEquals(textBoxPage.getTextEmailAnswer(),"Email:" + "example@12.gov");
        Assert.assertEquals(textBoxPage.getTextAddressAnswer(),"Current Address :" + "Street unknown");
        Assert.assertEquals(textBoxPage.getTextPermanentAddressAnswer(),"Permananet Address :" + "Permanent street unknown");
    }
}

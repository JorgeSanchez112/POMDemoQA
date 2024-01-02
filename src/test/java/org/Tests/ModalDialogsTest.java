package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ModalDialogsTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        modalDialogsPage = homePage.clickOnSectionAlerts_Frame_Windows().clickOnModalDialogs();
    }

    @Test
    public void validateSmallModalShowed(){
        modalDialogsPage.clickOnSmallModalButton();
        Assert.assertEquals(modalDialogsPage.getSmallModalText(), "This is a small modal. It has very less content");
    }

    @Test
    public void validateLargeModalShowed(){
        modalDialogsPage.clickOnLargeModalButton();
        Assert.assertEquals(modalDialogsPage.getLargeModalText(), "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
    }
}

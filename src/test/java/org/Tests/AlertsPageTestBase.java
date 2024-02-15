package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsPageTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
        alertsPage = homePage.clickOnSectionAlerts_Frame_Windows().clickOnAlerts();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(alertsPage.getPageTitleText(),"Alerts");
    }

    @Test
    public void validateFirstLabelIsVisible(){
        Assert.assertTrue(alertsPage.isFirstLabelVisible());
    }

    @Test
    public void validateSecondLabelIsVisible(){
        Assert.assertTrue(alertsPage.isSecondLabelVisible());
    }

    @Test
    public void validateThirdLabelIsVisible(){
        Assert.assertTrue(alertsPage.isThirdLabelVisible());
    }

    @Test
    public void validateFourthLabelIsVisible(){
        Assert.assertTrue(alertsPage.isFourthLabelVisible());
    }

    @Test
    public void validateAlert(){
        alertsPage.clickOnFirstButton();
        alertsPage.acceptAlert();
    }

    @Test
    public void validateAlertAppear(){
        alertsPage.clickOnSecondButton();
        alertsPage.acceptAlert();
    }

    @Test
    public void validateDismissAlert(){
        alertsPage.clickOnThirdButton();
        alertsPage.dismissAlert();
        Assert.assertEquals(alertsPage.getConfirmResultText(),"You selected Cancel");
    }

    @Test
    public void validateInputAlert(){
        alertsPage.clickOnFourthButton();
        alertsPage.typeInAlert("lolada");
        Assert.assertEquals(alertsPage.getInputAlertText(), "You entered lolada");
    }
}

package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertsTest extends BaseTest {
    @BeforeClass
    public void initializeClass(){
        alerts = homePage.clickOnSectionAlerts_Frame_Windows().clickOnAlerts();
    }

    @Test
    public void validateAlert(){
        alerts.clickOnFirstButton();
        alerts.acceptAlert();
    }

    @Test
    public void validateAlertAppear(){
        alerts.clickOnSecondButton();
        alerts.waitAlert();
        alerts.acceptAlert();
    }

    @Test
    public void validateDismissAlert(){
        alerts.clickOnThirdButton();
        alerts.dismissAlert();
        Assert.assertEquals(alerts.getConfirmResultText(),"You selected Cancel");
    }

    @Test
    public void validateInputAlert(){
        alerts.clickOnFourthButton();
        alerts.typeInAlert("lolada");
        Assert.assertEquals(alerts.getInputAlertText(), "You entered lolada");
    }
}

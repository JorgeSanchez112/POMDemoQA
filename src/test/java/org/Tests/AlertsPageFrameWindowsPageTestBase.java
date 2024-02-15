package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsPageFrameWindowsPageTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
        alertsFrameWindowsPage = homePage.clickOnSectionAlerts_Frame_Windows();
    }

    @Test
    public void validateURL(){
        Assert.assertEquals(alertsFrameWindowsPage.getAlertFrameWindowsUrl(),"https://demoqa.com/alertsWindows");
    }

    @Test
    public void validateSectionsSize(){
        Assert.assertEquals(alertsFrameWindowsPage.getSizeSections(),5);
    }
}

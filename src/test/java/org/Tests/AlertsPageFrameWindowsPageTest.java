package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsPageFrameWindowsPageTest extends BaseTest {
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

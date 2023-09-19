package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertsFrameWindowsPageTest extends BaseTest {
    @BeforeClass
    public void initializeClass(){
        alertsFrameWindowsPage = homePage.clickOnSectionAlerts_Frame_Windows();
    }

    @Test
    public void validateURL(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/alertsWindows");
    }

    @Test
    public void validateSectionsSize(){
        Assert.assertEquals(alertsFrameWindowsPage.getSizeSections(),5);
    }
}

package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BrowserWindowsPageTest extends TestBase {
    @BeforeMethod
    public void InitializeClass(){
        browserWindows = homePage.clickOnSectionAlerts_Frame_Windows().clickOnBrowserWindows();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(browserWindows.getPageTitleText(), "Browser Windows");

    }

    @Test
    public void validateChangeOfTab(){
        browserWindows.clickOnNewTabButton();
        browserWindows.switchToTab();
        Assert.assertEquals(browserWindows.getBrowserWindowsUrlText(),browserWindows.getUrlOfNewTabAndWindow());
        Assert.assertTrue(browserWindows.newTabTextIsVisible());
    }

    @Test
    public void validateNewWindowAppear(){
        browserWindows.clickOnNewWindowButton();
        browserWindows.switchToTab();
        Assert.assertEquals(browserWindows.getBrowserWindowsUrlText(),browserWindows.getUrlOfNewTabAndWindow());
        Assert.assertTrue(browserWindows.newTabTextIsVisible());
    }

    @Test
    public void validateNewWindowMessage(){
        browserWindows.clickOnNewWindowMessageButton();
        browserWindows.switchToTab();
        Assert.assertEquals(browserWindows.getMessageOfNewWindow(), "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");
    }

}

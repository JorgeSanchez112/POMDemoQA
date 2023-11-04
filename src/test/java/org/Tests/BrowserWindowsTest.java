package org.Tests;

import TestComponents.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class BrowserWindowsTest extends BaseTest {
    @BeforeClass
    public void InitializeClass(){
        browserWindows = homePage.clickOnSectionAlerts_Frame_Windows().clickOnBrowserWindows();
    }

    @Test
    public void validateChangeOfTab(){
        browserWindows.clickOnNewTabButton();
        browserWindows.switchToTab();
        Assert.assertEquals(driver.getCurrentUrl(),browserWindows.getUrlOfNewTabAndWindow());
        Assert.assertTrue(browserWindows.newTabTextIsVisible());
        driver.close();
        browserWindows.switchToBasePage();
    }

    @Test
    public void validateNewWindowAppear(){
        browserWindows.clickOnNewWindowButton();
        browserWindows.switchToTab();
        Assert.assertEquals(driver.getCurrentUrl(),browserWindows.getUrlOfNewTabAndWindow());
        Assert.assertTrue(browserWindows.newTabTextIsVisible());
        driver.close();
        browserWindows.switchToBasePage();
    }

    @Test
    public void validateNewWindowMessage(){
        browserWindows.clickOnNewWindowMessageButton();
        browserWindows.switchToTab();
        browserWindows.validateMessageOfNewWindow();
        driver.close();
        browserWindows.switchToBasePage();
    }

}

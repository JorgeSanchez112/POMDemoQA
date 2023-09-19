package org.Pages;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest extends BaseTest {
    @Test
    public void validateURL() {

        basePage.clickOnSectionElements();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/elements");
    }
}

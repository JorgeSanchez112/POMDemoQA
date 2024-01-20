package org.Tests;


import Pages.HomePage;
import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseHomePageTest extends BaseTest {
    @Test
    public void validateURL() {
        Assert.assertEquals(homePage.getHomePageUrlText(),"https://demoqa.com/");
    }
}

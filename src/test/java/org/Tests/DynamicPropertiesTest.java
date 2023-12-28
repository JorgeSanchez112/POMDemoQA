package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicPropertiesTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        dynamicProperties = homePage.clickOnSectionElements().clickOnDynamicPropertiesSection();
    }

    @Test
    public void validateFirstButtonIsEnable(){
        Assert.assertTrue(dynamicProperties.buttonIsEnable());
    }

    @Test
    public void validateSecondButtonTextColorChange(){
        Assert.assertEquals(dynamicProperties.getButtonTextColor(), "rgba(220, 53, 69, 1)");
    }

    @Test
    public void validateThirdButtonIsVisible(){
        Assert.assertTrue(dynamicProperties.buttonIsVisible());
    }
}

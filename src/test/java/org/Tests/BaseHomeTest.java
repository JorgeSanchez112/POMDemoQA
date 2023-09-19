package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseHomeTest extends BaseTest {
    @Test
    public void validateURL() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/");
    }
}

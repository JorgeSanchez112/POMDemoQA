package org.Tests;

import TestComponents.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        sliderPage = homePage.clickOnSectionWidgets().clickOnSlider();
    }

    @Test
    public void ValidateRangeInputToMinValue(){
        sliderPage.changeRangeInputToMinValue();
        Assert.assertEquals(sliderPage.getValueTextOfInputRange(),sliderPage.getContainerValueText());
    }

    @Test
    public void ValidateRangeInputToMaxValue(){
        sliderPage.changeRangeInputToMaxValue();
        Assert.assertEquals(sliderPage.getValueTextOfInputRange(),sliderPage.getContainerValueText());
    }
}

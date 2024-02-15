package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderPageTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
        sliderPage = homePage.clickOnSectionWidgets().clickOnSlider();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(sliderPage.getPageTitleText(),"Slider");

    }

    @Test
    public void validateRangeInputToMinValue(){
        sliderPage.changeRangeInputToMinValue();
        Assert.assertEquals(sliderPage.getValueTextOfInputRange(),sliderPage.getContainerValueText());
    }

    @Test
    public void validateRangeInputToMaxValue(){
        sliderPage.changeRangeInputToMaxValue();
        Assert.assertEquals(sliderPage.getValueTextOfInputRange(),sliderPage.getContainerValueText());
    }
}

package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DatePickerTest extends BaseTest {
    @BeforeClass
    public void initializeClass(){
        datePickerPage = homePage.clickOnSectionWidgets().clickOnDatePicker();
    }

    @Test
    public void validateDateSelected(){
        datePickerPage.clickOnDateInput();
        datePickerPage.selectDate("July","22","2022");
        Assert.assertEquals(datePickerPage.getDateValueText(),"07/22/2022");
    }

    @Test
    public void validateDateTimeSelected(){
        datePickerPage.clickOnDateAndTimeInput();
        datePickerPage.selectDateAndTime("May","30","2022","20:00");
        Assert.assertEquals(datePickerPage.getDateTimeValueText(),"May 30, 2022 8:00 PM");
    }
}

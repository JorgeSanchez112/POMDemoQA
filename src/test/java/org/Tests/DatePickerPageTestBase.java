package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePickerPageTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
        datePickerPage = homePage.clickOnSectionWidgets().clickOnDatePicker();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(datePickerPage.getPageTitleText(),"Date Picker");
    }
    
    @Test
    public void validateCorrectDateLabel(){
        Assert.assertEquals(datePickerPage.getDateLabelText(),"Select Date");
    }

    @Test
    public void validateCorrectDateTimeLabel(){
        Assert.assertEquals(datePickerPage.getDateTimeLabelText(),"Date And Time");
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

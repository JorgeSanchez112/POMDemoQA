package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTablesPageTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        webTablesPage = homePage.clickOnSectionElements().clickOnWebTablesSection();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(webTablesPage.getPageTitleText(), "Web Tables");
    }

    @Test
    public void validateSearchBoxResult(){
        webTablesPage.typeOnSearchBox("Kierra");
        Assert.assertEquals(webTablesPage.getFirstNameOfFirstRow(),"Kierra");
    }

    @Test
    public void validateAllRowsEmpty(){
        webTablesPage.clickOnDeleteThirdRow();
        webTablesPage.clickOnDeleteSecondRow();
        webTablesPage.clickOnDeleteFirstRow();

        Assert.assertEquals(webTablesPage.getTextOfMessageNoRowsFound(), "No rows found");
    }

    @Test
    public void validateCorrectNewRow(){
        webTablesPage.createRegistrationForm("Aleatorio", "apellido", "locosaurio@loco.com", "12", "1000000", "IT");

        Assert.assertEquals(webTablesPage.getFirstNameOfFourthRow(),"Aleatorio");
        Assert.assertEquals(webTablesPage.getLastNameOfFourthRow(),"apellido");
        Assert.assertEquals(webTablesPage.getEmailOfFourthRow(),"locosaurio@loco.com");
        Assert.assertEquals(webTablesPage.getAgeOfFourthRow(),"12");
        Assert.assertEquals(webTablesPage.getSalaryOfFourthRow(),"1000000");
        Assert.assertEquals(webTablesPage.getDepartmentOfFourthRow(),"IT");
    }
}

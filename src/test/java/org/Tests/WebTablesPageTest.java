package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTablesPageTest extends BaseTest {
    @BeforeMethod
    public void initializeClass(){
        webTablesPage = homePage.clickOnSectionElements().clickOnWebTablesSection();
    }

    @Test
    public void validateAllRowsEmpty(){
        webTablesPage.clickOnDeleteThirdRow();
        webTablesPage.clickOnDeleteSecondRow();
        webTablesPage.clickOnDeleteFirstRow();

        Assert.assertEquals(webTablesPage.getTextOfMessage(), "No rows found");
    }

    @Test
    public void validateCorrectNewRow(){
        webTablesPage.clickOnAddButton();
        webTablesPage.fillFirstName("Aleatorio");
        webTablesPage.fillLastName("apellido");
        webTablesPage.fillEmail("locosaurio@loco.com");
        webTablesPage.fillAge("12");
        webTablesPage.fillSalary("1000000");
        webTablesPage.fillDepartment("IT");
        webTablesPage.clickOnSubmitButton();

        Assert.assertEquals(webTablesPage.getFirstName(),"Aleatorio");
        Assert.assertEquals(webTablesPage.getLastName(),"apellido");
        Assert.assertEquals(webTablesPage.getEmail(),"locosaurio@loco.com");
        Assert.assertEquals(webTablesPage.getAge(),"12");
        Assert.assertEquals(webTablesPage.getSalary(),"1000000");
        Assert.assertEquals(webTablesPage.getDepartment(),"IT");
    }
}

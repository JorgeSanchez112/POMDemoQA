package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectMenuPageTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
        selectMenuPage = homePage.clickOnSectionWidgets().clickOnSelectMenu();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(selectMenuPage.getPageTitleText(),"Select Menu");
    }

    @Test
    public void validateCorrectSelectValueLabel(){
        Assert.assertEquals(selectMenuPage.getValueLabelText(),"Select Value");
    }

    @Test
    public void selectValueByDropdown(){
        selectMenuPage.clickOnSelectValueContainer();
        selectMenuPage.downOneOptionInSelectValueDropDown();
        selectMenuPage.enterActionInSelectValueDropDown();
        Assert.assertEquals(selectMenuPage.getSelectValueContainerText()," option Group 1, option 2, selected.\n" +
                "Group 1, option 2");
    }

    @Test
    public void validateCorrectSelectOneLabel(){
        Assert.assertEquals(selectMenuPage.getOneLabelText(),"Select One");
    }

    @Test
    public void selectOneByDropdown(){
        selectMenuPage.clickOnSelectOneContainer();
        selectMenuPage.downOneOptionInSelectOneDropDown();
        selectMenuPage.enterActionInSelectOneDropDown();
        Assert.assertEquals(selectMenuPage.getSelectOneContainerText(), " option Mr., selected.\n" +
                "Mr.");
    }

    @Test
    public void validateCorrectOldStyleSelectLabel(){
        Assert.assertEquals(selectMenuPage.getOldStyleSelectLabelText(),"Old Style Select Menu");
    }

    @Test
    public void selectValueInOldSelectMenu(){
        selectMenuPage.selectValueOnOldStyleSelectMenu();
        Assert.assertEquals(selectMenuPage.getSelectValueOnOldStyleSelectMenuText(),"6");
    }

    @Test
    public void validateCorrectMultiselectDropdownLabel(){
        Assert.assertEquals(selectMenuPage.getMultiSelectDropdownLabelText(),"Multiselect drop down");

    }

    @Test
    public void selectMultiplyValuesInDropdown(){
        selectMenuPage.clickOnMultiSelectDropdownContainer();
        selectMenuPage.downOneOptionInMultiSelectDropDown();
        selectMenuPage.enterActionInMultiSelectDropDown();
        selectMenuPage.enterActionInMultiSelectDropDown();
        selectMenuPage.enterActionInMultiSelectDropDown();
        selectMenuPage.enterActionInMultiSelectDropDown();
        Assert.assertEquals(selectMenuPage.getGreenValueTextOfMultiplyDropdown(),"Green");
        Assert.assertEquals(selectMenuPage.getBlueValueTextOfMultiplyDropdown(),"Blue");
        Assert.assertEquals(selectMenuPage.getBlackValueTextOfMultiplyDropdown(),"Black");
        Assert.assertEquals(selectMenuPage.getRedValueTextOfMultiplyDropdown(),"Red");
    }

    @Test
    public void validateCorrectStandardMultiSelectLabel(){
        Assert.assertEquals(selectMenuPage.getStandardMultiSelectLabelText(),"Standard multi select");
    }

    @Test
    public void selectMultiplyValuesOnStandardMultiSelect(){
        selectMenuPage.scrollAndSelectValueOnStandardMultiSelect("Volvo");
        selectMenuPage.scrollAndSelectValueOnStandardMultiSelect("Saab");
        selectMenuPage.scrollAndSelectValueOnStandardMultiSelect("Opel");
        selectMenuPage.scrollAndSelectValueOnStandardMultiSelect("Audi");
        Assert.assertTrue(selectMenuPage.isVolvoSelectedOfStandardMultiSelect());
        Assert.assertTrue(selectMenuPage.isSaabSelectedOfStandardMultiSelect());
        Assert.assertTrue(selectMenuPage.isOpelSelectedOfStandardMultiSelect());
        Assert.assertTrue(selectMenuPage.isAudiSelectedOfStandardMultiSelect());
    }

}

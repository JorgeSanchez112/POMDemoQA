package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectMenuTest extends BaseTest {
    @BeforeClass
    public void initializeClass(){
        selectMenuPage = homePage.clickOnSectionWidgets().clickOnSelectMenu();
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
    public void selectOneByDropdown(){
        selectMenuPage.clickOnSelectOneContainer();
        selectMenuPage.downOneOptionInSelectOneDropDown();
        selectMenuPage.enterActionInSelectOneDropDown();
        Assert.assertEquals(selectMenuPage.getSelectOneContainerText(), " option Mr., selected.\n" +
                "Mr.");
    }

    @Test
    public void selectValueInOldSelectMenu(){
        selectMenuPage.selectValueOnOldStyleSelectMenu();
        Assert.assertEquals(selectMenuPage.getSelectValueOnOldStyleSelectMenuText(),"6");
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

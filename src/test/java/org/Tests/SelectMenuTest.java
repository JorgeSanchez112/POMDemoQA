package org.Tests;

import TestComponents.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectMenuTest extends BaseTest {
    @BeforeClass
    public void initializeClass(){
        selectMenuPage = homePage.clickOnSectionWidgets().clickOnSelectMenu();
    }

    @Test
    public void test1(){
        selectMenuPage.clickOnSelectValueContainer();
        selectMenuPage.downOneOptionInDropDown();
        selectMenuPage.getSelectValueContainerText();
    }
}

package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectableTest extends BaseTest {
    @BeforeClass
    public void initializeClass(){
        selectablePage = homePage.clickOnSectionInteractions().clickOnSelectable();
    }

    @Test
    public void validateCrasJustoOdioListElementIsSelectable(){
        selectablePage.clickOnTabList();
        selectablePage.clickOnCrasJustoOdioListElement();
        Assert.assertTrue(selectablePage.isCrasJustoOdioListElementSelected());
    }

    @Test
    public void validateDapibusAcFacilisisInListElementIsSelectable(){
        selectablePage.clickOnTabList();
        selectablePage.clickOnDapibusAcFacilisisInListElement();
        Assert.assertTrue(selectablePage.isDapibusAcFacilisisInListElementSelected());
    }

    @Test
    public void validateMorbiLeoRisusListElementIsSelectable(){
        selectablePage.clickOnTabList();
        selectablePage.clickOnMorbiLeoRisusListElement();
        Assert.assertTrue(selectablePage.isMorbiLeoRisusListElementSelected());
    }

    @Test
    public void validatePortaAcConsecteturAcListElementIsSelectable(){
        selectablePage.clickOnTabList();
        selectablePage.clickOnPortaAcConsecteturAcListElement();
        Assert.assertTrue(selectablePage.isPortaAcConsecteturAcListElementSelected());
    }

    @Test
    public void validateOneGridElementIsSelectable(){
        selectablePage.clickOnTabGrid();
        selectablePage.clickOnOneGridElement();
        Assert.assertTrue(selectablePage.isOneGridElementSelected());
    }

    @Test
    public void validateTwoGridElementIsSelectable(){
        selectablePage.clickOnTabGrid();
        selectablePage.clickOnTwoGridElement();
        Assert.assertTrue(selectablePage.isTwoGridElementSelected());
    }

    @Test
    public void validateThreeGridElementIsSelectable(){
        selectablePage.clickOnTabGrid();
        selectablePage.clickOnThreeGridElement();
        Assert.assertTrue(selectablePage.isThreeGridElementSelected());
    }

    @Test
    public void validateFourGridElementIsSelectable(){
        selectablePage.clickOnTabGrid();
        selectablePage.clickOnFourGridElement();
        Assert.assertTrue(selectablePage.isFourGridElementSelected());
    }

    @Test
    public void validateFiveGridElementIsSelectable(){
        selectablePage.clickOnTabGrid();
        selectablePage.clickOnFiveGridElement();
        Assert.assertTrue(selectablePage.isFiveGridElementSelected());
    }

    @Test
    public void validateSixGridElementIsSelectable(){
        selectablePage.clickOnTabGrid();
        selectablePage.clickOnSixGridElement();
        Assert.assertTrue(selectablePage.isSixGridElementSelected());
    }

    @Test
    public void validateSevenGridElementIsSelectable(){
        selectablePage.clickOnTabGrid();
        selectablePage.clickOnSevenGridElement();
        Assert.assertTrue(selectablePage.isSevenGridElementSelected());
    }

    @Test
    public void validateEightGridElementIsSelectable(){
        selectablePage.clickOnTabGrid();
        selectablePage.clickOnEightGridElement();
        Assert.assertTrue(selectablePage.isEightGridElementSelected());
    }

    @Test
    public void validateNineGridElementIsSelectable(){
        selectablePage.clickOnTabGrid();
        selectablePage.clickOnNineGridElement();
        Assert.assertTrue(selectablePage.isNineGridElementSelected());
    }
}

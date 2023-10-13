package org.Tests;

import TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticeFormPageTest extends BaseTest {
    @BeforeClass
    public void initializeClass(){
        practiceFormPage = homePage.clickOnSectionForms().clickOnPracticeFormSection();
    }

    @Test
    public void validateTitle(){
        Assert.assertEquals(practiceFormPage.getTextFormTitle(),"Student Registration Form");
    }

    @Test
    public void crazyThings(){
        practiceFormPage.SelectOneGender("Female");
    }

    @Test
    public void validateLabelName(){
        Assert.assertEquals(practiceFormPage.getTextOfLabelName(), "Name");
    }

    @Test
    public void validateLabelEmail(){
        Assert.assertEquals(practiceFormPage.getTextOfLabelEmail(), "Email");
    }

    @Test
    public void validateLabelGender(){
        Assert.assertEquals(practiceFormPage.getTextOfLabelGender(), "Gender");
    }

    @Test
    public void validateLabelMobile(){
        Assert.assertEquals(practiceFormPage.getTextOfLabelMobile(), "Mobile(10 Digits)");
    }

    @Test
    public void validateLabelBirthDate(){
        Assert.assertEquals(practiceFormPage.getTextOfLabelDateOfBirth(), "Date of Birth");
    }

    @Test
    public void validateLabelSubjects(){
        Assert.assertEquals(practiceFormPage.getTextOfLabelSubjects(), "Subjects");
    }

    @Test
    public void validateLabelHobbies(){
        Assert.assertEquals(practiceFormPage.getTextOfLabelHobbies(), "Hobbies");
    }
    @Test
    public void validateLabelPicture(){
        Assert.assertEquals(practiceFormPage.getTextOfLabelPicture(), "Picture");
    }
    @Test
    public void validateLabelCurrentAddress(){
        Assert.assertEquals(practiceFormPage.getTextOfLabelCurrentAddress(), "Current Address");
    }

    @Test
    public void validateLabelsStateAndCity() {
        Assert.assertEquals(practiceFormPage.getTextOfLabelStateCity(), "State and City");
    }

    @Test
    public void validatePlaceholderFirstNameField(){
        Assert.assertEquals(practiceFormPage.getPlaceholderFirstNameField(), "First Name");
    }

    @Test
    public void validatePlaceholderLastNameField(){
        Assert.assertEquals(practiceFormPage.getPlaceholderLastNameField(), "Last Name");
    }

    @Test
    public void validatePlaceholderEmailField(){
        Assert.assertEquals(practiceFormPage.getPlaceholderEmailField(), "name@example.com");
    }

    @Test
    public void validatePlaceholderMobileField(){
        Assert.assertEquals(practiceFormPage.getPlaceholderMobileField(), "Mobile Number");
    }

    @Test
    public void validatePlaceholderCurrentAddressField(){
        Assert.assertEquals(practiceFormPage.getPlaceholderCurrentAddressField(), "Current Address");
    }

    @Test
    public void validatePlaceholderStateListBox(){
        Assert.assertEquals(practiceFormPage.getPlaceholderStatesListBox(), "Select State");
    }

    @Test
    public void validatePlaceholderCityListBox(){
        Assert.assertEquals(practiceFormPage.getPlaceholderCitiesListBox(), "Select City");
    }

    @Test
    public void validateMandatoryFields(){
        practiceFormPage.EnterToSubmitButton();
        System.out.println(practiceFormPage.getCssAttributeFirstNameField());
        System.out.println(practiceFormPage.getCssAttributeLastNameField());
        System.out.println(practiceFormPage.getCssAttributeEmailField());
        System.out.println(practiceFormPage.getCssAttributeGenderRadioButtons());
        System.out.println(practiceFormPage.getCssAttributeMobileField());
        System.out.println(practiceFormPage.getCssAttributeBirthDateField());
        System.out.println(practiceFormPage.getCssAttributeMusicCheckboxButton());
        System.out.println(practiceFormPage.getCssAttributeCurrentAddressField());
    }

}

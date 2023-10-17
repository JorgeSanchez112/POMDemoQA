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
        practiceFormPage.selectOneGender("Female");
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
        driver.navigate().refresh();//refresh the page of previous actions
        practiceFormPage.EnterToSubmitButton();
        Assert.assertEquals(practiceFormPage.getCssAttributeFirstNameField(), "rgb(220, 53, 69)");
        Assert.assertEquals(practiceFormPage.getCssAttributeLastNameField(), "rgb(220, 53, 69)");
        Assert.assertEquals(practiceFormPage.getCssAttributeEmailField(), "rgb(40, 167, 69)");
        Assert.assertEquals(practiceFormPage.getCssAttributeGenderRadioButtons(), "rgba(220, 53, 69, 1)");
        Assert.assertEquals(practiceFormPage.getCssAttributeMobileField(), "rgb(220, 53, 69)");
        Assert.assertEquals(practiceFormPage.getCssAttributeBirthDateField(), "rgb(40, 167, 69)");
        Assert.assertEquals(practiceFormPage.getCssAttributeMusicCheckboxButton(), "rgb(40, 167, 69)");
        Assert.assertEquals(practiceFormPage.getCssAttributeCurrentAddressField(), "rgb(40, 167, 69)");
    }

    @Test
    public void fillTheFormCorrectly(){
        practiceFormPage.typeInFirstNameField("name");
        practiceFormPage.typeInLastNameField("lastname");
        practiceFormPage.typeInEmailField("email@test.qaz");
        practiceFormPage.selectOneGender("Other");
        practiceFormPage.typeInMobileField("1234567891");
        practiceFormPage.typeInBirthDateField("11 Feb 2004");
        practiceFormPage.typeInSubjectField("Maths");
        practiceFormPage.clickOnMusicCheckBoxButton();
        practiceFormPage.selectAPicture("C:\\Users\\Jorge\\Pictures\\Captura.png");
        practiceFormPage.typeInCurrentAddressField("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        practiceFormPage.typeInStateListBox("NCR");
        practiceFormPage.typeInCityListBox("Delhi");
        practiceFormPage.EnterToSubmitButton();
    }

}

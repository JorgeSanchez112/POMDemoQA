package org.Tests;

import TestComponents.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeFormPageTestBase extends TestBase {
    @BeforeMethod
    public void initializeClass(){
        practiceFormPage = homePage.clickOnSectionForms().clickOnPracticeFormSection();
    }

    @Test
    public void validateCorrectPageTitle(){
        Assert.assertEquals(practiceFormPage.getPageTitleText(),"Practice Form");
    }

    @Test
    public void validateTitle(){
        Assert.assertEquals(practiceFormPage.getTextFormTitle(),"Student Registration Form");
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
    public void validateBorderColorOfFirstNameField(){
        practiceFormPage.enterToSubmitButton();
        Assert.assertEquals(practiceFormPage.getCssAttributeFirstNameField(), prop.getProperty("RGBRedColor"));
    }

    @Test
    public void validateBorderColorOfLastNameField(){
        practiceFormPage.enterToSubmitButton();
        Assert.assertEquals(practiceFormPage.getCssAttributeLastNameField(), prop.getProperty("RGBRedColor"));
    }

    @Test
    public void validateBorderColorOfEmailField(){
        practiceFormPage.enterToSubmitButton();
        Assert.assertEquals(practiceFormPage.getCssAttributeEmailField(), prop.getProperty("RGBGreenColor"));
    }

    @Test
    public void validateBorderColorOfGenderRadioButtonsField(){
        practiceFormPage.enterToSubmitButton();
        Assert.assertEquals(practiceFormPage.getCssAttributeGenderRadioButtons(), prop.getProperty("RGBARedColor"));
    }

    @Test
    public void validateBorderColorOfMobileField(){
        practiceFormPage.enterToSubmitButton();
        Assert.assertEquals(practiceFormPage.getCssAttributeMobileField(), prop.getProperty("RGBRedColor"));
    }

    @Test
    public void validateBorderColorOfBirthDateField(){
        practiceFormPage.enterToSubmitButton();
        Assert.assertEquals(practiceFormPage.getCssAttributeBirthDateField(), prop.getProperty("RGBGreenColor"));
    }

    @Test
    public void validateBorderColorOfSportsCheckboxButton(){
        practiceFormPage.enterToSubmitButton();
        Assert.assertEquals(practiceFormPage.getCssAttributeSportsCheckboxButton(), prop.getProperty("RGBGreenColor"));
    }

    @Test
    public void validateBorderColorOfReadingCheckboxButton(){
        practiceFormPage.enterToSubmitButton();
        Assert.assertEquals(practiceFormPage.getCssAttributeReadingCheckboxButton(), prop.getProperty("RGBGreenColor"));
    }

    @Test
    public void validateBorderColorOfMusicCheckboxButton(){
        practiceFormPage.enterToSubmitButton();
        Assert.assertEquals(practiceFormPage.getCssAttributeMusicCheckboxButton(), prop.getProperty("RGBGreenColor"));
    }

    @Test
    public void validateBorderColorOfCurrentAddressField(){
        practiceFormPage.enterToSubmitButton();
        Assert.assertEquals(practiceFormPage.getCssAttributeCurrentAddressField(), prop.getProperty("RGBGreenColor"));
    }

    @Test
    @Parameters({"name","lastname","email","gender","phone","month","day","year","subject","text","state","city"})
    public void validateCorrectRegisterValues(String name, String lastname,String email, String gender, String phone, String month, String day, String year, String subject,String text, String state, String city) {

        practiceFormPage.fillAllFormFields(name, lastname, email, gender, phone, month, day, year, subject,"C:\\Users\\Jorge\\Pictures\\Captura.png", text, state, city);

        Assert.assertTrue(practiceFormPage.isVisibleTitleSubmitForm());
        Assert.assertEquals(practiceFormPage.getTitleLabelFieldsText(),"Label");
        Assert.assertEquals(practiceFormPage.getTitleValueFieldsText(),"Values");
        Assert.assertEquals(practiceFormPage.getStudentNameText(),"Student Name");
        Assert.assertEquals(practiceFormPage.getValueOfStudentNameRow(),name + " " + lastname);
        Assert.assertEquals(practiceFormPage.getStudentEmailText(),"Student Email");
        Assert.assertEquals(practiceFormPage.getValueOfStudentEmailRow(),email);
        Assert.assertEquals(practiceFormPage.getGenderText(),"Gender");
        Assert.assertEquals(practiceFormPage.getValueOfGenderRow(),gender);
        Assert.assertEquals(practiceFormPage.getMobileText(),"Mobile");
        Assert.assertEquals(practiceFormPage.getValueOfMobileRow(),phone);
        Assert.assertEquals(practiceFormPage.getDateBirthText(),"Date of Birth");
        Assert.assertEquals(practiceFormPage.getValueOfDateBirthRow(),day + " " + month + "," + year);
        Assert.assertEquals(practiceFormPage.getSubjectsText(),"Subjects");
        Assert.assertEquals(practiceFormPage.getValueOfSubjectsRow(),"Maths");
        Assert.assertEquals(practiceFormPage.getHobbiesText(),"Hobbies");
        Assert.assertEquals(practiceFormPage.getValueOfHobbiesRow(),"Music");
        Assert.assertEquals(practiceFormPage.getPictureText(),"Picture");
        Assert.assertEquals(practiceFormPage.getValueOfPictureRow(),"Captura.png");
        Assert.assertEquals(practiceFormPage.getAddressText(),"Address");
        Assert.assertEquals(practiceFormPage.getValueOfAddressRow(),text);
        Assert.assertEquals(practiceFormPage.getStateCityText(),"State and City");
        Assert.assertEquals(practiceFormPage.getValueOfStateCityRow(), state + "" + city);
    }

}

package org.Tests;

import TestComponents.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
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
        practiceFormPage.enterToSubmitButton();
        Assert.assertEquals(practiceFormPage.getCssAttributeFirstNameField(), "rgb(220, 53, 69)");
        Assert.assertEquals(practiceFormPage.getCssAttributeLastNameField(), "rgb(220, 53, 69)");
        Assert.assertEquals(practiceFormPage.getCssAttributeEmailField(), "rgb(40, 167, 69)");
        Assert.assertEquals(practiceFormPage.getCssAttributeGenderRadioButtons(), "rgba(220, 53, 69, 1)");
        Assert.assertEquals(practiceFormPage.getCssAttributeMobileField(), "rgb(220, 53, 69)");
        Assert.assertEquals(practiceFormPage.getCssAttributeBirthDateField(), "rgb(40, 167, 69)");
        Assert.assertEquals(practiceFormPage.getCssAttributeSportsCheckboxButton(), "rgb(40, 167, 69)");
        Assert.assertEquals(practiceFormPage.getCssAttributeReadingCheckboxButton(), "rgb(40, 167, 69)");
        Assert.assertEquals(practiceFormPage.getCssAttributeMusicCheckboxButton(), "rgb(40, 167, 69)");
        Assert.assertEquals(practiceFormPage.getCssAttributeMusicCheckboxButton(), "rgb(40, 167, 69)");
        Assert.assertEquals(practiceFormPage.getCssAttributeCurrentAddressField(), "rgb(40, 167, 69)");
    }

    @Test
    @Parameters({"name","lastname","email","gender","phone","month","day","year","text"})
    public void fillTheFormCorrectly(String name, String lastname,String email, String gender, String phone, String month, String day, String year, String text) {
        practiceFormPage.hidePublicity(driver.findElement(By.cssSelector("#adplus-anchor > div")));
        practiceFormPage.typeInFirstNameField(name);
        practiceFormPage.typeInLastNameField(lastname);
        practiceFormPage.typeInEmailField(email);
        practiceFormPage.selectOneGender(gender);
        practiceFormPage.typeInMobileField(phone);
        practiceFormPage.selectDate(month, day,year);
        practiceFormPage.typeInSubjectField("Maths");
        practiceFormPage.clickOnMusicCheckBoxButton();
        practiceFormPage.selectAPicture("C:\\Users\\Jorge\\Pictures\\Captura.png");
        practiceFormPage.typeInCurrentAddressField(text);
        practiceFormPage.typeInStateListBox();
        practiceFormPage.typeInCityListBox();
        practiceFormPage.enterToSubmitButton();

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
        Assert.assertEquals(practiceFormPage.getValueOfStateCityRow(), "Uttar Pradesh Agra");

        practiceFormPage.clickOnCloseButton();
    }

}

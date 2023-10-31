package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticeFormPage extends BasePages {
    @FindBy(css = "div.practice-form-wrapper > h5")
    WebElement titleForm;
    @FindBy(id = "userName-label")
    WebElement nameLabel;
    @FindBy(id = "firstName")
    WebElement firstNameField;
    @FindBy(id = "lastName")
    WebElement lastNameField;
    @FindBy(id = "userEmail-label")
    WebElement emailLabel;
    @FindBy(id = "userEmail")
    WebElement emailField;
    @FindBy(css = "div#genterWrapper > div:nth-child(1)")
    WebElement genderLabel;
    @FindBy(css = "div#genterWrapper > div:nth-child(2) > div > label")
    List<WebElement> radioButtonGenders;
    @FindBy(id = "userNumber-label")
    WebElement mobileLabel;
    @FindBy(id = "userNumber")
    WebElement mobileField;
    @FindBy(id = "dateOfBirth-label")
    WebElement birthDateLabel;
    @FindBy(id = "dateOfBirthInput")
    WebElement birthDateField;
    @FindBy(css = ".react-datepicker__month-select > option")
    List<WebElement> months;
    @FindBy(css = ".react-datepicker__year-select > option")
    List<WebElement> years;
    @FindBy(className = "react-datepicker__day")
    List<WebElement> calendarDays;
    @FindBy(css = "#subjects-label:nth-child(1)")
    List<WebElement> threeLabelsBeforeCurrentAddressLabel;
    @FindBy(id = "subjectsContainer")
    WebElement subjectField;
    @FindBy(css = ".custom-checkbox > label")
    List<WebElement> checkboxes;
    @FindBy(id = "uploadPicture")
    WebElement selectFieldButton;
    @FindBy(id = "currentAddress-label")
    WebElement currentAddressLabel;
    @FindBy(id = "currentAddress")
    WebElement currentAddressField;
    @FindBy(id = "stateCity-label")
    WebElement stateCityLabel;
    @FindBy(id = "state")
    WebElement listStatesBox;
    @FindBy(id = "city")
    WebElement listCitiesBox;
    @FindBy(css = ".css-1wa3eu0-placeholder")
    List<WebElement> placeholdersStateAndCity;
    @FindBy(id = "submit")
    WebElement submitButton;

    //Form submitted
    @FindBy(id = "example-modal-sizes-title-lg")
    WebElement titleOfSubmitForm;
    @FindBy(css = "thead > tr > th")
    List<WebElement> tableTitles;
    @FindBy(css = "tbody > tr:nth-child(1) > td")
    List<WebElement> firstRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(2) > td")
    List<WebElement> secondRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(3) > td")
    List<WebElement> thirdRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(4) > td")
    List<WebElement> fourthRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(5) > td")
    List<WebElement> fifthRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(6) > td")
    List<WebElement> sixthRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(7) > td")
    List<WebElement> seventhRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(8) > td")
    List<WebElement> eighthRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(9) > td")
    List<WebElement> ninthRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(10) > td")
    List<WebElement> tenthRowOfFormTable;
    @FindBy(id = "closeLargeModal")
    WebElement closeButton;


    public PracticeFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public String getTextFormTitle(){
        return titleForm.getText();
    }

    public String getTextOfLabelName(){
        scroll(nameLabel);
        return nameLabel.getText();
    }

    public String getPlaceholderFirstNameField(){
        return firstNameField.getAttribute("placeholder");
    }

    public String getCssAttributeFirstNameField(){
        waitForCSS(firstNameField);
        return firstNameField.getCssValue("border-color");
    }

    public void typeInFirstNameField(String firstName){
        firstNameField.sendKeys(firstName);
    }

    public String getPlaceholderLastNameField(){
        return lastNameField.getAttribute("placeholder");
    }

    public String getCssAttributeLastNameField(){
        return lastNameField.getCssValue("border-color");
    }

    public void typeInLastNameField(String lastName){
        lastNameField.sendKeys(lastName);
    }

    public String getTextOfLabelEmail(){
        scroll(emailLabel);
        return emailLabel.getText();
    }

    public String getPlaceholderEmailField(){
        return emailField.getAttribute("placeholder");
    }

    public String getCssAttributeEmailField(){
        return emailField.getCssValue("border-color");
    }

    public void typeInEmailField(String email){
        emailField.sendKeys(email);
    }

    public String getTextOfLabelGender(){
        return genderLabel.getText();
    }

    public void selectOneGender(String nameRadioButton){
        selectOneRadioButton(radioButtonGenders,nameRadioButton);
    }

    public String getCssAttributeGenderRadioButtons(){
        return radioButtonGenders.get(0).getCssValue("color");
    }

    public String getTextOfLabelMobile(){
        return mobileLabel.getText();
    }

    public String getPlaceholderMobileField(){
        return mobileField.getAttribute("placeholder");
    }

    public String getCssAttributeMobileField(){
        return mobileField.getCssValue("border-color");
    }

    public void typeInMobileField(String phoneNumber){
        mobileField.sendKeys(phoneNumber);
    }

    public String getTextOfLabelDateOfBirth(){
        return birthDateLabel.getText();
    }

    public String getCssAttributeBirthDateField(){
        return emailField.getCssValue("border-color");
    }

    public void selectDate( String month, String day, String year){
        scroll(birthDateField);
        birthDateField.click();
        selectMonth(months,month);
        selectYear(years,year);
        selectDay(calendarDays,day);
    }

    public String getTextOfLabelSubjects(){
        return threeLabelsBeforeCurrentAddressLabel.get(0).getText();
    }

    public void typeInSubjectField(String subject){
        subjectField.click();
        subjectField.sendKeys(subject);
        subjectField.sendKeys(Keys.ENTER);
    }

    public String getTextOfLabelHobbies(){
        return threeLabelsBeforeCurrentAddressLabel.get(1).getText();
    }

    public String getCssAttributeSportsCheckboxButton(){
        return checkboxes.get(0).getCssValue("border-color").intern();
    }

    public String getCssAttributeReadingCheckboxButton(){
        return checkboxes.get(1).getCssValue("border-color").intern();
    }

    public String getCssAttributeMusicCheckboxButton(){
        return checkboxes.get(2).getCssValue("border-color").intern();
    }

    public void clickOnMusicCheckBoxButton(){
        scroll(checkboxes.get(2));
        waitForClick(checkboxes.get(2));
        checkboxes.get(2).click();
    }

    public String getTextOfLabelPicture(){
        return threeLabelsBeforeCurrentAddressLabel.get(2).getText();
    }

    public void selectAPicture(String picturePath){
        selectFieldButton.sendKeys(picturePath);
    }

    public String getTextOfLabelCurrentAddress(){
        return currentAddressLabel.getText();
    }

    public String getPlaceholderCurrentAddressField(){
        return currentAddressField.getAttribute("placeholder");
    }

    public String getCssAttributeCurrentAddressField(){
        return currentAddressField.getCssValue("border-color");
    }

    public void typeInCurrentAddressField(String text){
        currentAddressField.sendKeys(text);
    }

    public String getTextOfLabelStateCity(){
        return stateCityLabel.getText();
    }

    public String getPlaceholderStatesListBox(){
        return placeholdersStateAndCity.get(1).getText();
    }

    public String getPlaceholderCitiesListBox(){
        return placeholdersStateAndCity.get(2).getText();
    }

    public void typeInStateListBox(){
        doubleClick(listStatesBox);
    }

    public void typeInCityListBox(){
        doubleClick(listCitiesBox);
    }

    public void enterToSubmitButton(){
        submitButton.sendKeys(Keys.ENTER);
    }

    public boolean isVisibleTitleSubmitForm(){
        return titleOfSubmitForm.isDisplayed();
    }

    public String getTitleLabelFieldsText(){
        return tableTitles.get(0).getText();
    }

    public String getTitleValueFieldsText(){
        return tableTitles.get(1).getText();
    }

    public String getStudentNameText(){
        return firstRowOfFormTable.get(0).getText();
    }

    public String getValueOfStudentNameRow(){
        return firstRowOfFormTable.get(1).getText();
    }

    public String getStudentEmailText(){
        return secondRowOfFormTable.get(0).getText();
    }

    public String getValueOfStudentEmailRow(){
        return secondRowOfFormTable.get(1).getText();
    }

    public String getGenderText(){
        return thirdRowOfFormTable.get(0).getText();
    }

    public String getValueOfGenderRow(){
        return thirdRowOfFormTable.get(1).getText();
    }

    public String getMobileText(){
        return fourthRowOfFormTable.get(0).getText();
    }

    public String getValueOfMobileRow(){
        return fourthRowOfFormTable.get(1).getText();
    }

    public String getDateBirthText(){
        return fifthRowOfFormTable.get(0).getText();
    }

    public String getValueOfDateBirthRow(){
        return fifthRowOfFormTable.get(1).getText();
    }

    public String getSubjectsText(){
        return sixthRowOfFormTable.get(0).getText();
    }

    public String getValueOfSubjectsRow(){
        return sixthRowOfFormTable.get(1).getText();
    }

    public String getHobbiesText(){
        return seventhRowOfFormTable.get(0).getText();
    }

    public String getValueOfHobbiesRow(){
        return seventhRowOfFormTable.get(1).getText();
    }

    public String getPictureText(){
        return eighthRowOfFormTable.get(0).getText();
    }

    public String getValueOfPictureRow(){
        return eighthRowOfFormTable.get(1).getText();
    }

    public String getAddressText(){
        return ninthRowOfFormTable.get(0).getText();
    }

    public String getValueOfAddressRow(){
        return ninthRowOfFormTable.get(1).getText();
    }

    public String getStateCityText(){
        return tenthRowOfFormTable.get(0).getText();
    }

    public String getValueOfStateCityRow(){
        return tenthRowOfFormTable.get(1).getText();
    }

    public void clickOnCloseButton(){
        scroll(closeButton);
        waitForClick(closeButton);
        closeButton.click();
    }

}

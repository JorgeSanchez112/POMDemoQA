package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticeFormPage extends BasePages {
    @FindBy(className = "main-header")
    private WebElement pageTitle;
    @FindBy(css = "div.practice-form-wrapper > h5")
    private WebElement titleForm;
    @FindBy(id = "userName-label")
    private WebElement nameLabel;
    @FindBy(id = "firstName")
    private WebElement firstNameField;
    @FindBy(id = "lastName")
    private WebElement lastNameField;
    @FindBy(id = "userEmail-label")
    private WebElement emailLabel;
    @FindBy(id = "userEmail")
    private WebElement emailField;
    @FindBy(css = "div#genterWrapper > div:nth-child(1)")
    private WebElement genderLabel;
    @FindBy(css = "div#genterWrapper > div:nth-child(2) > div > label")
    private List<WebElement> radioButtonGenders;
    @FindBy(id = "userNumber-label")
    private WebElement mobileLabel;
    @FindBy(id = "userNumber")
    private WebElement mobileField;
    @FindBy(id = "dateOfBirth-label")
    private WebElement birthDateLabel;
    @FindBy(id = "dateOfBirthInput")
    private WebElement birthDateField;
    @FindBy(css = ".react-datepicker__month-select > option")
    private List<WebElement> months;
    @FindBy(css = ".react-datepicker__year-select > option")
    private List<WebElement> years;
    @FindBy(className = "react-datepicker__day")
    private List<WebElement> calendarDays;
    @FindBy(css = "#subjects-label:nth-child(1)")
    private List<WebElement> threeLabelsBeforeCurrentAddressLabel;
    @FindBy(id = "subjectsInput")
    private WebElement subjectField;
    @FindBy(css = ".custom-checkbox > label")
    private List<WebElement> checkboxes;
    @FindBy(id = "uploadPicture")
    private WebElement selectFieldButton;
    @FindBy(id = "currentAddress-label")
    private WebElement currentAddressLabel;
    @FindBy(id = "currentAddress")
    private WebElement currentAddressField;
    @FindBy(id = "stateCity-label")
    private WebElement stateCityLabel;
    @FindBy(id = "state")
    private WebElement listStatesBox;
    @FindBy(id = "city")
    private WebElement listCitiesBox;
    @FindBy(css = ".css-1wa3eu0-placeholder")
    private List<WebElement> placeholdersStateAndCity;
    @FindBy(id = "submit")
    private WebElement submitButton;

    //Form submitted
    @FindBy(id = "example-modal-sizes-title-lg")
    private WebElement titleOfSubmitForm;
    @FindBy(css = "thead > tr > th")
    private List<WebElement> tableTitles;
    @FindBy(css = "tbody > tr:nth-child(1) > td")
    private List<WebElement> firstRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(2) > td")
    private List<WebElement> secondRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(3) > td")
    private List<WebElement> thirdRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(4) > td")
    private List<WebElement> fourthRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(5) > td")
    private List<WebElement> fifthRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(6) > td")
    private List<WebElement> sixthRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(7) > td")
    private List<WebElement> seventhRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(8) > td")
    private List<WebElement> eighthRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(9) > td")
    private List<WebElement> ninthRowOfFormTable;
    @FindBy(css = "tbody > tr:nth-child(10) > td")
    private List<WebElement> tenthRowOfFormTable;

    public PracticeFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void typeInFirstNameField(String firstName){
        firstNameField.sendKeys(firstName);
    }

    public void typeInLastNameField(String lastName){
        lastNameField.sendKeys(lastName);
    }

    public void typeInEmailField(String email){
        emailField.sendKeys(email);
    }

    public void selectOneGender(String nameRadioButton){
        selectOneRadioButton(radioButtonGenders,nameRadioButton);
    }

    public void typeInMobileField(String phoneNumber){
        mobileField.sendKeys(phoneNumber);
    }

    public void selectDate( String month, String day, String year){
        scroll(birthDateField);
        clickWithWait(birthDateField);
        selectMonth(months,month);
        selectYear(years,year);
        selectDay(calendarDays,day);
    }

    public void typeInSubjectField(String subject){
        clickWithWait(subjectField);
        subjectField.sendKeys(subject);
        subjectField.sendKeys(Keys.ENTER);
    }

    public void clickOnMusicCheckBoxButton(){
        scroll(checkboxes.get(2));
        clickWithWait(checkboxes.get(2));
    }

    public void selectAPicture(String picturePath){
        selectFieldButton.sendKeys(picturePath);
    }

    public void typeInCurrentAddressField(String text){
        currentAddressField.sendKeys(text);
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

    public void fillAllFormFields(String name, String lastname,String email, String gender, String phone, String month, String day, String year, String subject, String picturePath, String text){
        typeInFirstNameField(name);
        typeInLastNameField(lastname);
        typeInEmailField(email);
        selectOneGender(gender);
        typeInMobileField(phone);
        selectDate(month, day, year);
        typeInSubjectField(subject);
        clickOnMusicCheckBoxButton();
        selectAPicture(picturePath);
        typeInCurrentAddressField(text);
        typeInStateListBox();
        typeInCityListBox();
        enterToSubmitButton();
    }

    public String  getPageTitleText(){
        return pageTitle.getText();
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
        waitForElementContainRedRGBValue(firstNameField,"border-color");
        return firstNameField.getCssValue("border-color");
    }

    public String getPlaceholderLastNameField(){
        return lastNameField.getAttribute("placeholder");
    }

    public String getCssAttributeLastNameField(){
        waitForElementContainRedRGBAValue(lastNameField,"border-color");
        return lastNameField.getCssValue("border-color");
    }

    public String getTextOfLabelEmail(){
        scroll(emailLabel);
        return emailLabel.getText();
    }

    public String getPlaceholderEmailField(){
        return emailField.getAttribute("placeholder");
    }

    public String getCssAttributeEmailField(){
        waitForElementContainGreenRGBValue(emailField,"border-color");
        return emailField.getCssValue("border-color");
    }

    public String getTextOfLabelGender(){
        return genderLabel.getText();
    }

    public String getCssAttributeGenderRadioButtons(){
        waitForElementContainRedRGBAValue(radioButtonGenders.get(0),"color");
        return radioButtonGenders.get(0).getCssValue("color");
    }

    public String getTextOfLabelMobile(){
        return mobileLabel.getText();
    }

    public String getPlaceholderMobileField(){
        return mobileField.getAttribute("placeholder");
    }

    public String getCssAttributeMobileField(){
        waitForElementContainRedRGBValue(mobileField,"border-color");
        return mobileField.getCssValue("border-color");
    }

    public String getTextOfLabelDateOfBirth(){
        return birthDateLabel.getText();
    }

    public String getCssAttributeBirthDateField(){
        waitForElementContainRedRGBValue(emailField,"border-color");
        return emailField.getCssValue("border-color");
    }

    public String getTextOfLabelSubjects(){
        return threeLabelsBeforeCurrentAddressLabel.get(0).getText();
    }

    public String getTextOfLabelHobbies(){
        return threeLabelsBeforeCurrentAddressLabel.get(1).getText();
    }

    public String getCssAttributeSportsCheckboxButton(){
        waitForElementContainGreenRGBValue(checkboxes.get(0),"border-color");
        return checkboxes.get(0).getCssValue("border-color").intern();
    }

    public String getCssAttributeReadingCheckboxButton(){
        waitForElementContainGreenRGBValue(checkboxes.get(1),"border-color");
        return checkboxes.get(1).getCssValue("border-color").intern();
    }

    public String getCssAttributeMusicCheckboxButton(){
        waitForElementContainGreenRGBValue(checkboxes.get(2),"border-color");
        return checkboxes.get(2).getCssValue("border-color").intern();
    }

    public String getTextOfLabelPicture(){
        return threeLabelsBeforeCurrentAddressLabel.get(2).getText();
    }

    public String getTextOfLabelCurrentAddress(){
        return currentAddressLabel.getText();
    }

    public String getPlaceholderCurrentAddressField(){
        return currentAddressField.getAttribute("placeholder");
    }

    public String getCssAttributeCurrentAddressField(){
        waitForElementContainGreenRGBValue(currentAddressField,"border-color");
        return currentAddressField.getCssValue("border-color");
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

}

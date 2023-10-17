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
    @FindBy(css = "#subjects-label:nth-child(1)")
    List<WebElement> threeLabelsBeforeCurrentAddressLabel;
    @FindBy(id = "subjectsContainer")
    WebElement subjectField;
    @FindBy(id = "hobbies-checkbox-1")
    WebElement sportCheckbox;
    @FindBy(id = "hobbies-checkbox-2")
    WebElement readingCheckbox;
    @FindBy(css = ".custom-checkbox > label")
    List<WebElement> musicCheckbox;
    @FindBy(id = "uploadPicture")
    WebElement selectFieldButton;
    @FindBy(id = "currentAddress-label")
    WebElement currentAddressLabel;
    @FindBy(id = "currentAddress")
    WebElement currentAddressField;
    @FindBy(id = "stateCity-label")
    WebElement stateCityLabel;
    @FindBy(css = "#state > div > div.css-1hwfws3")
    WebElement listStatesBox;
    @FindBy(id = "city")
    WebElement listCitiesBox;
    @FindBy(css = ".css-1wa3eu0-placeholder")
    List<WebElement> placeholdersStateAndCity;
    @FindBy(id = "submit")
    WebElement submitButton;

    public PracticeFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public String getTextFormTitle(){
        return titleForm.getText();
    }

    public String getTextOfLabelName(){
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

    public void typeInBirthDateField(String date){
        birthDateField.sendKeys(Keys.DELETE);
        birthDateField.sendKeys(date);
    }

    public String getTextOfLabelSubjects(){
        return threeLabelsBeforeCurrentAddressLabel.get(0).getText();
    }

    public void typeInSubjectField(String date){
        subjectField.sendKeys(date);
    }

    public String getTextOfLabelHobbies(){
        return threeLabelsBeforeCurrentAddressLabel.get(1).getText();
    }

    public String getCssAttributeSportsCheckboxButton(){
        return sportCheckbox.getCssValue("border-color");
    }

    public String getCssAttributeReadingCheckboxButton(){
        return readingCheckbox.getCssValue("border-color");
    }

    public String getCssAttributeMusicCheckboxButton(){
        return musicCheckbox.get(2).getCssValue("border-color").intern();
    }

    public void clickOnMusicCheckBoxButton(){
        musicCheckbox.get(2).click();
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

    public void typeInStateListBox(String state){
        listStatesBox.sendKeys(state);
    }

    public void typeInCityListBox(String city){
        listCitiesBox.sendKeys(city);
    }

    public void EnterToSubmitButton(){
        submitButton.sendKeys(Keys.ENTER);
    }
}

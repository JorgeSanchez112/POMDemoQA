package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticeFormPage extends BasePages {
    @FindBy(css = "div.practice-form-wrapper > h5")
    WebElement titleFrom;
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
    @FindBy(css = "div#genterWrapper > div:nth-child(2) > div")
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
    @FindBy(id = "hobbies-checkbox-3")
    WebElement musicCheckbox;
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
    @FindBy(id = "submit")
    WebElement submitButton;

    public PracticeFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
}

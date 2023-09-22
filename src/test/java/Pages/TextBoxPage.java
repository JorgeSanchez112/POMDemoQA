package Pages;

import TestComponents.BasePages;
import org.bouncycastle.oer.Switch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class TextBoxPage extends BasePages {

    @FindBy(id = "userName")
    WebElement fullNameField;

    @FindBy(id = "userEmail")
    WebElement emailField;

    @FindBy(id = "currentAddress")
    WebElement addressField;

    @FindBy(id = "permanentAddress")
    WebElement permanentAddressField;

    @FindBy(id = "submit")
    WebElement submitButton;

    @FindBy (id = "name")
    WebElement nameTextAnswer;

    @FindBy (id = "email")
    WebElement emailTextAnswer;

    @FindBy (css = "#currentAddress.mb-1")
    WebElement addressTextAnswer;

    @FindBy (css = "#permanentAddress.mb-1")
    WebElement permanentAddressTextAnswer;


    public TextBoxPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void typeOnUsernameField(String name){
        fullNameField.sendKeys(name);
    }

    public void typeOnEmailField(String email){
        emailField.sendKeys(email);
    }

    public void typeOnAddressField(String address){
        addressField.sendKeys(address);
    }

    public void typeOnPermanentAddressField(String pAddress){
        permanentAddressField.sendKeys(pAddress);
    }

    public void clickOnSubmitButton(){
        //driver.switchTo().frame(0);
        scroll(submitButton);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(d -> submitButton.isDisplayed());
        submitButton.click();
    }

    public String getTextNameAnswer(){
        scroll(nameTextAnswer);
        return nameTextAnswer.getText();
    }

    public String getTextEmailAnswer(){
        scroll(emailTextAnswer);
        return emailTextAnswer.getText();
    }

    public String getTextAddressAnswer(){
        scroll(addressTextAnswer);
        return addressTextAnswer.getText();
    }

    public String getTextPermanentAddressAnswer(){
        scroll(permanentAddressTextAnswer);
        return permanentAddressTextAnswer.getText();
    }





}

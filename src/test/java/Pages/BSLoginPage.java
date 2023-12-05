package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BSLoginPage extends BasePages {
    @FindBy(className = "main-header")
    private WebElement title;
    @FindBy(tagName = "h2")
    private WebElement subtitle;
    @FindBy(tagName = "h5")
    private WebElement subSubtitle;
    @FindBy(id = "userName-label")
    private WebElement usernameLabel;
    @FindBy(id = "userName")
    private WebElement usernameInput;
    @FindBy(id = "password-label")
    private WebElement passwordLabel;
    @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(id = "login")
    private WebElement loginButton;
    @FindBy(id = "newUser")
    private WebElement newUserButton;
    @FindBy(id = "name")
    private WebElement errorCredentialsMessage;

    public BSLoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public boolean isTitleVisible(){
        return title.isDisplayed();
    }

    public boolean isErrorMessageVisible(){
        waitForVisibleElement(errorCredentialsMessage);
        return errorCredentialsMessage.isDisplayed();
    }

    public String getSubTitleText(){
        return subtitle.getText();
    }

    public String getSubSubTitleText(){
        return subSubtitle.getText();
    }

    public String getUsernameLabelText(){
        return usernameLabel.getText();
    }

    public String getUsernameInputValue(){
        return usernameInput.getAttribute("value");
    }

    public String getPasswordLabelText(){
        return passwordLabel.getText();
    }

    public String getPasswordInputValue(){
        return passwordInput.getAttribute("value");
    }

    public String getUsernameInputBorderColor(){
        waitForCSS(usernameInput);
        return usernameInput.getCssValue("border-color");
    }

    public String getPasswordInputBorderColor(){
        return passwordInput.getCssValue("border-color");
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public void typeOnUsernameInput(String name){
        usernameInput.sendKeys(name);
    }

    public void typeOnPasswordInput(String password){
        passwordInput.sendKeys(password);
    }

    public void clickOnLoginButton(){
        scroll(loginButton);
        loginButton.click();
    }

    public BSRegisterPage clickOnNewUserButton(){
        scroll(newUserButton);
        newUserButton.click();
        return new BSRegisterPage(driver);
    }

}

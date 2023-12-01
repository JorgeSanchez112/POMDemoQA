package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alerts extends BasePages {
    @FindBy(id = "alertButton")
    private WebElement alertButton;
    @FindBy(id = "timerAlertButton")
    private WebElement afterFiveSecButton;
    @FindBy(id = "confirmButton")
    private WebElement confirmAlertButton;
    @FindBy(id = "promtButton")
    private WebElement inputAlertButton;
    @FindBy(id = "confirmResult")
    private WebElement confirmAlertButtonResult;
    @FindBy(id = "promptResult")
    private WebElement inputAlertButtonText;

    public Alerts(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnFirstButton(){
        alertButton.click();
    }

    public void clickOnSecondButton(){
        afterFiveSecButton.click();
    }

    public void clickOnThirdButton(){
        scroll(confirmAlertButton);
        confirmAlertButton.click();
    }

    public void clickOnFourthButton(){
        scroll(inputAlertButton);
        inputAlertButton.click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void waitAlert(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void typeInAlert(String text){
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();

    }

    public String getConfirmResultText(){
        return confirmAlertButtonResult.getText();
    }

    public String getInputAlertText(){
        System.out.println(inputAlertButton.getText());
        return inputAlertButtonText.getText();
    }

}

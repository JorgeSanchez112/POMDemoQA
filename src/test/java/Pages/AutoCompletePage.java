package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AutoCompletePage extends BasePages {
    @FindBy(id = "autoCompleteMultipleInput")
    WebElement multipleContainer;
    @FindBy(className = "auto-complete__multi-value")
    List<WebElement> valuesOfMultipleContainer;
    @FindBy(id = "autoCompleteSingleInput")
    WebElement singleContainer;
    @FindBy(className = "auto-complete__single-value")
    WebElement valueOfSingleContainer;

    public AutoCompletePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void typeInMultipleContainer(String text){
        multipleContainer.sendKeys(text);
        multipleContainer.sendKeys(Keys.ENTER);
    }

    public void typeInSingleContainer(String color){
        singleContainer.sendKeys(color);
        singleContainer.sendKeys(Keys.ENTER);
    }

    public String getTextOfMultipleContainerValue(){
        return valuesOfMultipleContainer.get(0).getText();
    }

    public String getTextOfSingleContainerValue(){
        return valueOfSingleContainer.getText();
    }
}

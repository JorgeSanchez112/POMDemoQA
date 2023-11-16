package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SelectMenuPage extends BasePages {

    @FindBy(id = "withOptGroup")
    WebElement selectValueContainer;
    @FindBy(id = "react-select-2-input")
    WebElement selectValueInput;

    public SelectMenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnSelectValueContainer(){
        selectValueContainer.click();
    }

    public void downOneOptionInDropDown(){
       selectValueInput.sendKeys(Keys.DOWN);
    }

    public void getSelectValueContainerText(){
        WebElement containOfSelectValue = driver.findElement(By.cssSelector("div.css-1uccc91-singleValue"));
        System.out.println(containOfSelectValue.getText());
    }
}

package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalDialogsPage extends BasePages {
    @FindBy(id = "showSmallModal")
    WebElement smallModalButton;
    @FindBy(id = "showLargeModal")
    WebElement largeModalButton;
    @FindBy(css = ".modal-body")
    WebElement smallModalText;
    @FindBy(id = "closeSmallModal")
    WebElement closeSmallModalButton;
    @FindBy(tagName = "p")
    WebElement largeModalText;
    @FindBy(id = "closeLargeModal")
    WebElement closeLargeModalButton;

    public ModalDialogsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnSmallModalButton(){
        smallModalButton.click();
    }

    public void clickOnLargeModalButton(){
        largeModalButton.click();
    }

    public void clickOnCloseSmallButton(){
        closeSmallModalButton.click();
    }

    public void clickOnCloseLargeButton(){
        closeLargeModalButton.click();
    }

    public String getSmallModalText(){
        return smallModalText.getText();
    }

    public String getLargeModalText(){
        return largeModalText.getText();
    }
}

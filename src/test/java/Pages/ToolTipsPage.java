package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ToolTipsPage extends BasePages {
    @FindBy(id = "toolTipButton")
    private WebElement hoverMeButton;
    @FindBy(id = "toolTipTextField")
    private WebElement hoverMeInput;
    @FindBy(css = "#texToolTopContainer > a")
    private List<WebElement> hoverLink;

    public ToolTipsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    private final String ariaDescribedbyOfButton = "buttonToolTip";
    private final String ariaDescribedbyOfInput = "textFieldToolTip";
    private final String ariaDescribedbyOfContraryLink = "contraryTexToolTip";
    private final String ariaDescribedbyOfVersionLink = "sectionToolTip";

    public void moveClickerTOHoverButton(){
        scroll(hoverMeButton);
        moveClickerToElement(hoverMeButton);
        waitForAttributeAriaDescribedbyEqualToValue(hoverMeButton, ariaDescribedbyOfButton);
    }

    public void moveClickerTOHoverInput(){
        scroll(hoverMeInput);
        moveClickerToElement(hoverMeInput);
        waitForAttributeAriaDescribedbyEqualToValue(hoverMeInput, ariaDescribedbyOfInput);

    }

    public void moveClickerTOContraryLink(){
        scroll(hoverLink.get(0));
        moveClickerToElement(hoverLink.get(0));
        waitForAttributeAriaDescribedbyEqualToValue(hoverLink.get(0), ariaDescribedbyOfContraryLink);
    }

    public void moveClickerTOVersionLink(){
        scroll(hoverLink.get(1));
        moveClickerToElement(hoverLink.get(1));
        waitForAttributeAriaDescribedbyEqualToValue(hoverLink.get(1), ariaDescribedbyOfVersionLink);
    }

    public void isHoverButtonVisible(){
        Assert.assertEquals(hoverMeButton.getAttribute("aria-describedby"), ariaDescribedbyOfButton);
    }

    public void isHoverInputVisible(){
        Assert.assertEquals(hoverMeInput.getAttribute("aria-describedby"), ariaDescribedbyOfInput);
    }

    public void isHoverContraryLinkVisible(){
        Assert.assertEquals(hoverLink.get(0).getAttribute("aria-describedby"), ariaDescribedbyOfContraryLink);
    }

    public void isHoverVersionLinkVisible(){
        Assert.assertEquals(hoverLink.get(1).getAttribute("aria-describedby"), ariaDescribedbyOfVersionLink);
    }

}

package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccordianPage extends BasePages {
    @FindBy(id = "section1Heading")
    private WebElement card1;
    @FindBy(id = "section1Content")
    private WebElement firstCardContent;
    @FindBy(id = "section2Heading")
    private WebElement card2;
    @FindBy(id = "section2Content")
    private WebElement secondCardContent;
    @FindBy(id = "section3Heading")
    private WebElement card3;
    @FindBy(id = "section3Content")
    private WebElement thirdCardContent;

    public AccordianPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnFirstCard(){
        scroll(card1);
        if (!firstContentIsVisible()){
            card1.click();
        }
    }

    public void clickOnSecondCard(){
        scroll(card2);
        card2.click();
    }

    public void clickOnThirdCard(){
        scroll(card3);
        card3.click();
    }

    public boolean firstContentIsVisible(){
        return firstCardContent.isDisplayed();
    }

    public boolean secondContentIsVisible(){
        return secondCardContent.isDisplayed();
    }

    public boolean thirdContentIsVisible(){
        return thirdCardContent.isDisplayed();
    }

}

package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LinksPage extends BasePages {
    @FindBy (linkText = "Home")
    private WebElement  linkToHomePage;
    @FindBy (css = "#linkWrapper > P:nth-child(3) > a")
    private WebElement secondLinkToHomePage;
    @FindBy (linkText = "Created")
    private WebElement http201;
    @FindBy (linkText = "No Content")
    private WebElement http204;
    @FindBy (linkText = "Moved")
    private WebElement http301;
    @FindBy (linkText = "Bad Request")
    private WebElement http400;
    @FindBy (linkText = "Unauthorized")
    private WebElement http401;
    @FindBy (linkText = "Forbidden")
    private WebElement http403;
    @FindBy (linkText = "Not Found")
    private WebElement http404;
    @FindBy (css = "#linkResponse > b")
    private List<WebElement> messageResponse;

    public LinksPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnCreatedLink(){
        scroll(http201);
        waitForClick(http201);
        http201.click();
    }

    public void clickOnNoContentLink(){
        scroll(http204);
        waitForClick(http204);
        http204.click();
    }

    public void clickOnMovedLink(){
        waitForClick(http301);
        http301.click();
    }

    public void clickOnBadRequestLink(){
        scroll(http400);
        waitForClick(http400);
        http400.click();
    }

    public void clickOnUnauthorizedLink(){
        waitForClick(http401);
        scroll(http401);
        http401.click();
    }

    public void clickOnForbiddenLink(){
        waitForClick(http403);
        scroll(http403);
        http403.click();
    }

    public void clickOnNotFoundLink(){
        waitForClick(http404);
        scroll(http404);
        http404.click();
    }

    public String getHrefOfHomeLink(){
        return linkToHomePage.getAttribute("href");
    }

    public String getHrefOfHomeETgEzLink(){
        return secondLinkToHomePage.getAttribute("href");
    }

    public String getHttpMessage(){
        return messageResponse.get(0).getText();
    }

    public String getNameLinkMessage(){
        return messageResponse.get(1).getText();
    }

}

package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BSIBookPage extends BasePages {
    @FindBy(id = "userName-label")
    private WebElement  userNameLabel;
    @FindBy(css = ".text-right > #userName-value")
    private WebElement userNameValue;
    @FindBy(id = "submit")
    private WebElement logOutButton;
    @FindBy(id = "ISBN-label")
    private WebElement isbnLabel;
    @FindBy(css = "#ISBN-wrapper >* #userName-value")
    private WebElement isbnValue;
    @FindBy(id = "title-label")
    private WebElement titleLabel;
    @FindBy(css = "#title-wrapper >* #userName-value")
    private WebElement titleValue;
    @FindBy(id = "subtitle-label")
    private WebElement subtitleLabel;
    @FindBy(css = "#subtitle-wrapper >* #userName-value")
    private WebElement subtitleValue;
    @FindBy(id = "author-label")
    private WebElement authorLabel;
    @FindBy(css = "#author-wrapper >* #userName-value")
    private WebElement authorValue;
    @FindBy(id = "publisher-label")
    private WebElement publisherLabel;
    @FindBy(css = "#publisher-wrapper >*  #userName-value")
    private WebElement publisherValue;
    @FindBy(id = "pages-label")
    private WebElement pagesLabel;
    @FindBy(css = "#pages-wrapper >* #userName-value")
    private WebElement totalPagesValue;
    @FindBy(id = "description-label")
    private WebElement descriptionLabel;
    @FindBy(css = "#description-wrapper >* #userName-value")
    private WebElement descriptionValue;
    @FindBy(id = "website-label")
    private WebElement websiteLabel;
    @FindBy(css = "#website-wrapper >* #userName-value")
    private WebElement websiteLink;
    @FindBy(id = ".text-right > #addNewRecordButton")
    private WebElement backToBookStoreButton;
    @FindBy(css = ".text-left > #addNewRecordButton")
    private WebElement addToYourCollectionButton;

    public BSIBookPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnBackToBookStoreBookButton(){
        scroll(backToBookStoreButton);
        clickWithWait(backToBookStoreButton);
    }

    public void clickOnAddToYourCollectionButton(){
        scroll(addToYourCollectionButton);
        clickWithWait(addToYourCollectionButton);
    }


    public BSLoginPage clickOnLogOutButton(){
        clickWithWait(logOutButton);
        return new BSLoginPage(driver);
    }
}

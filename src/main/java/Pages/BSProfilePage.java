package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BSProfilePage extends BasePages {
    @FindBy(className = "main-header") //not login
    WebElement title;
    @FindBy(id = "notLoggin-label")
    WebElement doNotLoginMessage;
    @FindBy(css = "#notLoggin-wrapper >* a")
    List<WebElement> linkRegisterAndLogin;
    @FindBy(id = "userName-label") //logged in
    WebElement booksLabel;
    @FindBy(id = "searchBox")
    WebElement searchBox;
    @FindBy(css = ".text-right > #userName-label")
    WebElement usernameLabel;
    @FindBy(id = "userName-value")
    WebElement usernameValue;
    @FindBy(css = ".text-right.col-sm-12 > #submit")
    WebElement logOutButton;
    @FindBy(className = "rt-th")
    List<WebElement> tableHeaderTitles;
    @FindBy(css = ".rt-tr > .rt-td:nth-child(1)")
    List<WebElement> columnImages;
    @FindBy(css = ".rt-tr > .rt-td:nth-child(2)")
    List<WebElement> columnTitles;
    @FindBy(css = ".rt-tr > .rt-td:nth-child(3)")
    List<WebElement> columnAuthors;
    @FindBy(css = ".rt-tr > .rt-td:nth-child(4)")
    List<WebElement> columnPublishers;
    @FindBy(css = ".rt-tr > .rt-td:nth-child(5)")
    List<WebElement> columnActions;
    @FindBy(className = "rt-noData")
    WebElement messageNoData;
    @FindBy(css = ".-previous > button")
    WebElement previousButton;
    @FindBy(css = ".-center > .-pageInfo")
    WebElement pageTextOfCenterTable;
    @FindBy(className = "-pageJump")
    WebElement pageValue;
    @FindBy(className = "-totalPages")
    WebElement totalPagesNumber;
    @FindBy(css = ".-next > button")
    WebElement nextButton;
    @FindBy(id = "gotoStore")
    WebElement goToBookStoreButton;
    @FindBy(css = ".text-center > button")
    WebElement deleteAccountButton;
    @FindBy(css = ".text-right.di > button")
    WebElement deleteAllBooksButton;

    public BSProfilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void typeOnSearchBox(String text){
        searchBox.sendKeys(text);
    }

    public void clickOnPreviousButton(){
        clickWithWait(previousButton);
    }

    public void clickOnNextButton(){
        clickWithWait(nextButton);
    }

    public void clickOnDeleteAccountButton(){
        clickWithWait(deleteAccountButton);
    }

    public void clickOnDeleteAllBooksButton(){
        clickWithWait(deleteAllBooksButton);
    }

    public void acceptAlert(){
        waitAlert();
        driver.switchTo().alert().accept();
    }

    public void dismissAlert(){
        waitAlert();
        driver.switchTo().alert().dismiss();
    }


    public String getBooksLabelText(){
        waitForVisibleElement(booksLabel);
        return booksLabel.getText();
    }

    public String getSearchBoxPlaceholderText(){
        waitForVisibleElement(searchBox);
        return searchBox.getAttribute("placeholder");
    }

    public String getUserNameLabelText(){
        waitForVisibleElement(usernameLabel);
        return usernameLabel.getText();
    }

    public String getUserNameValueText(){
        waitForVisibleElement(usernameValue);
        return usernameValue.getText();
    }

    public String getTableTitleImageText(){
        return tableHeaderTitles.get(0).getText();
    }

    public String getTableTitleTitleText(){
        return tableHeaderTitles.get(1).getText();
    }

    public String getTableTitleAuthorText(){
        return tableHeaderTitles.get(2).getText();
    }

    public String getTableTitlePublisherText(){
        return tableHeaderTitles.get(3).getText();
    }

    public String getTableTitleActionText(){
        return tableHeaderTitles.get(4).getText();
    }

    public String getPageText(){
        return pageTextOfCenterTable.getText();
    }

    public String getPageNumber(){
        return pageValue.getText();
    }

    public String getTotalOfPagesText(){
        return totalPagesNumber.getText();
    }


    public boolean isTitleVisible(){
        return title.isDisplayed();
    }

    public boolean isMessageDoNotLoginShowed(){
        return doNotLoginMessage.isDisplayed();
    }

    public boolean isImageInTableOfBooksCollection(String value){
        return searchForVisibleElement(columnImages,value);
    }

    public boolean isTitleInTableOfBooksCollection(String value){
        return searchForVisibleElement(columnTitles,value);
    }

    public boolean isAuthorInTableOfBooksCollection(String value){
        return searchForVisibleElement(columnAuthors,value);
    }

    public boolean isPublisherInTableOfBooksCollection(String value){
        return searchForVisibleElement(columnPublishers,value);
    }

    public boolean isMessageNoDataVisible(){
        waitForVisibleElement(messageNoData);
        return messageNoData.isDisplayed();
    }


    public BSLoginPage clickOnLoginLink(){
        scroll(linkRegisterAndLogin.get(0));
        clickWithWait(linkRegisterAndLogin.get(0));
        return new BSLoginPage(driver);
    }

    public BSRegisterPage clickOnRegisterLink(){
        scroll(linkRegisterAndLogin.get(1));
        clickWithWait(linkRegisterAndLogin.get(1));
        return new BSRegisterPage(driver);
    }

    public BSLoginPage clickOnLogOutButton(){
        waitForVisibleElement(logOutButton);
        scroll(logOutButton);
        clickWithWait(logOutButton);
        return new BSLoginPage(driver);
    }

    public BookStorePage clickOnGoToBookStoreButton(){
        scroll(goToBookStoreButton);
        clickWithWait(goToBookStoreButton);
        return new BookStorePage(driver);
    }

}

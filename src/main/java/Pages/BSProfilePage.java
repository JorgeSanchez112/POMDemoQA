package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.TimeoutException;
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
    @FindBy(id = "closeSmallModal-ok")
    WebElement okButtonOfAlertDeleteAccountAndBooks;
    @FindBy(id = "closeSmallModal-cancel")
    WebElement cancelButtonOfAlertDeleteAccountAndBooks;

    public BSProfilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void typeOnSearchBox(String text){
        waitForVisibleElement(searchBox);
        searchBox.sendKeys(text);
    }

    public void clickOnPreviousButton(){
        scroll(previousButton);
        clickWithWait(previousButton);
    }

    public void clickOnNextButton(){
        scroll(nextButton);
        clickWithWait(nextButton);
    }

    public void clickOnDeleteAccountButton(){
        scroll(deleteAccountButton);
        clickWithWait(deleteAccountButton);
    }

    public void clickOnDeleteAllBooksButton(){
        scroll(deleteAllBooksButton);
        clickWithWait(deleteAllBooksButton);
    }

    public void acceptDeleteAccountOrBooks(){
        clickWithWait(okButtonOfAlertDeleteAccountAndBooks);
    }

    public void cancelDeleteAccountOrBooks(){
        clickWithWait(cancelButtonOfAlertDeleteAccountAndBooks);
    }

    public void acceptAlert(){
        waitAlert();
        driver.switchTo().alert().accept();
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
        waitForPageToLoad(tableHeaderTitles);
        scroll(tableHeaderTitles.get(0));
        return tableHeaderTitles.get(0).getText();
    }

    public String getTableTitleTitleText(){
        waitForPageToLoad(tableHeaderTitles);
        waitForVisibleElement(tableHeaderTitles.get(1));
        return tableHeaderTitles.get(1).getText();
    }

    public String getTableTitleAuthorText(){
        waitForPageToLoad(tableHeaderTitles);
        waitForVisibleElement(tableHeaderTitles.get(2));
        return tableHeaderTitles.get(2).getText();
    }

    public String getTableTitlePublisherText(){
        waitForPageToLoad(tableHeaderTitles);
        waitForVisibleElement(tableHeaderTitles.get(3));
        return tableHeaderTitles.get(3).getText();
    }

    public String getTableTitleActionText(){
        waitForPageToLoad(tableHeaderTitles);
        waitForVisibleElement(tableHeaderTitles.get(4));
        return tableHeaderTitles.get(4).getText();
    }

    public String getPageText(){
        waitForVisibleElement(pageTextOfCenterTable);
        return pageTextOfCenterTable.getText();
    }

    public String getPageNumber(){
        return pageValue.getText();
    }

    public String getTotalOfPagesText(){
        waitForVisibleElement(totalPagesNumber);
        return totalPagesNumber.getText();
    }

    public boolean isTitleVisible(){
        waitForVisibleElement(title);
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
        try {
            waitForVisibleElement(messageNoData);
            return messageNoData.isDisplayed();
        }catch (TimeoutException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean isPreviousButtonEnabled(){
        scroll(previousButton);
        return previousButton.isEnabled();
    }

    public boolean isNextButtonEnabled(){
        scroll(nextButton);
        return nextButton.isEnabled();
    }

    public BSLoginPage clickOnLoginLink(){
        waitForPageToLoad(linkRegisterAndLogin);
        scroll(linkRegisterAndLogin.get(0));

        clickWithWait(linkRegisterAndLogin.get(0));
        return new BSLoginPage(driver);
    }

    public BSRegisterPage clickOnRegisterLink(){
        waitForPageToLoad(linkRegisterAndLogin);
        scroll(linkRegisterAndLogin.get(1));
        clickWithWait(linkRegisterAndLogin.get(1));
        return new BSRegisterPage(driver);
    }

    public BSLoginPage clickOnLogOutButton(){
        scroll(logOutButton);
        clickWithWait(logOutButton);
        return new BSLoginPage(driver);
    }

    public BookStorePage clickOnGoToBookStoreButton(){
        scroll(goToBookStoreButton);
        clickWithWait(goToBookStoreButton);
        return new BookStorePage(driver);
    }

    public BSLoginPage deleteAccount(){
        clickOnDeleteAccountButton();
        acceptAlert();
        return new BSLoginPage(driver);
    }

}

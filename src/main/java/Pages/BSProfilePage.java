package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BSProfilePage extends BasePages {
    @FindBy(className = "main-header")
    WebElement title;
    @FindBy(id = "notLoggin-label")
    WebElement doNotLoginMessage;
    @FindBy(id = "userName-label")
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

    public boolean isTitleVisible(){
        return title.isDisplayed();
    }

    public boolean isMessageDoNotLoginShowed(){
        return doNotLoginMessage.isDisplayed();
    }

}

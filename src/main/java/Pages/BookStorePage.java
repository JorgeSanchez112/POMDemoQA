package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BookStorePage extends BasePages {
    @FindBy(css = ".collapse.show > .menu-list > *")
    private List<WebElement> deployed_form_exercise;
    @FindBy(className = "main-header")
    private WebElement title;
    @FindBy(id = "searchBox")
    private WebElement searchBox;
    @FindBy(css = ".-header >* > .rt-th")
    private List<WebElement> tableTitles;
    @FindBy(className = "rt-tr-group")
    private List<WebElement> bookRow;
    @FindBy(css = ".rt-tr > .rt-td:nth-child(1)")
    private List<WebElement> columnImages;
    @FindBy(css = ".rt-tr > .rt-td:nth-child(2)")
    private List<WebElement> columnTitle;
    @FindBy(css = ".rt-tr > .rt-td:nth-child(3)")
    private List<WebElement> columnAuthor;
    @FindBy(css = ".rt-tr > .rt-td:nth-child(4)")
    private List<WebElement> columnPublisher;


    public BookStorePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void scrollToSearchBar() {
        scroll(searchBox);
    }

    public void scrollToFirstRow() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(bookRow);
        if (bookRow.size() != 0){
            try {
                waitForVisibleElement(bookRow.get(0));
                scroll(bookRow.get(0));
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }

    }

    public void scrollToSecondRow() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(bookRow);
        if (bookRow.size() != 0){
            try {
                waitForVisibleElement(bookRow.get(1));
                scroll(bookRow.get(1));
            }catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

    }

    public void scrollToThirdRow() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(bookRow);
        if (bookRow.size() != 0){
            try {
                waitForVisibleElement(bookRow.get(2));
                scroll(bookRow.get(2));
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }

    }

    public void scrollToFourthRow() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(bookRow);
        if (bookRow.size() != 0){
            try {
                waitForVisibleElement(bookRow.get(3));
                scroll(bookRow.get(3));
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }

    }

    public void scrollToFifthRow() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(bookRow);
        if (bookRow.size() != 0){
            try {
                waitForVisibleElement(bookRow.get(4));
                scroll(bookRow.get(4));
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }


    }

    public void scrollToSixthRow() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(bookRow);
        if (bookRow.size() != 0){
            try{
                waitForVisibleElement(bookRow.get(5));
                scroll(bookRow.get(5));
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }


    }

    public void scrollToSeventhRow() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(bookRow);
        if (bookRow.size() != 0){
            try{
                waitForVisibleElement(bookRow.get(6));
                scroll(bookRow.get(6));
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }


    }

    public void typeOnSearchBar(String text){
        searchBox.sendKeys(text);
    }

    public String getSearchBarPlaceholder(){
        return searchBox.getAttribute("placeholder");
    }

    public String getFirstTitleTableText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(tableTitles);
        return getElementTextAccordingToPositionReceived(tableTitles,0);
    }

    public String getSecondTitleTableText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(tableTitles);
        return getElementTextAccordingToPositionReceived(tableTitles,1);
    }

    public String getThirdTitleTableText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(tableTitles);
        return getElementTextAccordingToPositionReceived(tableTitles,2);
    }

    public String getFourthTitleTableText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(tableTitles);
        return getElementTextAccordingToPositionReceived(tableTitles,3);
    }

    public String getTitleOfFirstBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnTitle);
        return getElementTextAccordingToPositionReceived(columnTitle,0);
    }

    public String getAuthorOfFirstBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnAuthor);
        return getElementTextAccordingToPositionReceived(columnAuthor,0);
    }

    public String getPublisherOfFirstBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnPublisher);
        return getElementTextAccordingToPositionReceived(columnPublisher,0);
    }

    public String getTitleOfSecondBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnTitle);
        return getElementTextAccordingToPositionReceived(columnTitle,1);
    }

    public String getAuthorOfSecondBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnAuthor);
        return getElementTextAccordingToPositionReceived(columnAuthor,1);
    }

    public String getPublisherOfSecondBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnPublisher);
        return getElementTextAccordingToPositionReceived(columnPublisher,1);
    }

    public String getTitleOfThirdBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnTitle);
        return getElementTextAccordingToPositionReceived(columnTitle,2);
    }

    public String getAuthorOfThirdBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnAuthor);
        return getElementTextAccordingToPositionReceived(columnAuthor,2);
    }

    public String getPublisherOfThirdBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnPublisher);
        return getElementTextAccordingToPositionReceived(columnPublisher,2);
    }

    public String getTitleOfFourthBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnTitle);
        return getElementTextAccordingToPositionReceived(columnTitle,3);
    }

    public String getAuthorOfFourthBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnAuthor);
        return getElementTextAccordingToPositionReceived(columnAuthor,3);
    }

    public String getPublisherOfFourthBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnPublisher);
        return getElementTextAccordingToPositionReceived(columnPublisher,3);
    }

    public String getTitleOfFifthBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnTitle);
        return getElementTextAccordingToPositionReceived(columnTitle,4);
    }

    public String getAuthorOfFifthBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnAuthor);
        return getElementTextAccordingToPositionReceived(columnAuthor,4);
    }

    public String getPublisherOfFifthBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnPublisher);
        return getElementTextAccordingToPositionReceived(columnPublisher,4);
    }

    public String getTitleOfSixthBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnTitle);
        return getElementTextAccordingToPositionReceived(columnTitle,5);
    }

    public String getAuthorOfSixthBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnAuthor);
        return getElementTextAccordingToPositionReceived(columnAuthor,5);
    }

    public String getPublisherOfSixthBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnPublisher);
        return getElementTextAccordingToPositionReceived(columnPublisher,5);
    }

    public String getTitleOfSeventhBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnTitle);
        return getElementTextAccordingToPositionReceived(columnTitle,6);
    }

    public String getAuthorOfSeventhBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnAuthor);
        return getElementTextAccordingToPositionReceived(columnAuthor,6);
    }

    public String getPublisherOfSeventhBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnPublisher);
        return getElementTextAccordingToPositionReceived(columnPublisher,6);
    }

    public String getTitleOfEighthBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnTitle);
        return getElementTextAccordingToPositionReceived(columnTitle,7);
    }

    public String getAuthorOfEighthBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnAuthor);
        return getElementTextAccordingToPositionReceived(columnAuthor,7);
    }

    public String getPublisherOfEighthBookText() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnPublisher);
        return getElementTextAccordingToPositionReceived(columnPublisher,7);
    }

    public String getBookStoreUrlText(){
        return driver.getCurrentUrl();
    }

    public boolean isTitleVisible(){
        return title.isDisplayed();
    }

    public boolean isVisibleFirstImage() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnImages);
        return isElementVisibleAccordingToPositionReceivedOfList(columnImages,0);
    }

    public boolean isVisibleSecondImage() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnImages);
        return isElementVisibleAccordingToPositionReceivedOfList(columnImages,1);
    }

    public boolean isVisibleThirdImage() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnImages);
        return isElementVisibleAccordingToPositionReceivedOfList(columnImages,2);
    }

    public boolean isVisibleFourthImage() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnImages);
        return isElementVisibleAccordingToPositionReceivedOfList(columnImages,3);
    }

    public boolean isVisibleFifthImage() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnImages);
        return isElementVisibleAccordingToPositionReceivedOfList(columnImages,4);
    }

    public boolean isVisibleSixthImage() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnImages);
        return isElementVisibleAccordingToPositionReceivedOfList(columnImages,5);
    }

    public boolean isVisibleSeventhImage() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnImages);
        return isElementVisibleAccordingToPositionReceivedOfList(columnImages,6);
    }

    public boolean isVisibleEighthImage() {
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnImages);
        return isElementVisibleAccordingToPositionReceivedOfList(columnImages,7);
    }

    public boolean isBookTitleFound(String bookTitle, String textExpected){
        String regex = ".*"+textExpected+".*";
        if (bookTitle.matches(regex)){
            return true;
        }else {
            System.out.println("book doesn't exist");
            return false;
        }
    }

    public int getSizeSections(){
        return deployed_form_exercise.size();
    }

    public BSIBookPage searchAndClickOnATitle(String bookTitle){
        waitForVisibleElement(title);
        waitForChargedElementsOfAWebElementList(columnTitle);
        try {
            WebElement tryOne = driver.findElement(By.linkText(bookTitle));
            scroll(tryOne);
            clickWithWait(tryOne);
            return new BSIBookPage(driver);
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("Error on line 719 BookstorePage" + e.getMessage());
            return null;
        }
    }

    public BSLoginPage clickOnLoginTab(){
        scroll(deployed_form_exercise.get(0));
        clickWithWait(deployed_form_exercise.get(0));
        return new BSLoginPage(driver);
    }

    public BSProfilePage clickOnProfile(){
        scroll(deployed_form_exercise.get(2));
        clickWithWait(deployed_form_exercise.get(2));
        return new BSProfilePage(driver);
    }

    public BSAPIPage clickOnBookstoreApi(){
        scroll(deployed_form_exercise.get(3));
        clickWithWait(deployed_form_exercise.get(3));
        return new BSAPIPage(driver);
    }

}

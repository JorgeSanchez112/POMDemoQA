package Pages;

import TestComponents.BasePages;
import com.beust.jcommander.IParameterizedParser;
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
        waitForPageToLoad(bookRow);
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
        waitForPageToLoad(bookRow);
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
        waitForPageToLoad(bookRow);
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
        waitForPageToLoad(bookRow);
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
        waitForPageToLoad(bookRow);
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
        waitForPageToLoad(bookRow);
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
        waitForPageToLoad(bookRow);
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
        waitForPageToLoad(tableTitles);
        if (tableTitles.size() != 0){
            try{
                waitForVisibleElement(tableTitles.get(0));
                return tableTitles.get(0).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getSecondTitleTableText() {
        waitForVisibleElement(title);
        waitForPageToLoad(tableTitles);
        if (tableTitles.size() != 0){
            try{
                waitForVisibleElement(tableTitles.get(0));
                return tableTitles.get(1).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getThirdTitleTableText() {
        waitForVisibleElement(title);
        waitForPageToLoad(tableTitles);
        if (tableTitles.size() != 0){
            try{
                return tableTitles.get(2).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getFourthTitleTableText() {
        waitForVisibleElement(title);
        waitForPageToLoad(tableTitles);
        if (tableTitles.size() != 0){
            try{
                return tableTitles.get(3).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getTitleOfFirstBookText() {
        waitForPageToLoad(columnTitle);
        waitForVisibleElement(title);
        if (columnTitle.size() != 0){
            try{
                scroll(columnTitle.get(0));
                return columnTitle.get(0).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getAuthorOfFirstBookText() {
        waitForPageToLoad(columnAuthor);
        waitForVisibleElement(title);
        if (columnAuthor.size() != 0){
            try{
                scroll(columnAuthor.get(0));
                return columnAuthor.get(0).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getPublisherOfFirstBookText() {
        waitForPageToLoad(columnPublisher);
        waitForVisibleElement(title);
        if (columnPublisher.size() != 0){
            try{
                scroll(columnPublisher.get(0));
                return columnPublisher.get(0).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getTitleOfSecondBookText() {
        waitForPageToLoad(columnTitle);
        waitForVisibleElement(title);

        if (columnTitle.size() != 0){
            try{
                scroll(columnTitle.get(1));
                return columnTitle.get(1).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getAuthorOfSecondBookText() {
        waitForPageToLoad(columnAuthor);
        waitForVisibleElement(title);
        if (columnAuthor.size() != 0){
            try{
                scroll(columnAuthor.get(1));
                return columnAuthor.get(1).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getPublisherOfSecondBookText() {
        waitForPageToLoad(columnPublisher);
        waitForVisibleElement(title);
        if (columnPublisher.size() != 0){
            try{
                scroll(columnPublisher.get(1));
                return columnPublisher.get(1).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getTitleOfThirdBookText() {
        waitForPageToLoad(columnTitle);
        waitForVisibleElement(title);
        if (columnTitle.size() != 0){
            try{
                scroll(columnTitle.get(2));
                return columnTitle.get(2).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getAuthorOfThirdBookText() {
        waitForPageToLoad(columnAuthor);
        waitForVisibleElement(title);
        if (columnAuthor.size() != 0){
            try{
                scroll(columnAuthor.get(2));
                return columnAuthor.get(2).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getPublisherOfThirdBookText() {
        waitForPageToLoad(columnPublisher);
        waitForVisibleElement(title);
        if (columnPublisher.size() != 0){
            try{
                scroll(columnPublisher.get(2));
                return columnPublisher.get(2).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getTitleOfFourthBookText() {
        waitForPageToLoad(columnTitle);
        waitForVisibleElement(title);
        if (columnTitle.size() != 0){
            try{
                scroll(columnTitle.get(3));
                return columnTitle.get(3).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getAuthorOfFourthBookText() {
        waitForPageToLoad(columnAuthor);
        waitForVisibleElement(title);
        if (columnAuthor.size() != 0){
            try{
                scroll(columnAuthor.get(3));
                return columnAuthor.get(3).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getPublisherOfFourthBookText() {
        waitForPageToLoad(columnPublisher);
        waitForVisibleElement(title);
        if (columnPublisher.size() != 0){
            try{
                scroll(columnPublisher.get(3));
                return columnPublisher.get(3).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getTitleOfFifthBookText() {
        waitForPageToLoad(columnTitle);
        waitForVisibleElement(title);
        if (columnTitle.size() != 0){
            try{
                scroll(columnTitle.get(4));
                return columnTitle.get(4).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getAuthorOfFifthBookText() {
        waitForPageToLoad(columnAuthor);
        waitForVisibleElement(title);
        if (columnAuthor.size() != 0){
            try{
                scroll(columnAuthor.get(4));
                return columnAuthor.get(4).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getPublisherOfFifthBookText() {
        waitForPageToLoad(columnPublisher);
        waitForVisibleElement(title);
        if (columnPublisher.size() != 0){
            try{
                scroll(columnPublisher.get(4));
                return columnPublisher.get(4).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getTitleOfSixthBookText() {
        waitForPageToLoad(columnTitle);
        waitForVisibleElement(title);
        if (columnTitle.size() != 0){
            try{
                scroll(columnTitle.get(5));
                return columnTitle.get(5).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getAuthorOfSixthBookText() {
        waitForPageToLoad(columnAuthor);
        waitForVisibleElement(title);
        if (columnAuthor.size() != 0){
            try{
                scroll(columnAuthor.get(5));
                return columnAuthor.get(5).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getPublisherOfSixthBookText() {
        waitForPageToLoad(columnPublisher);
        waitForVisibleElement(title);
        if (columnPublisher.size() != 0){
            try{
                scroll(columnPublisher.get(5));
                return columnPublisher.get(5).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getTitleOfSeventhBookText() {
        waitForPageToLoad(columnTitle);
        waitForVisibleElement(title);
        if (columnTitle.size() != 0){
            try{
                scroll(columnTitle.get(6));
                return columnTitle.get(6).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getAuthorOfSeventhBookText() {
        waitForPageToLoad(columnAuthor);
        waitForVisibleElement(title);
        if (columnAuthor.size() != 0){
            try{
                scroll(columnAuthor.get(6));
                return columnAuthor.get(6).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getPublisherOfSeventhBookText() {
        waitForPageToLoad(columnPublisher);
        waitForVisibleElement(title);
        if (columnPublisher.size() != 0){
            try{
                scroll(columnPublisher.get(6));
                return columnPublisher.get(6).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getTitleOfEighthBookText() {
        waitForPageToLoad(columnTitle);
        waitForVisibleElement(title);
        if (columnTitle.size() != 0){
            try{
                scroll(columnTitle.get(7));
                return columnTitle.get(7).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getAuthorOfEighthBookText() {
        waitForPageToLoad(columnAuthor);
        waitForVisibleElement(title);
        if (columnAuthor.size() != 0){
            try{
                scroll(columnAuthor.get(7));
                return columnAuthor.get(7).getText();
            }catch (IndexOutOfBoundsException e){
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getPublisherOfEighthBookText() {
        waitForPageToLoad(columnPublisher);
        waitForVisibleElement(title);
        if (columnPublisher.size() != 0){
            try{
                scroll(columnPublisher.get(7));
                return columnPublisher.get(7).getText();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
                return e.getMessage();
            }
        }
        return "an error has happened";
    }

    public String getBookStoreUrlText(){
        return driver.getCurrentUrl();
    }

    public boolean isTitleVisible(){
        return title.isDisplayed();
    }

    public boolean isVisibleFirstImage() {
        waitForPageToLoad(columnImages);
        waitForVisibleElement(title);
        if (columnImages.size() != 0){
            try{
                scroll(columnImages.get(0));
                return columnImages.get(0).isDisplayed();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }

        return false;
    }

    public boolean isVisibleSecondImage() {
        waitForPageToLoad(columnImages);
        waitForVisibleElement(title);
        if (columnImages.size() != 0){
            try{
                scroll(columnImages.get(1));
                return columnImages.get(1).isDisplayed();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }

        return false;
    }

    public boolean isVisibleThirdImage() {
        waitForPageToLoad(columnImages);
        waitForVisibleElement(title);
        if (columnImages.size() != 0){
            try{
                scroll(columnImages.get(2));
                return columnImages.get(2).isDisplayed();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }

        return false;
    }

    public boolean isVisibleFourthImage() {
        waitForPageToLoad(columnImages);
        waitForVisibleElement(title);
        if (columnImages.size() != 0){
            try{
                scroll(columnImages.get(3));
                return columnImages.get(3).isDisplayed();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }

        return false;
    }

    public boolean isVisibleFifthImage() {
        waitForPageToLoad(columnImages);
        waitForVisibleElement(title);
        if (columnImages.size() != 0){
            try{
                scroll(columnImages.get(4));
                return columnImages.get(4).isDisplayed();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }

        return false;
    }

    public boolean isVisibleSixthImage() {
        waitForPageToLoad(columnImages);
        waitForVisibleElement(title);
        if (columnImages.size() != 0){
            try{
                scroll(columnImages.get(5));
                return columnImages.get(5).isDisplayed();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }

        return false;
    }

    public boolean isVisibleSeventhImage() {
        waitForPageToLoad(columnImages);
        waitForVisibleElement(title);
        if (columnImages.size() != 0){
            try{
                scroll(columnImages.get(6));
                return columnImages.get(6).isDisplayed();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }

        return false;
    }

    public boolean isVisibleEighthImage() {
        waitForPageToLoad(columnImages);
        waitForVisibleElement(title);
        if (columnImages.size() != 0){
            try{
                scroll(columnImages.get(7));
                return columnImages.get(7).isDisplayed();
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }
        return false;
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
        waitForPageToLoad(columnTitle);
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

    public void a(){
        clickWithWait(columnTitle.get(1));
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

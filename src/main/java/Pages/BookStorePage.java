package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    @FindBy(className = "rt-td")
    private List<WebElement> bookData;

    public BookStorePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void scrollToSearchBar(){
        waitForVisibleElement(searchBox);
        scroll(searchBox);
    }

    public void scrollToFirstRow(){
        try {
            waitForVisibleElement(bookRow.get(0));
            scroll(bookRow.get(0));
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    public void scrollToSecondRow(){
        try {
            waitForVisibleElement(bookRow.get(1));
            scroll(bookRow.get(1));
        }catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void scrollToThirdRow(){
        try {
            waitForVisibleElement(bookRow.get(2));
            scroll(bookRow.get(2));
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }

    public void scrollToFourthRow(){
        try {
            waitForVisibleElement(bookRow.get(3));
            scroll(bookRow.get(3));
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }

    public void scrollToFifthRow(){
        try {
            waitForVisibleElement(bookRow.get(4));
            scroll(bookRow.get(4));
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }

    public void scrollToSixthRow(){
        try{
            waitForVisibleElement(bookRow.get(5));
            scroll(bookRow.get(5));
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }

    public void scrollToSeventhRow(){
        try{
            waitForVisibleElement(bookRow.get(6));
            scroll(bookRow.get(6));
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }

    public void typeOnSearchBar(String text){
        searchBox.sendKeys(text);
    }

    public String getSearchBarPlaceholder(){
        return searchBox.getAttribute("placeholder");
    }

    public String getFirstTitleTableText(){
        waitForVisibleElement(tableTitles.get(0));
        try{
            return tableTitles.get(0).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getSecondTitleTableText(){
        waitForVisibleElement(tableTitles.get(0));
        try{
            return tableTitles.get(1).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getThirdTitleTableText() throws InterruptedException {
        Thread.sleep(2000);
        try{
            return tableTitles.get(2).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getFourthTitleTableText(){
        try{
            return tableTitles.get(3).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getTitleOfFirstBookText(){
        try{
            return bookData.get(1).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getAuthorOfFirstBookText(){
        try{
            return bookData.get(2).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getPublisherOfFirstBookText(){
        try{
            return bookData.get(3).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getTitleOfSecondBookText(){
        try{
            return bookData.get(5).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getAuthorOfSecondBookText(){
        try{
            return bookData.get(6).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getPublisherOfSecondBookText(){
        try{
            return bookData.get(7).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getTitleOfThirdBookText(){
        try{
            return bookData.get(9).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getAuthorOfThirdBookText(){
        try{
            return bookData.get(10).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getPublisherOfThirdBookText(){
        try{
            return bookData.get(11).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getTitleOfFourthBookText(){
        try{
            return bookData.get(13).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getAuthorOfFourthBookText(){
        try{
            return bookData.get(14).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getPublisherOfFourthBookText(){
        try{
            return bookData.get(15).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getTitleOfFifthBookText(){
        try{
            return bookData.get(17).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getAuthorOfFifthBookText(){
        try{
            return bookData.get(18).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getPublisherOfFifthBookText(){
        try{
            return bookData.get(19).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return bookData.get(19).getText();
    }

    public String getTitleOfSixthBookText(){
        try{
            return bookData.get(21).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getAuthorOfSixthBookText(){
        try{
            return bookData.get(22).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getPublisherOfSixthBookText(){
        try{
            return bookData.get(23).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getTitleOfSeventhBookText(){
        try{
            return bookData.get(25).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getAuthorOfSeventhBookText(){
        try{
            return bookData.get(26).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getPublisherOfSeventhBookText(){
        try{
            return bookData.get(27).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getTitleOfEighthBookText(){
        try{
            return bookData.get(29).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getAuthorOfEighthBookText(){
        try{
            return bookData.get(30).getText();
        }catch (IndexOutOfBoundsException e){
            return "an error has happened" + e.getMessage();
        }
    }

    public String getPublisherOfEighthBookText(){
        try{
            return bookData.get(31).getText();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return "an error has happened";
    }

    public String getBookStoreUrlText(){
        return driver.getCurrentUrl();
    }

    public boolean isTitleVisible(){
        return title.isDisplayed();
    }

    public boolean isVisibleFirstImage(){
        try{
            return bookData.get(0).isDisplayed();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean isVisibleSecondImage(){
        try{
            return bookData.get(4).isDisplayed();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean isVisibleThirdImage(){
        try{
            return bookData.get(8).isDisplayed();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean isVisibleFourthImage(){
        try{
            return bookData.get(12).isDisplayed();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean isVisibleFifthImage(){
        try{
            return bookData.get(16).isDisplayed();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean isVisibleSixthImage(){
        try{
            return bookData.get(20).isDisplayed();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean isVisibleSeventhImage(){
        try{
            return bookData.get(24).isDisplayed();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean isVisibleEighthImage(){
        try{
            return bookData.get(28).isDisplayed();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
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

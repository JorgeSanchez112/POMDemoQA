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

    public int getSizeSections(){
        return deployed_form_exercise.size();
    }

    public BSLoginPage clickOnLoginTab(){
        scroll(deployed_form_exercise.get(0));
        deployed_form_exercise.get(0).click();
        return new BSLoginPage(driver);
    }

    public void clickOnProfile(){
        deployed_form_exercise.get(2).click();
    }

    public void clickOnBookstoreApi(){
        deployed_form_exercise.get(3).click();
    }

    public void scrollToFirstRow(){
        scroll(bookRow.get(0));
    }

    public void scrollToSecondRow(){
        scroll(bookRow.get(1));
    }

    public void scrollToThirdRow(){
        scroll(bookRow.get(2));
    }

    public void scrollToFourthRow(){
        scroll(bookRow.get(3));
    }

    public void scrollToFifthRow(){
        scroll(bookRow.get(4));
    }

    public void scrollToSixthRow(){
        scroll(bookRow.get(5));
    }

    public void scrollToSeventhRow(){
        scroll(bookRow.get(6));
    }

    public boolean isTitleVisible(){
        return title.isDisplayed();
    }

    public void typeOnSearchBar(String text){
        searchBox.sendKeys(text);
    }

    public String getFirstTitleTableText(){
        return tableTitles.get(0).getText();
    }

    public String getSecondTitleTableText(){
        return tableTitles.get(1).getText();
    }

    public String getThirdTitleTableText(){
        return tableTitles.get(2).getText();
    }

    public String getFourthTitleTableText(){
        return tableTitles.get(3).getText();
    }

    public boolean isVisibleFirstImage(){
        return bookData.get(0).isDisplayed();
    }

    public String getTitleOfFirstBookText(){
        return bookData.get(1).getText();
    }

    public String getAuthorOfFirstBookText(){
        return bookData.get(2).getText();
    }

    public String getPublisherOfFirstBookText(){
        return bookData.get(3).getText();
    }

    public boolean isVisibleSecondImage(){
        return bookData.get(4).isDisplayed();
    }

    public String getTitleOfSecondBookText(){
        return bookData.get(5).getText();
    }

    public String getAuthorOfSecondBookText(){
        return bookData.get(6).getText();
    }

    public String getPublisherOfSecondBookText(){
        return bookData.get(7).getText();
    }

    public boolean isVisibleThirdImage(){
        return bookData.get(8).isDisplayed();
    }

    public String getTitleOfThirdBookText(){
        return bookData.get(9).getText();
    }

    public String getAuthorOfThirdBookText(){
        return bookData.get(10).getText();
    }

    public String getPublisherOfThirdBookText(){
        return bookData.get(11).getText();
    }

    public boolean isVisibleFourthImage(){
        return bookData.get(12).isDisplayed();
    }

    public String getTitleOfFourthBookText(){
        return bookData.get(13).getText();
    }

    public String getAuthorOfFourthBookText(){
        return bookData.get(14).getText();
    }

    public String getPublisherOfFourthBookText(){
        return bookData.get(15).getText();
    }

    public boolean isVisibleFifthImage(){
        return bookData.get(16).isDisplayed();
    }

    public String getTitleOfFifthBookText(){
        return bookData.get(17).getText();
    }

    public String getAuthorOfFifthBookText(){
        return bookData.get(18).getText();
    }

    public String getPublisherOfFifthBookText(){
        return bookData.get(19).getText();
    }

    public boolean isVisibleSixthImage(){
        return bookData.get(20).isDisplayed();
    }

    public String getTitleOfSixthBookText(){
        return bookData.get(21).getText();
    }

    public String getAuthorOfSixthBookText(){
        return bookData.get(22).getText();
    }

    public String getPublisherOfSixthBookText(){
        return bookData.get(23).getText();
    }

    public boolean isVisibleSeventhImage(){
        return bookData.get(24).isDisplayed();
    }

    public String getTitleOfSeventhBookText(){
        return bookData.get(25).getText();
    }

    public String getAuthorOfSeventhBookText(){
        return bookData.get(26).getText();
    }

    public String getPublisherOfSeventhBookText(){
        return bookData.get(27).getText();
    }

    public boolean isVisibleEighthImage(){
        return bookData.get(28).isDisplayed();
    }

    public String getTitleOfEighthBookText(){
        return bookData.get(29).getText();
    }

    public String getAuthorOfEighthBookText(){
        return bookData.get(30).getText();
    }

    public String getPublisherOfEighthBookText(){
        return bookData.get(31).getText();
    }

}

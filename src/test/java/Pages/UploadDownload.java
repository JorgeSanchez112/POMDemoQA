package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadDownload extends BasePages {
    @FindBy(id = "downloadButton")
    WebElement downloadButton;

    @FindBy(id = "uploadFile")
    WebElement uploadFileButton;

    @FindBy(id = "uploadedFilePath")
    WebElement FilePathText;

    public UploadDownload(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnDownloadButton(){
        downloadButton.click();
    }

    public void searchFileInSelectFile(){
        uploadFileButton.sendKeys("C:\\Users\\Jorge\\Downloads\\sampleFile.jpeg");
    }

    public String getFilePathText(){
        return FilePathText.getText();
    }

    public String getNameDownloadedFile(){
        return "C:\\fakepath\\" + downloadButton.getAttribute("download");
    }


}
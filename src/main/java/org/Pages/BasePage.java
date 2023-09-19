package org.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Hello world!
 *
 */
public class BasePage {
    @FindBy (className = "top-card")
    List<WebElement> sections;

    static WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public void goTo(){
        driver.get("https://demoqa.com/");
    }

    public void clickOnSectionElements(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sections.get(0));
        sections.get(0).click();
    }
}

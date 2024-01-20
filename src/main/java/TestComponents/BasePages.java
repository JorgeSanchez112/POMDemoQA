package TestComponents;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BasePages {

    protected final WebDriver driver;

    private HttpURLConnection http;
    private int responseCode = 200;

    public BasePages(WebDriver driver) {
        this.driver = driver;
    }

    public void backToPage(){
        driver.navigate().back();
    }

    public void scroll(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void hidePublicity(WebElement element){
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'none';", element);
        }catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

    }

    public void waitForClick(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementContainRedRGBValue(WebElement element, String attribute){
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.attributeContains(element,attribute,"rgb(220, 53, 69)"));
        }catch (TimeoutException e){
            e.printStackTrace();
        }
    }

    public void waitForElementContainGreenRGBValue(WebElement element, String attribute){
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.attributeContains(element,attribute,"rgb(40, 167, 69)"));
        }catch (TimeoutException e){
            e.printStackTrace();
        }
    }

    public void waitForElementContainRedRGBAValue(WebElement element, String attribute){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.attributeContains(element,attribute,"rgba(220, 53, 69, 1)"));
        }catch (TimeoutException e){
            e.printStackTrace();
        }
    }

    public void waitForAttributeAriaDescribedbyEqualToValue(WebElement element, String value){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeContains(element,"aria-describedby", value));
    }

    public void waitForEnableElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForVisibleElement(WebElement element){
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));
        }catch (TimeoutException e){
            e.printStackTrace();
        }
    }

    public void waitForPresenceToElement(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
    }

    public void waitForPageToLoad(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete';"));
    }

    public void waitAlert(){
        try {
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
            wait.until(ExpectedConditions.alertIsPresent());
        }catch (TimeoutException e){
            e.printStackTrace();
        }

    }

    public void clickWithWait(WebElement element){
        try {
            waitForVisibleElement(element);
            try {
                try{
                    waitForClick(element);
                    element.click();
                }catch (NoSuchElementException e){
                    e.printStackTrace();
                }

            }catch (ElementClickInterceptedException e){
                e.printStackTrace();
            }
        }catch (StaleElementReferenceException e){
            e.printStackTrace();
        }
    }

    public void switchToTab(){
        String mainWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public boolean isListItemSelected(WebElement listItem) {
        String expectedClass = "active";
        String actualClass = listItem.getAttribute("class");
        return actualClass.contains(expectedClass);
    }

    public boolean isElementDropped(WebElement listItem) {
        String expectedClass = "ui-state-highlight";
        String actualClass = listItem.getAttribute("class");
        return actualClass.contains(expectedClass);
    }

    public int searchNumberOne(List<WebElement> dateOfDaysList){
        for (int i = 0; i<= dateOfDaysList.size(); i++){
            if (Objects.equals(dateOfDaysList.get(i).getText(), "1")){
                return i;
            }
        }
        return dateOfDaysList.size();
    }

    public List<WebElement> addElementsToList(List<WebElement> daysList){
        int index = searchNumberOne(daysList);
        ArrayList<WebElement> arrayNormalized = new ArrayList<>();

        for (int i = index; i < daysList.size(); i++) {
            arrayNormalized.add(daysList.get(i));
        }

        return arrayNormalized;
    }

    public void selectListValue(List<WebElement> list, String valueToSearch){
        int sizeList = list.size();
        int x = 0;

        for (WebElement values: list) {
            x ++;
            try {
                if (Objects.equals(values.getText(), valueToSearch)){
                    scroll(values);
                    clickWithWait(values);
                    x--;
                    break;
                } else if (x == sizeList) {
                    System.out.println("value does not available");
                }
            }catch (StaleElementReferenceException e){
                e.printStackTrace();
            }
        }
    }

    public void selectDay(List<WebElement> daysaList, String day){
        int sizeList = daysaList.size();
        int x = 0;
        for (WebElement daysOfList: addElementsToList(daysaList)) //one method is applied that return one list of days ordered.
        {
            x ++;
            try {
                if (Objects.equals(daysOfList.getText(), day)){
                    clickWithWait(daysOfList);
                    x--;
                    break;
                }else if (x == sizeList){
                    System.out.println("day does not exist");
                }
            }catch (StaleElementReferenceException e){
                System.out.println(e.getMessage());
            }

        }
    }

    public void doubleClick(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element)
                .doubleClick()
                .build()
                .perform();
    }

    public void rightClick(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element)
                .contextClick()
                .build()
                .perform();
    }

    public void moveElementToCoordinates(WebElement element, int xCoordinate, int yCoordinate){
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(element, xCoordinate, yCoordinate)
                .build()
                .perform();
    }

    public void moveClickerToElement(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element)
                .build()
                .perform();
    }

    public void dragDropMoveElementToTarget(WebElement sourceElement, WebElement targetElement){
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement, targetElement)
                .build()
                .perform();
    }

    public void resizeElement(WebElement element, int sizeX, int sizeY){
        Actions actions = new Actions(driver);
        try {
            actions.clickAndHold(element)
                    .moveByOffset(sizeX, sizeY)
                    .release()
                    .build()
                    .perform();
        }catch (MoveTargetOutOfBoundsException e){
            e.printStackTrace();
        }

    }

    public boolean validateHTTPS_Response(String src) throws IOException {
        http = (HttpURLConnection) (new URL(src).openConnection());
        http.setRequestMethod("HEAD");
        http.connect();

        responseCode = http.getResponseCode();

        return responseCode == 200;
    }
}
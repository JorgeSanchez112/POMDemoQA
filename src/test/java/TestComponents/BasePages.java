package TestComponents;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    public void scroll(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void hidePublicity(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'none';", element);
    }

    public void waitForClick(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForCSS(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeContains(element,"border-color","rgb(220, 53, 69)"));
    }

    public void waitForEnableElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForVisibleElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementMinute(WebElement element, int minutes){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(minutes));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void selectOneRadioButton(List<WebElement> listElements, String nameRadioButton){
        int sizeList = listElements.size();
        int x = 0;
        for (WebElement genders :listElements) {
            x ++;
            if (Objects.equals(genders.getText(), nameRadioButton)){
                    scroll(genders);
                    genders.click();
                    x--;
            }else if (x == sizeList){
                System.out.println("name of radio button doesn't exist");
            }
        }
    }

    public void selectYear(List<WebElement> yearsList, String year){
        int sizeList = yearsList.size();
        int x = 0;
        for (WebElement years :yearsList) {
            x ++;
            if (Objects.equals(years.getText(), year)){
                years.click();
                x--;
            }else if (x == sizeList){
                System.out.println("name of radio button doesn't exist");
            }
        }
    }

    public void selectMonth(List<WebElement> listMonths, String nameMonth){
        int sizeList = listMonths.size();
        int x = 0;
        for (WebElement months: listMonths) {
            x ++;
            if (Objects.equals(months.getText(), nameMonth)){
                months.click();
                x--;
            }else if (x == sizeList){
                System.out.println("month does not available");
            }
        }
    }

    public void selectDay(List<WebElement> daysaList, String day){
        int sizeList = daysaList.size();
        int x = 0;
        for (WebElement daysOfList: addElementsToList(daysaList)) {
            x ++;
            try {
                if (Objects.equals(daysOfList.getText(), day)){

                    waitForClick(daysOfList);
                    daysOfList.click();
                    x--;
                }else if (x == sizeList){
                    System.out.println("day does not exist");
                }
            }catch (Exception e){
                System.out.println("could be: stale element reference: stale element not found");
                break;
            }

        }
    }

    public List<WebElement> addElementsToList(List<WebElement> daysList){
        int index = searchNumberOne(daysList);
        ArrayList<WebElement> arrayNormalized = new ArrayList<>();

        for (int i = index; i < daysList.size(); i++) {
            arrayNormalized.add(daysList.get(i));
        }

        return arrayNormalized;
    }

    public int searchNumberOne(List<WebElement> dateOfDaysList){
        for (int i = 0; i<= dateOfDaysList.size(); i++){
            if (Objects.equals(dateOfDaysList.get(i).getText(), "1")){
                return i;
            }
        }
        return dateOfDaysList.size();
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

    public boolean validateHTTPS_Response(String src) throws IOException {
        http = (HttpURLConnection) (new URL(src).openConnection());
        http.setRequestMethod("HEAD");
        http.connect();

        responseCode = http.getResponseCode();

        if (responseCode == 200){
            return true;
        }else {
            return false;
        }
    }
}

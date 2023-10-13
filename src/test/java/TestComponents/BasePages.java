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

package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DraggablePage extends BasePages {
    @FindBy(id = "draggableExample-tab-simple ")
    private WebElement tabSimple;
    @FindBy(id = "draggableExample-tab-axisRestriction")
    private WebElement tabAxisRestricted;
    @FindBy(id = "draggableExample-tab-containerRestriction")
    private WebElement tabContainerRestricted;
    @FindBy(id = "draggableExample-tab-cursorStyle")
    private WebElement tabCursorStyle;
    @FindBy(id = "dragBox")
    private WebElement simpleBox;
    @FindBy(id = "restrictedX")
    private WebElement restrictedXBox;
    @FindBy(id = "restrictedY")
    private WebElement restrictedYBox;
    @FindBy(css = "#containmentWrapper > div")
    private WebElement containedBox;
    @FindBy(css = "#draggableExample-tabpane-containerRestriction >* > span")
    private WebElement containedText;
    @FindBy(id = "cursorCenter")
    private WebElement centerStyleCursor;
    @FindBy(id = "cursorTopLeft")
    private WebElement topLeftStyleCursor;
    @FindBy(id = "cursorBottom")
    private WebElement BottomStyleCursor;

    public DraggablePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnTabSimple(){
        tabSimple.click();
    }

    public void clickOnTabAxisRestricted(){
        tabAxisRestricted.click();
    }

    public void clickOnTabContainerRestricted(){
        tabContainerRestricted.click();
    }

    public void clickOnTabCursorStyle(){
        tabCursorStyle.click();
    }

    public void moveSimpleElement(){
        moveElementToCoordinates(simpleBox,10, 10);
    }

    public void moveXElement(){
        moveElementToCoordinates(restrictedXBox,50, 0);
    }

    public void moveYElement(){
        moveElementToCoordinates(restrictedYBox,0,50);
    }

    public void moveContainedBox(){
        moveElementToCoordinates(containedBox, 20, 100);
    }

    public void moveContainedText(){
        moveElementToCoordinates(containedText, 1,10);
    }

    public String getSimpleBoxXPosition(){
        return simpleBox.getCssValue("left");
    }

    public String getSimpleBoxYPosition(){
        return simpleBox.getCssValue("top");
    }

    public Point getRestrictedXBoxPosition(){
        return simpleBox.getLocation();
    }

    public Point getRestrictedYBoxPosition(){
        return simpleBox.getLocation();
    }

    public Point getContainedBoxPosition(){
        return simpleBox.getLocation();
    }

    public Point getContainedTextPosition(){
        return simpleBox.getLocation();
    }

}

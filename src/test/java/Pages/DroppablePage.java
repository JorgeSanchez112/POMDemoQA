package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DroppablePage extends BasePages {
    @FindBy(id = "droppableExample-tab-simple")
    WebElement tabSimple;
    @FindBy(id = "droppableExample-tab-accept")
    WebElement tabAccept;
    @FindBy(id = "droppableExample-tab-preventPropogation")
    WebElement tabPreventPropogation;
    @FindBy(id = "droppableExample-tab-revertable")
    WebElement tabRevert;
    @FindBy(id = "draggable")
    WebElement draggable;
    @FindBy(id = "droppable")
    WebElement simpleTarget;
    @FindBy(id = "acceptable")
    WebElement dragAcceptable;
    @FindBy(id = "notAcceptable")
    WebElement dragNotAcceptable;
    @FindBy(css = "#droppableExample-tabpane-accept >* #droppable")
    WebElement acceptTarget;
    @FindBy(id = "dragBox")
    WebElement dragPrevent;
    @FindBy(id = "notGreedyDropBox")
    WebElement notGreedyTarget;
    @FindBy(id = "notGreedyInnerDropBox")
    WebElement notGreedyInnerTarget;
    @FindBy(id = "greedyDropBox")
    WebElement greedyTarget;
    @FindBy(css = "#greedyDropBox > p")
    WebElement greedyTargetSubtitle;
    @FindBy(id = "greedyDropBoxInner")
    WebElement greedyInnerTarget;
    @FindBy(id = "revertable")
    WebElement dragRevertable;
    @FindBy(id = "notRevertable")
    WebElement dragNotRevertable;
    @FindBy(css = "#droppableExample-tabpane-revertable >* #droppable")
    WebElement revertTarget;

    public DroppablePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnTabSimple(){
        tabSimple.click();
    }

    public void clickOnTabAccept(){
        tabAccept.click();
    }

    public void clickOnTabPrevent(){
        tabPreventPropogation.click();
    }

    public void clickOnTabRevert(){
        tabRevert.click();
    }

    public void moveSimpleDraggableToTarget(){
        dragDropMoveElementToTarget(draggable,simpleTarget);
    }

    public void moveDraggableAcceptableToTarget(){
        scroll(dragAcceptable);
        dragDropMoveElementToTarget(dragAcceptable,acceptTarget);
    }

    public void moveDraggableNotAcceptableToTarget(){
        scroll(dragNotAcceptable);
        dragDropMoveElementToTarget(dragNotAcceptable,acceptTarget);
    }

    public void movePreventDraggableToNotGreedyTarget(){
        scroll(notGreedyTarget);
        dragDropMoveElementToTarget(dragPrevent,notGreedyTarget);
    }

    public void movePreventDraggableToNotGreedyInnerTarget(){
        scroll(dragPrevent);
        dragDropMoveElementToTarget(dragPrevent,notGreedyInnerTarget);
    }

    public void movePreventDraggableToGreedyTarget(){
        scroll(greedyTarget);
        dragDropMoveElementToTarget(dragPrevent,greedyTargetSubtitle);
    }

    public void movePreventDraggableToGreedyInnerTarget(){
        scroll(greedyInnerTarget);
        dragDropMoveElementToTarget(dragPrevent,greedyInnerTarget);
    }

    public void moveRevertDraggableToTarget(){
        dragDropMoveElementToTarget(dragRevertable,revertTarget);
    }

    public void moveNoRevertDraggableToTarget(){
        scroll(dragNotRevertable);
        dragDropMoveElementToTarget(dragNotRevertable,revertTarget);
    }

    public boolean isSimpleDraggableDropped(){
        return isElementDropped(simpleTarget);
    }

    public boolean isAcceptDraggableDropped(){
        return isElementDropped(acceptTarget);
    }

    public boolean isNotAcceptDraggableDropped(){
        return isElementDropped(acceptTarget);
    }

    public boolean isPreventDraggableToNotGreedyDropped(){
        return isElementDropped(notGreedyTarget);
    }

    public boolean isPreventDraggableToNotGreedyInnerDropped(){
        return isElementDropped(notGreedyInnerTarget);
    }

    public boolean isPreventDraggableToGreedyDropped(){
        return isElementDropped(greedyTarget);
    }

    public boolean isPreventDraggableToGreedyInnerDropped(){
        return isElementDropped(greedyInnerTarget);
    }

    public boolean isNotRevertDraggableDropped(){
        return isElementDropped(revertTarget);
    }

}

package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTablesPage extends BasePages {
    @FindBy (id = "addNewRecordButton")
    private WebElement addButton;
    @FindBy (id = "searchBox")
    private  WebElement searchBox;
    @FindBy (id = "delete-record-1")
    private WebElement deleteFirstRow;
    @FindBy (id = "delete-record-2")
    private WebElement deleteSecondRow;
    @FindBy (id = "delete-record-3")
    private WebElement deleteThirdRow;
    @FindBy (css = ".rt-tr-group:nth-child(1) > .rt-tr > .rt-td")
    private List<WebElement> fourthRowFields;
    @FindBy (className = "rt-noData")
    private WebElement noData;
    @FindBy (id = "firstName")
    private WebElement firstNameForm;
    @FindBy (id = "lastName")
    private WebElement lastNameForm;
    @FindBy (id = "userEmail")
    private WebElement emailForm;
    @FindBy (id = "age")
    private WebElement ageForm;
    @FindBy (id = "salary")
    private WebElement salaryForm;
    @FindBy (id = "department")
    private WebElement departmentForm;
    @FindBy (id = "submit")
    private WebElement submitButton;

    public WebTablesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnAddButton(){
        addButton.click();
    }

    public void clickOnDeleteFirstRow(){
        deleteFirstRow.click();
    }

    public void clickOnDeleteSecondRow(){
        deleteSecondRow.click();
    }

    public void clickOnSubmitButton(){
        submitButton.click();
    }

    public void clickOnDeleteThirdRow(){
        scroll(deleteThirdRow);
        deleteThirdRow.click();
    }

    public String getTextOfMessage(){
        return noData.getText();
    }

    public void fillFirstName(String name){
        firstNameForm.sendKeys(name);
    }

    public void fillLastName(String lastName){
        lastNameForm.sendKeys(lastName);
    }

    public void fillEmail(String email){
        emailForm.sendKeys(email);
    }

    public void fillAge(String age){
        ageForm.sendKeys(age);
    }

    public void fillSalary(String salary){
        salaryForm.sendKeys(salary);
    }

    public void fillDepartment(String department){
        departmentForm.sendKeys(department);
    }

    public String getFirstName(){
       return fourthRowFields.get(0).getText();
    }

    public String getLastName(){
        return fourthRowFields.get(1).getText();
    }

    public String getAge(){
        return fourthRowFields.get(2).getText();
    }

    public String getEmail(){
        return fourthRowFields.get(3).getText();
    }

    public String getSalary(){
        return fourthRowFields.get(4).getText();
    }

    public String getDepartment(){
        return fourthRowFields.get(5).getText();
    }

}

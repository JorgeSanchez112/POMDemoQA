package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTablesPage extends BasePages {

    @FindBy (id = "addNewRecordButton")
    WebElement addButton;

    @FindBy (id = "searchBox")
    WebElement searchBox;

    @FindBy (id = "delete-record-1")
    WebElement deleteFirstRow;

    @FindBy (id = "delete-record-2")
    WebElement deleteSecondRow;

    @FindBy (id = "delete-record-3")
    WebElement deleteThirdRow;

    @FindBy (css = ".rt-tr-group:nth-child(1) > .rt-tr > .rt-td")
    List<WebElement> fourthRowFields;

    @FindBy (className = "rt-noData")
    WebElement noData;


    @FindBy (id = "firstName")
    WebElement firstNameForm;

    @FindBy (id = "lastName")
    WebElement lastNameForm;

    @FindBy (id = "userEmail")
    WebElement emailForm;

    @FindBy (id = "age")
    WebElement ageForm;

    @FindBy (id = "salary")
    WebElement salaryForm;

    @FindBy (id = "department")
    WebElement departmentForm;

    @FindBy (id = "submit")
    WebElement submitButton;

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

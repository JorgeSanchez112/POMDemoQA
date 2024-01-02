package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DatePickerPage extends BasePages {
    @FindBy(id = "datePickerMonthYearInput")
    private WebElement dateInput;
    @FindBy(css = ".react-datepicker__month-select > option")
    private List<WebElement> monthOfDateInput;
    @FindBy(css = ".react-datepicker__year-select > option")
    private List<WebElement> yearOfDateInput;
    @FindBy(className = "react-datepicker__day")
    private List<WebElement> days;
    @FindBy(id = "dateAndTimePickerInput")
    private WebElement dateAndTimeInput;
    @FindBy(className = "react-datepicker__month-dropdown-container")
    private WebElement monthContainer;
    @FindBy(className = "react-datepicker__month-option")
    private List<WebElement> monthsOfDateTimeInput;
    @FindBy(className = "react-datepicker__year-dropdown-container")
    private WebElement yearDateTimeContainer;
    @FindBy(className = "react-datepicker__year-option")
    private List<WebElement> yearsOfDateTimeInput;
    @FindBy(className = "react-datepicker__time-list-item")
    private List<WebElement> timeOfDateTimeInput;

    public DatePickerPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickOnDateInput(){
        dateInput.click();
    }

    public void clickOnDateAndTimeInput(){
        dateAndTimeInput.click();
    }

    public void selectDate(String month, String day, String year){
        selectMonth(monthOfDateInput,month);
        selectYear(yearOfDateInput,year);
        selectDay(days,day);
    }

    public void selectDateAndTime(String month, String day, String year, String time){
        monthContainer.click();
        selectMonth(monthsOfDateTimeInput,month);
        yearDateTimeContainer.click();
        selectYear(yearsOfDateTimeInput,year);
        selectDay(days,day);
        selectTime(timeOfDateTimeInput,time);
    }

    public String getDateValueText(){
        return dateInput.getAttribute("value");
    }

    public String getDateTimeValueText(){
        return dateAndTimeInput.getAttribute("value");
    }

}

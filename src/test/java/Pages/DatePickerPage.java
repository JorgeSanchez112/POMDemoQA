package Pages;

import TestComponents.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DatePickerPage extends BasePages {
    @FindBy(id = "datePickerMonthYearInput")
    WebElement dateInput;
    @FindBy(css = ".react-datepicker__month-select > option")
    List<WebElement> monthOfDateInput;
    @FindBy(css = ".react-datepicker__year-select > option")
    List<WebElement> yearOfDateInput;
    @FindBy(className = "react-datepicker__day")
    List<WebElement> days;
    @FindBy(id = "dateAndTimePickerInput")
    WebElement dateAndTimeInput;
    @FindBy(className = "react-datepicker__month-dropdown-container")
    WebElement monthContainer;
    @FindBy(className = "react-datepicker__month-option")
    List<WebElement> monthsOfDateTimeInput;
    @FindBy(className = "react-datepicker__year-dropdown-container")
    WebElement yearDateTimeContainer;
    @FindBy(className = "react-datepicker__year-option")
    List<WebElement> yearsOfDateTimeInput;
    @FindBy(className = "react-datepicker__time-list-item")
    List<WebElement> timeOfDateTimeInput;

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

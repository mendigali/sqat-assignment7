package com.example.bdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservationPage {
    @FindBy(xpath = "//input[@value=\"Business\"]")
    public WebElement businessClassElement;

    @FindBy(name = "findFlights")
    public WebElement findButton;


    public ReservationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void select_Business_Class() {
        businessClassElement.click();
    }

    public void click_Button_Reservation() {
        findButton.click();
    }
}
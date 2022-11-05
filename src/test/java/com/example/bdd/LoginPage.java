package com.example.bdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(name = "userName")
    public WebElement userName;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(name = "submit")
    public WebElement submitButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void login() {
        submitButton.click();
    }

    public void entering_credentials(String username, String password) {
        userName.sendKeys(username);
        passwordInput.sendKeys(password);
    }
}
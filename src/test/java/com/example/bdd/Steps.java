package com.example.bdd;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Steps {

    private WebDriver driver;

    private LoginPage loginPage;
    private ReservationPage reservationPage;

    @Given("Open the Google Chrome and launch the application")
    public void open_the_google_chrome_and_launch_the_application() {
        System.out.println("Google Chrome launched");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage = new LoginPage(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Opening url");
        driver.get(url);
    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Entering email and password");
        loginPage.entering_credentials(username, password);

    }

    @When("Clicks on Login")
    public void clicks_on_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Entering to the website clicking Login");
        loginPage.login();
    }

    @Then("Close Browser")
    public void close_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Ending operation, closing browser");
        driver.quit();
    }

    @Given("Open the Google Chrome and open Website")
    public void open_the_Google_and_open_website() {
        System.out.println("Opening website");
        System.out.println("Google Chrome launched");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        reservationPage = new ReservationPage(driver);
    }

    @When("Opens URL {string}")
    public void opens_url_new(String url) {
        System.out.println("Opening Url website");
        driver.get(url);
    }

    @And("User selects Business Class")
    public void user_selects_business_class() {
        System.out.println("Selecting business class");
        reservationPage.select_Business_Class();

    }

    @And("User Continues reservation")
    public void user_continues_reservation() {
        System.out.println("Clicking find button");
        reservationPage.click_Button_Reservation();
    }

    @Then("Ending Reservation")
    public void ending_reservation() {
        System.out.println("Ending Reservation");
        driver.quit();
    }
}

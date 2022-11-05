Feature: Login
  Scenario: Successful Login
    Given Open the Google Chrome and launch the application
    When User opens URL "https://demo.guru99.com/test/newtours/index.php"
    And User enters Email as "user@gmail.com" and Password as "user"
    And Clicks on Login
    Then Close Browser

package org.SchoolAppProject2025.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set up your WebDriver here (assuming Chrome for example)
        System.setProperty("webdriver.chrome.driver", "C:/Users/Aridunnu/Documents/School App Project/src/main/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qatest.qafit.at/"); // Replace with your actual login page
    }


    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

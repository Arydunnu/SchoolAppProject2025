package org.SchoolAppProject2025.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;
import java.util.Map;

public class TestBase {
    protected static WebDriver driver;

    @BeforeMethod
    public static WebDriver setUp() {
        // Set up your WebDriver here (Using Chrome )
//        System.setProperty("webdriver.chrome.driver", "C:/Users/Aridunnu/Documents/School App Project/src/main/Drivers/chromedriver.exe");
//        driver = new ChromeDriver();

        // Set up your WebDriver here (Using firefox)
        System.setProperty("webdriver.gecko.driver", "C:/Users/Aridunnu/Documents/School App Project/src/main/Drivers/geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.get("https://qatest.qafit.at/"); // Replace with your actual login page
        return driver;

    }

    @AfterTest
    public void disableChrome() {
        ChromeOptions options = new ChromeOptions();

        // Disable Chrome password manager popup
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

    }




//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}

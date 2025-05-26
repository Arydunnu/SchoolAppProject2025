package org.SchoolAppProject2025;

import org.SchoolAppProject2025.Pages.AuthenticationPage;
import org.SchoolAppProject2025.Pages.RecordNamesPage;
import org.SchoolAppProject2025.Pages.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SchoolAppLoginTest extends TestBase{

    WebDriver driver;

    public void testLogin(){
        driver = TestBase.setUp();

        AuthenticationPage authenticationPage =new AuthenticationPage(driver);
        authenticationPage.inputUserName("testuser");
        authenticationPage.inputPassword("testpassword");
        authenticationPage.clickSubmitButton();







//        driver.quit();



    }

}

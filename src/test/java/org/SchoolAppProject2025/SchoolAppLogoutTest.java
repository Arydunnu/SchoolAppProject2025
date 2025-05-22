package org.SchoolAppProject2025;

import org.SchoolAppProject2025.Pages.AuthenticationPage;
import org.SchoolAppProject2025.Pages.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SchoolAppLogoutTest extends TestBase{

    WebDriver driver;
    @Test
    public void testLogout() {
        driver = TestBase.setUp();

        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        authenticationPage.inputUserName("testuser");
        authenticationPage.inputPassword("testpassword");
        authenticationPage.clickSubmitButton();
        authenticationPage.clickLogoutButton();

    }

}
